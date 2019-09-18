package com.wgb.shiro.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author INNERPEACE
 * @since 2019-09-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysRoleMenu对象", description="")
public class SysRoleMenu extends Model<SysRoleMenu> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色ID")
    @TableField("ROLE_ID")
    private Long roleId;

    @ApiModelProperty(value = "菜单/按钮ID")
    @TableField("MENU_ID")
    private Long menuId;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
