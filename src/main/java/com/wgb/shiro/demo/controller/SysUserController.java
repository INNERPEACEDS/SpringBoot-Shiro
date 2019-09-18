package com.wgb.shiro.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wgb.shiro.demo.common.domain.QueryRequest;
import com.wgb.shiro.demo.entity.SysUser;
import com.wgb.shiro.demo.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author INNERPEACE
 * @since 2019-09-18
 */
@Api(tags = "用户相关")
@RestController
@RequestMapping("/sys/user")
@Slf4j
public class SysUserController {

    @Resource
    private SysUserService userService;


    @ApiOperation(value = "用户列表")
    @GetMapping("list")
    @RequiresPermissions("user:list")
    public IPage<SysUser> userList(QueryRequest request) {
        log.info("进入userList");
        if (request.getPageSize() == 0) {
            request.setPageSize(8);
        }
        Page<SysUser> page = new Page<>(request.getPageNum(), request.getPageSize());
        IPage<SysUser> sysUser = userService.selectByPage(page);
        return sysUser;
    }

    @GetMapping("check/{username}")
    public boolean checkUserName(@NotBlank(message = "{required}") @PathVariable String username) {
        return this.userService.findByName(username) == null;
    }


}

