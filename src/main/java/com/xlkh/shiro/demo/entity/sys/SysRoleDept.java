package com.xlkh.shiro.demo.entity.sys;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xlkh.shiro.demo.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @author Lucas
 * @date 2019/09/25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sys_role_dept")
public class SysRoleDept extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	/** 角色ID */
	private Long roleId;
	/** 部门ID */ 
	private Long deptId;

}
