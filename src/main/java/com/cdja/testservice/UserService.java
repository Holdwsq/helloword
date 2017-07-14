package com.cdja.testservice;

import java.util.Date;
import java.util.List;

import com.cdja.pojo.User;

public interface UserService {
	public void add(String name,int age,boolean gender,double money,Date updateTime);
	public int deleteUser(int id);
	public int update(User user);
	public String getNameById(int id);
	public User getUserById(int id);
	public List<User> getUserListByAge(int age);
	public List<User> getUsersInList(List<Integer> ids);
}
