package com.wgb.shiro.demo.service;

import com.wgb.shiro.demo.entity.UserOnline;

import java.util.List;

/**
 * @author INNERPEACE
 * @date 2019/8/30
 */
public interface SessionService {
	List<UserOnline> list();

	void forceLogout(String id);
}
