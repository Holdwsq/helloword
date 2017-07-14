package com.cdja.run;

import com.cdja.testservice.FruitService;
import com.cdja.testservice.FruitServiceImpl;

/**
 * @author wsq
 * @Description 用来学习mango的主要调用类
 */
public class HelloWorld {
	public static FruitService fs;
	public static void main(String[] args) {
		String name = "apple";
		int num = 7;
		fs = new FruitServiceImpl();
		fs.add(name, num);
		System.out.println(fs.getTotalNum(name));
	}
}
