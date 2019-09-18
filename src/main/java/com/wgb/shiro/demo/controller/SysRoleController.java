package com.wgb.shiro.demo.controller;

import com.wgb.shiro.demo.entity.SysRole;
import com.wgb.shiro.demo.service.SysRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author INNERPEACE
 * @since 2019-09-18
 */
@RestController
@RequestMapping("/sys/role")
public class SysRoleController {

    @Resource
    private SysRoleService roleService;

    @GetMapping("{username}")
    public List<SysRole> roleList(@NotBlank(message = "{required}") @PathVariable String username) {
        return this.roleService.findUserRole(username);
    }

}

