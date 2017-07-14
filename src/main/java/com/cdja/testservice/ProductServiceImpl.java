package com.cdja.testservice;

import com.cdja.TestDao1.ProductDao;
import com.cdja.pojo.Product;
import com.cdja.utils.MangoUtil;

public class ProductServiceImpl implements ProductService{
	private static ProductDao pd = MangoUtil.getMango().create(ProductDao.class);
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		pd.addProduct(product);
	}

	public int updateProductById(Product product) {
		// TODO Auto-generated method stub
		return pd.updateProductById(product);
	}

	public int deleteProductById(String id) {
		// TODO Auto-generated method stub
		return pd.deleteProductById(id);
	}

	public String getPnameById(String id) {
		// TODO Auto-generated method stub
		return pd.getPnameById(id);
	}

	public static ProductDao getPd() {
		return pd;
	}

	public static void setPd(ProductDao pd) {
		ProductServiceImpl.pd = pd;
	}

}
