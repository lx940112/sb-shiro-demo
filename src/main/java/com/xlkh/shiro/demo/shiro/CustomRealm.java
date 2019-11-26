package com.xlkh.shiro.demo.shiro;

import com.xlkh.shiro.demo.dto.ActiveUser;
import com.xlkh.shiro.demo.entity.sys.SysUser;
import com.xlkh.shiro.demo.service.sys.SysFuncService;
import com.xlkh.shiro.demo.service.sys.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysFuncService sysFuncService;

    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }


    //告诉shiro如何根据获取到的用户信息中的密码和盐值来校验密码
    {
        //设置用于匹配密码的CredentialsMatcher
        HashedCredentialsMatcher hashMatcher = new HashedCredentialsMatcher();
        hashMatcher.setHashAlgorithmName(Sha256Hash.ALGORITHM_NAME);
        hashMatcher.setStoredCredentialsHexEncoded(false);
        hashMatcher.setHashIterations(1024);
        this.setCredentialsMatcher(hashMatcher);
    }

    /**
     * 权限
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        ActiveUser activeUser = (ActiveUser) principals.getPrimaryPrincipal();
        // 根据认证用户id查询该认证用户拥有的权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        Set<String> permissions = sysFuncService.getPermissionCodesByUserId(activeUser.getUserId());
        if(permissions != null && !permissions.isEmpty()){
            simpleAuthorizationInfo.addStringPermissions(permissions);
        }
        System.out.println("获取权限集合");
        return simpleAuthorizationInfo;
    }

    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        // token是用户输入的用户名和密码
        // 1.从token中取出用户名
        String userName = (String) token.getPrincipal();

        // 2.根据用户输入的userName从数据库查询
        SysUser sysUser = sysUserService.getByUsername(userName);

        // 如果查询不到返回null
        if (sysUser == null) {
            throw new UnknownAccountException("帐号或者密码有误");
        }

        // 帐号被锁定时
        if (SysUser.STATUS_LOCKED.equals(sysUser.getStatus())) {
            throw new LockedAccountException("您的帐号被锁定，请先联系管理员解锁");
        }

        // 从数据库查询到密码
        String password = sysUser.getPassword();

        // 如果查询到返回认证信息AuthenticationInfo

        // activeUser就是用户身份信息
        ActiveUser activeUser = new ActiveUser();
        activeUser.setUserId(sysUser.getId());
        activeUser.setUserName(userName);
        activeUser.setRealName(sysUser.getRealName());
        activeUser.setStatus(sysUser.getStatus());

        // 将activeUser设置simpleAuthenticationInfo
        return new SimpleAuthenticationInfo(activeUser, password,this.getName());
    }

    /**
     * 清除缓存
     */
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }
}
