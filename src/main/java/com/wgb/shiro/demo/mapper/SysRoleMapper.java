package com.wgb.shiro.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wgb.shiro.demo.entity.SysRole;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author INNERPEACE
 * @since 2019-09-18
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> findUserRole(String userName);
}
