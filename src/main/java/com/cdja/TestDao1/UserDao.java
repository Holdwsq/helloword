package com.cdja.TestDao1;

import java.util.Date;
import java.util.List;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;

import com.cdja.pojo.User;
@DB
public interface UserDao {
	/**
	 * mango采用接口与注解的形式定义DAO，完美结合db与cache操作
	 * dao和注解结合：1、interface上面写有@DB的注解
	 * 			  2、方法的上面写有灵活的SQl语句，从而完成方法对应的操作	
	 */
	//插入一个用户
	@SQL("insert into user(name,age,gender,money,update_time) values (:1,:2,:3,:4,:5)")
	public void insertUser(String name,int age,boolean gender,double money,Date update_time);
	//删除一个用户
	@SQL("delete from user where name id=:1")
	public int deleterUser(int num);
	//更新一个用户 update操作
	@SQL("update  user set name=:1.name,age=:1.age,"
		+"gender=:1.age,money=:1.money,update_time=:1.updateTime where id=:1.id")
	public int updateUser(User user);
	
	
	/*
	 * 查询只包含一个select操作，但根据查询条件不同与返回结果的不同
	 * ，查询方法的书写也会不同
	 */
	@SQL("select name from user where id = :1")
	public String getName(int id);
	
	//查询自定义对象
	@SQL("select id,name,age,gender,money,update_time from user where id = :1")
	public User getUserById(int id);
	
	@SQL("select id,name,age,gender,money,update_time from user where age = :1 order by id")
	public List<User> getUserListByAge(int age);
	/**
	 * 需要注意的是 in (:1) 中的参数必须是List或Set或Array，同时返回参数也必须是List或Set或Array。
	 * @param ids
	 * @return
	 */
	@SQL("select id, name, age, gender, money, update_time from user where id in (:1)")
	public List<User> getUsersInList(List<Integer> ids);

}
