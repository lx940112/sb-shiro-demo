package com.xlkh.shiro.demo.entity.sys;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xlkh.shiro.demo.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 *
 * @author Lucas
 * @date 2019/09/25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sys_user")
public class SysUser extends BaseEntity {

	public static final String STATUS_LOCKED = String.valueOf('0');
	private static final long serialVersionUID = 1L;

	/** 用户名 */ 
	private String username;
	/** 密码 */ 
	private String password;
	/** 姓名 */ 
	private String realName;
	/** 性别: 0-女; 1-男; 2-保密 */ 
	private Integer gender;
	/** 头像地址 */ 
	private String iconUrl;
	/** 描述 */ 
	private String userDesc;
	/** 电话 */ 
	private String telephone;
	/** 手机号 */ 
	private String mobile;
	/** 邮箱 */ 
	private String email;
	/** 部门ID */ 
	private Long deptId;
	/** 超级管理员: 1-是; 0-不是 */ 
	private Integer superAdmin;
	/** 状态: 1-正常; 0-停用 */
	private String status;
	/** 备注 */ 
	private String remark;
	/** 删除标识:1-未删除; 0-删除 */
	@TableField(fill = FieldFill.INSERT)
	private Integer delFlag;
	/** 末次密码更新时间 */ 
	private LocalDateTime pwResetTime;

	/** 更新人 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Long updateUser;
	/** 更新时间 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime updateTime;

	/** 部门名称 */
	@TableField(exist = false)
	private String deptName;
}
