package com.xiaoer.manage.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import com.xiaoer.manage.dao.*;
import com.xiaoer.manage.entity.Classes;

@Service
public class ClassesImpl implements ClassesMapper{
	//��һ�����ڽ��������־���
	private static final Logger log = LoggerFactory.getLogger(ClassesImpl.class);
			
	//��ȡclass�б�
	@Override
	public List<Classes> getClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addClasses(Classes classes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delClasses(Classes classes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean upClasses(Classes classes) {
		// TODO Auto-generated method stub
		return null;
	}

}
