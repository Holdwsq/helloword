package com.cdja.testservice;

import com.cdja.pojo.Product;

public interface ProductService {
	//通过传入一个product向表中添加一个商品
	public void addProduct(Product product);
	
	//通过传一个Product对象通过id进行更新
	public int updateProductById(Product product);
	//传一个参数id 调用底层的持久层dao进行操作
	public int deleteProductById(String id);
	//传参数id 获取商品的名字
	public String getPnameById(String id);
}

