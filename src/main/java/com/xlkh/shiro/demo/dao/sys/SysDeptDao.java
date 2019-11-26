package com.xlkh.shiro.demo.dao.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xlkh.shiro.demo.entity.sys.SysDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author Lucas
 * @date 2019/09/25
 */
@Mapper
public interface SysDeptDao extends BaseMapper<SysDept> {

    /**
     * 条件查询
     * @param params map
     * @return SysDept
     */
    List<SysDept> getList(Map<String, Object> params);

    /**
     * 根据ID查询部门
     * @param id ID
     * @return SysDept
     */
    SysDept getById(Long id);

    /**
     * 获取所有部门的id、pid列表
     * @return List<SysDept>
     */
    List<SysDept> getIdAndPidList();

    /**
     * 根据部门ID，获取所有子部门ID列表
     * @param id   部门ID
     * @return List<Long>
     */
    List<Long> getSubDeptIdList(String id);
}
