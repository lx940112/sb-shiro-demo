package com.xlkh.shiro.demo.dao.sys;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xlkh.shiro.demo.entity.sys.SysFunc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * @author Lucas
 * @date 2019/09/25
 */
public interface SysFuncDao extends BaseMapper<SysFunc> {

    /**
     * 根据ID查询功能对象
     * @param id 功能ID
     * @return SysFunc
     */
    SysFunc getById(@Param("id") Long id);

    /**
     * 查询所有菜单列表
     *
     * @param type 菜单类型
     * @return 所有菜单列表
     */
    List<SysFunc> getMenuList(@Param("type") Integer type);

    /**
     * 查询用户菜单列表
     * @param userId 用户ID
     * @param type 菜单类型
     * @return 子菜单
     */
    List<SysFunc> getUserMenuList(@Param("userId") Long userId, @Param("type") Integer type);

    /**
     * 根据父菜单，查询子菜单
     * @param pid  父菜单ID
     * @return 子菜单
     */
    List<SysFunc> getListPid(Long pid);

    /**
     * 获取所有资源列表
     * @return 所有资源列表
     */
    List<SysFunc> getResourceList();

    /**
     * 获取用户资源列表
     * @param userId 用户ID
     * @return 用户资源列表
     */
    List<SysFunc> getUserResourceList(@Param("userId") Long userId);
}
