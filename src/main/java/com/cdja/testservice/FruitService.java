package com.cdja.testservice;

public interface FruitService {
	/**
	 * add方法用来向数据库中增加fruit
	 * param 有fruit的名字和数量
	 * 返回值为void
	 */
	public void add(String name,int num);
	/**
	 * getTotalNum 方法通过传入水果的名字返回对应水果的数量
	 * @param name
	 * @return int 
	 */
	public int getTotalNum(String name);
}
