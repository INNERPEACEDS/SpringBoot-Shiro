package com.wgb.shiro.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wgb.shiro.demo.entity.SysMenu;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author INNERPEACE
 * @since 2019-09-18
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<SysMenu> findUserPermissions(String userName);
}
