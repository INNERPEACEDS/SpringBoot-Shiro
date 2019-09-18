package com.wgb.shiro.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wgb.shiro.demo.entity.SysMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author INNERPEACE
 * @since 2019-09-18
 */
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenu> findUserPermissions(String userName);
}
