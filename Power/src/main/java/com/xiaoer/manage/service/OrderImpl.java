package com.xiaoer.manage.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.xiaoer.manage.dao.OrderMapper;
import com.xiaoer.manage.entity.Order;

@Service
public class OrderImpl implements OrderMapper{
	//��ʼ����־�����������־���
	private static final Logger log = LoggerFactory.getLogger(ClassesImpl.class);
	
	//���order�б�
	@Override
	public List<Order> getOders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
