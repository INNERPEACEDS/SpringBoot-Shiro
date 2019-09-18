package com.wgb.shiro.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wgb.shiro.demo.entity.SysRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author INNERPEACE
 * @since 2019-09-18
 */
public interface SysRoleService extends IService<SysRole> {

    List<SysRole> findUserRole(String userName);
}
