package com.xiaoer.manage.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.xiaoer.manage.dao.*;
import com.xiaoer.manage.entity.Menu;
@Service
public class MenuImpl implements MenuMapper{
	//��ʼ����־����������������־
	private static final Logger log = LoggerFactory.getLogger(ClassesImpl.class);
	
	//��ȡ�����б�
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
