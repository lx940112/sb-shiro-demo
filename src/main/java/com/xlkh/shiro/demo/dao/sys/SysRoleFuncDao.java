package com.xlkh.shiro.demo.dao.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xlkh.shiro.demo.entity.sys.SysRoleFunc;

import java.util.List;

/**
 * 
 * @author Lucas
 * @date 2019/09/25
 */
public interface SysRoleFuncDao extends BaseMapper<SysRoleFunc> {

    /**
     * 根据角色ID，获取菜单ID列表
     * @param roleId 角色ID
     * @return  菜单ID列表
     */
    List<Long> getMenuIdList(Long roleId);

    /**
     * 根据角色id，删除角色菜单关系
     * @param roleId 角色id
     */
    void deleteByRoleId(Long roleId);

    /**
     * 根据菜单id，删除角色菜单关系
     * @param menuId 菜单id
     */
    void deleteByMenuId(Long menuId);

}
