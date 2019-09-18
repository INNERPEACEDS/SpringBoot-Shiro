package com.wgb.shiro.demo.service.impl;

import com.wgb.shiro.demo.entity.UserOnline;
import com.wgb.shiro.demo.service.SessionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author INNERPEACE
 * @date 2019/9/17 17:45
 */
@Service
public class SessionServiceImpl implements SessionService {
	@Override
	public List<UserOnline> list() {
		return null;
	}

	@Override
	public void forceLogout(String id) {

	}
}
