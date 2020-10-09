package com.xiaoer.manage.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.xiaoer.manage.dao.*;
import com.xiaoer.manage.entity.Menu;
@Service
public class MenuImpl implements MenuMapper{
	//初始化日志，用于输出该类的日志
	private static final Logger log = LoggerFactory.getLogger(ClassesImpl.class);
	
	//获取界面列表
	@Override
	public List<Menu> getMenus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delMenu(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu getMenu(int iId) {
		// TODO Auto-generated method stub
		return null;
	}

}
