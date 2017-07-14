package com.cdja.testservice;

import java.util.Date;
import java.util.List;

import org.jfaster.mango.operator.Mango;

import com.cdja.TestDao1.UserDao;
import com.cdja.pojo.User;
import com.cdja.utils.MangoUtil;


public class UserServiceImpl implements UserService{
	private static UserDao  ud = MangoUtil.getMango().create(UserDao.class);
	public void add(String name, int age, boolean gender, double money, Date updateTime) {
		// TODO Auto-generated method stub
		ud.insertUser(name, age, gender, money, updateTime);
		
		
	}

	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return ud.deleterUser(id);
	}

	public int update(User user) {
		// TODO Auto-generated method stub
		return ud.updateUser(user);
	}

	public String getNameById(int id) {
		// TODO Auto-generated method stub
		return ud.getName(id);
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return ud.getUserById(id);
	}

	public List<User> getUserListByAge(int age) {
		// TODO Auto-generated method stub
		return ud.getUserListByAge(age);
	}

	public List<User> getUsersInList(List<Integer> ids) {
		// TODO Auto-generated method stub
		return ud.getUsersInList(ids);
	}

}
