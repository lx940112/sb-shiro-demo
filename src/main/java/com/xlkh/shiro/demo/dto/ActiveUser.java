package com.xlkh.shiro.demo.dto;

import com.xlkh.shiro.demo.entity.sys.SysFunc;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lucas
 * @date 2019/09/25
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ActiveUser implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6769918669163310693L;
    /** 用户ID */
    private Long userId;
    /** 用户名(登录账号) */
    private String userName;
    /** 用户姓名 */
    private String realName;
    /** 用户 Ip*/
    private String userIp;
    /** 用户状态 */
    private String status;

    /** 菜单集合 */
    private List<SysFunc> menus=new ArrayList<>();
}
