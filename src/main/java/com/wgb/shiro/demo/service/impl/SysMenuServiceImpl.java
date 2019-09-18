package com.wgb.shiro.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wgb.shiro.demo.entity.SysMenu;
import com.wgb.shiro.demo.mapper.SysMenuMapper;
import com.wgb.shiro.demo.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author INNERPEACE
 * @since 2019-09-18
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Autowired
    private SysMenuMapper menuMapper;

    @Override
    public List<SysMenu> findUserPermissions(String userName) {
        return menuMapper.findUserPermissions(userName);
    }
}
