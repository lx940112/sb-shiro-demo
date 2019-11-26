package com.xlkh.shiro.demo.entity.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 公共字段抽取的实体类
 *  主键为id，并包含创建人、创建时间字段的实体类都要集成此类，
 * @author Lucas
 * @date 2019/09/25
 */
@Data
public abstract class BaseEntity  implements Serializable {

    /** 用户ID */
    @TableId
    private Long id;
    /** 创建人 */
    @TableField(fill = FieldFill.INSERT)
    private Long createUser;
    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

}
