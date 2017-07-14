package com.cdja.utils;

import javax.sql.DataSource;

import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.operator.Mango;

public class MangoUtil {
	public static final String driverClassName ="com.mysql.jdbc.Driver";
	public static final String url ="jdbc:mysql://localhost:3306/student";
	public static final String username="root";
	public static final String password="root";		
	public static Mango getMango(){
		DataSource ds = new DriverManagerDataSource(driverClassName,url,username,password);
		return Mango.newInstance(ds);
	}
}
