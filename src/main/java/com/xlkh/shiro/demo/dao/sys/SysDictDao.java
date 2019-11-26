package com.xlkh.shiro.demo.dao.sys;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xlkh.shiro.demo.entity.sys.SysDict;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author Lucas
 * @date 2019/09/25
 */
public interface SysDictDao extends BaseMapper<SysDict> {
    /**
     * 修改字典类型
     * @param dictType  字典类型
     * @param pid       pid
     */
    void updateDictType(@Param("dictType") String dictType, @Param("pid") Long pid);
}
