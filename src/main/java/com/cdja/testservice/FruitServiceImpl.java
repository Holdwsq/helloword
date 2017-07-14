package com.cdja.testservice;

import com.cdja.TestDao1.FruitDao;
import com.cdja.utils.MangoUtil;

public class FruitServiceImpl implements FruitService{

	FruitDao fd;
	public void add(String name, int num) {
		// TODO Auto-generated method stub
		fd = MangoUtil.getMango().create(FruitDao.class);
		fd.add(name, num);
	}

	public int getTotalNum(String name) {
		// TODO Auto-generated method stub
		fd = MangoUtil.getMango().create(FruitDao.class);
		return fd.getTotalNum(name);
	}
	

}
