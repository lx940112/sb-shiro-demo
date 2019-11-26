package com.xlkh.shiro.demo.service.sys;

import java.util.Set;

/**
 * @author Lucas
 */
public interface SysFuncService {

    /**
     * 根据用户ID查询权限列表
     * @param userId 用户ID
     * @return 权限列表
     */
    Set<String> getPermissionCodesByUserId(Long userId);

}
