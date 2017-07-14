package com.cdja.run;

import java.util.UUID;

import com.cdja.pojo.Product;
import com.cdja.testservice.ProductServiceImpl;

public class ProductTest {
	private static ProductServiceImpl psi;
	
	public static void main(String[] args) {
		psi = new ProductServiceImpl();
		
		Product p = new Product();

		p.setId(UUID.randomUUID().toString());
		p.setpName("book");
		p.setpDesc("read a book , you can know a lot");
		
		psi.addProduct(p);
		String name = psi.getPnameById(p.getId());
		psi.deleteProductById(p.getId());
		System.out.println(p.getId());
		System.out.println(name);
	}
}
