package com.xlkh.shiro.demo.dao.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xlkh.shiro.demo.entity.sys.SysRoleUser;

import java.util.List;

/**
 * 
 * @author Lucas
 * @date 2019/09/25
 */
public interface SysRoleUserDao extends BaseMapper<SysRoleUser> {
    /**
     * 根据角色ids，删除角色用户关系
     * @param roleIds 角色ids
     */
    void deleteByRoleIds(Long[] roleIds);

    /**
     * 根据用户id，删除角色用户关系
     * @param userId 用户id
     */
    void deleteByUserId(Long userId);

    /**
     * 角色ID列表
     * @param userId  用户ID
     * @return 角色ID列表
     */
    List<Long> getRoleIdList(Long userId);
}
