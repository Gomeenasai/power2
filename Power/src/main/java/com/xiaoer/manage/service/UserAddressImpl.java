package com.xiaoer.manage.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.xiaoer.manage.dao.UserAddressMapper;
import com.xiaoer.manage.entity.UserAddress;

@Service
public class UserAddressImpl implements UserAddressMapper{
	//初始化日志，将该类的日志输出
	private static final Logger log = LoggerFactory.getLogger(ClassesImpl.class);
	
	//获取用户地址列表
	@Override
	public List<UserAddress> getAddresses(int iAddressuId) {
		// TODO Auto-generated method stub
		return null;
	}

}
