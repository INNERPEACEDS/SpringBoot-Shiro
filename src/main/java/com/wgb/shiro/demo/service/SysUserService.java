package com.wgb.shiro.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wgb.shiro.demo.entity.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author INNERPEACE
 * @since 2019-09-18
 */
public interface SysUserService extends IService<SysUser> {

    IPage<SysUser> selectByPage(@Param("page") Page<SysUser> page);

    SysUser findByName(String userName);
}
