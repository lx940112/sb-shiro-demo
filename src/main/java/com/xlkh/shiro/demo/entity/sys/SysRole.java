package com.xlkh.shiro.demo.entity.sys;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xlkh.shiro.demo.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 
 * @author Lucas
 * @date 2019/09/25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sys_role")
public class SysRole extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/** 角色名称 */ 
	private String roleName;
	/** 描述 */ 
	private String roleDesc;
	/** 删除标识:1-未删除; 0-删除 */
	@TableField(fill = FieldFill.INSERT)
	private Integer delFlag;
	/** 部门ID */
	@TableField(fill = FieldFill.INSERT)
	private Long deptId;
	/** 更新人 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Long updateUser;
	/** 更新时间 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

}
