package com.xlkh.shiro.demo.dao.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xlkh.shiro.demo.entity.sys.SysRoleDept;

import java.util.List;

/**
 * 
 * @author Lucas
 * @date 2019/09/25
 */
public interface SysRoleDeptDao extends BaseMapper<SysRoleDept> {


    /**
     * 根据角色ID，获取部门ID列表
     * @param roleId 角色ID
     * @return  部门ID列表
     */
    List<Long> getDeptIdList(Long roleId);

    /**
     * 获取用户的部门数据权限列表
     * @param userId 用户ID
     * @return  用户的部门数据权限ID列表
     */
    List<Long> getDataScopeList(Long userId);

    /**
     * 根据角色id，删除角色数据权限关系
     * @param roleId 角色id
     */
    void deleteByRoleId(Long roleId);

}
