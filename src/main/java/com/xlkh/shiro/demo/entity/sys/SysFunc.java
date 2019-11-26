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
@TableName("sys_func")
public class SysFunc extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/** 功能代码 */ 
	private String funcCode;
	/** 功能名称 */ 
	private String funcName;
	/** 父级功能ID,一级菜单为0 */ 
	private Long parentId;
	/** 功能描述 */ 
	private String funcDesc;
	/** 请求方式（如：GET、POST、PUT、DELETE） */ 
	private String funcMethod;
	/** 功能URL */ 
	private String funcUrl;
	/** 图标 */ 
	private String funcIcon;
	/** 功能备注 */ 
	private String remark;
	/** 功能类型：0-菜单,1-按钮 */ 
	private Integer funcType;
	/** 认证等级：0-权限认证;1-登录认证;2-无需认证 */ 
	private Integer authLevel;
	/** 删除标识:1-未删除; 0-删除 */
	@TableField(fill = FieldFill.INSERT)
	private Integer delFlag;
	/** 排序 */ 
	private Integer sort;
	/** 打开链接 */ 
	private String target;
	/** 更新人 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Long updateUser;
	/** 更新时间 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime updateTime;

	/**
	 * 上级菜单名称
	 */
	@TableField(exist = false)
	private String parentName;

}
