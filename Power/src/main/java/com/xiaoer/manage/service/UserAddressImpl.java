package com.xiaoer.manage.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.xiaoer.manage.dao.UserAddressMapper;
import com.xiaoer.manage.entity.UserAddress;

@Service
public class UserAddressImpl implements UserAddressMapper{
	//��ʼ����־�����������־���
	private static final Logger log = LoggerFactory.getLogger(ClassesImpl.class);
	
	//��ȡ�û���ַ�б�
	@Override
	public List<UserAddress> getAddresses(int iAddressuId) {
		// TODO Auto-generated method stub
		return null;
	}

}
