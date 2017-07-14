package com.cdja.TestDao1;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.Rename;
import org.jfaster.mango.annotation.SQL;

import com.cdja.pojo.Product;

@DB
public interface ProductDao {
	@SQL("insert into product(id,pname,pdesc) values(:id,:pName,pDesc)")
	public void  addProduct(Product product);
	
	@SQL("update product set pname=:p.pName,pdesc = :p.pDesc? where id = :p.id")
	public  int updateProductById(@Rename("p")Product product);
	
	@SQL("delete from product where id = :id")
	public int deleteProductById(@Rename("id")String id);
	
	@SQL("select pname from product where id = :id")
	public String getPnameById(@Rename("id")String id);
}
