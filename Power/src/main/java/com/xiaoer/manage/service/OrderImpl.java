package com.xiaoer.manage.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.xiaoer.manage.dao.OrderMapper;
import com.xiaoer.manage.entity.Order;

@Service
public class OrderImpl implements OrderMapper{
	//初始化日志，将该类的日志输出
	private static final Logger log = LoggerFactory.getLogger(ClassesImpl.class);
	
	//输出order列表
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
