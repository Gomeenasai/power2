package com.xiaoer.manage.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.xiaoer.manage.dao.*;
import com.xiaoer.manage.entity.Goods;
@Service
public class GoodsImpl implements GoodsMapper{
	//��һ�����ڽ��������־���
	private static final Logger log = LoggerFactory.getLogger(ClassesImpl.class);
	
	//��ȡ��Ʒ�б�
	@Override
	public List<Goods> getGoods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods findGoods(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delGoods(int iGoodsId) {
		// TODO Auto-generated method stub
		return null;
	}

}
