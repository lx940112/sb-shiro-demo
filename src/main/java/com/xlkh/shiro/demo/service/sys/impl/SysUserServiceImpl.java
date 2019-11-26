package com.xlkh.shiro.demo.service.sys.impl;


import com.xlkh.shiro.demo.dao.sys.SysUserDao;
import com.xlkh.shiro.demo.entity.sys.SysUser;
import com.xlkh.shiro.demo.service.sys.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户管理
 *
 * @author lucas
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;


    @Override
    public SysUser getByUsername(String username) {
        return sysUserDao.getByUsername(username);
    }


}