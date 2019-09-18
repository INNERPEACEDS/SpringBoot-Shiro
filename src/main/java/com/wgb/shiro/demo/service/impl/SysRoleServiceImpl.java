package com.wgb.shiro.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wgb.shiro.demo.entity.SysRole;
import com.wgb.shiro.demo.mapper.SysRoleMapper;
import com.wgb.shiro.demo.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Resource
    private SysRoleMapper roleMapper;

    @Override
    public List<SysRole> findUserRole(String userName) {
        return roleMapper.findUserRole(userName);
    }
}
