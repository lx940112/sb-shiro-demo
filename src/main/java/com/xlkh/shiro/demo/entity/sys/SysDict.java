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
@TableName("sys_dict")
public class SysDict extends BaseEntity {

	private static final long serialVersionUID = 1L;

	/** 上级ID，一级为0 */ 
	private Long parentId;
	/** 字典类型 */ 
	private String dictType;
	/** 字典名称 */ 
	private String dictName;
	/** 字典值 */ 
	private String dictValue;
	/** 备注 */ 
	private String remark;
	/** 排序 */ 
	private Integer sort;
	/** 删除标识:1-未删除; 0-删除 */
	@TableField(fill = FieldFill.INSERT)
	private Integer delFlag;
	/** 更新人 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Long updateUser;
	/** 更新时间 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime updateTime;

}
