package com.xlkh.shiro.demo.service.sys;

import com.xlkh.shiro.demo.entity.sys.SysUser;

/**
 * 用户管理
 *
 * @author Lucas
 */
public interface SysUserService {


    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    SysUser getByUsername(String username);

}