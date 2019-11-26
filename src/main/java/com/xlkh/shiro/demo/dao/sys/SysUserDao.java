package com.xlkh.shiro.demo.dao.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xlkh.shiro.demo.entity.sys.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author Lucas
 * @date 2019/09/25
 */
public interface SysUserDao extends BaseMapper<SysUser> {

    /**
     * 条件查询
     * @param params map
     * @return  List<SysUser>
     */
    List<SysUser> getList(Map<String, Object> params);

    /**
     * 根据ID查询用户
     * @param id ID
     * @return SysUser
     */
    SysUser getById(Long id);

    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return SysUser
     */
    SysUser getByUsername(String username);

    /**
     * 根据用户ID修改密码
     * @param id    用户ID
     * @param newPassword   新密码
     * @return  影响行数
     */
    int updatePassword(@Param("id") Long id, @Param("newPassword") String newPassword);

    /**
     * 根据部门ID，查询用户数
     * @param deptId   部门ID
     * @return  用户数
     */
    int getCountByDeptId(Long deptId);
}
