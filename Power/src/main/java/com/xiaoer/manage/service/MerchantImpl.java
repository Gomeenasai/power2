package com.xiaoer.manage.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.xiaoer.manage.dao.MerchantMapper;
import com.xiaoer.manage.entity.Merchant;

@Service
public class MerchantImpl implements MerchantMapper{
	//��ʼ����־�����������־���
	private static final Logger log = LoggerFactory.getLogger(ClassesImpl.class);
	
	//����̼��б�
	@Override
	public List<Merchant> getMerchants() {
		// TODO Auto-generated method stub
		return null;
	}

}
