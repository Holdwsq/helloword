package com.cdja.run;

import java.util.List;

import javax.sql.DataSource;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.annotation.Sharding;
import org.jfaster.mango.annotation.TableShardingBy;
import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.datasource.SimpleDataSourceFactory;
import org.jfaster.mango.operator.Mango;
import org.jfaster.mango.sharding.TableShardingStrategy;

import com.cdja.pojo.Order;

public class TableShardingOrderDaoMain {
	public static void main(String[] args) {
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/db_0";
		String username = "root";
		String password = "root";
		
		DataSource ds = new DriverManagerDataSource(driverName,url,username,password);
		SimpleDataSourceFactory ssf = new SimpleDataSourceFactory(ds);
		Mango mango = Mango.newInstance(ssf);
		TableShardingOrderDao ts = mango.create(TableShardingOrderDao.class);
		Order order = new Order();
		order.setId(2000);
		order.setUid("501");
		order.setPrice(100);
		order.setStatus(true);
		
		ts.addOrder(order);
		
		
	}
	@DB(table = "t_order")
	@Sharding(tableShardingStrategy = OrderTableShardingStrategy.class)
	public interface TableShardingOrderDao{
		@SQL("insert into #table(id,uid,price,status) values (:id,:uid,:price,:status)")
		public void addOrder(@TableShardingBy("id") Order order);
		
	/*	@SQL("select id,uid,price,status from #table where id = :1")
		public List<Order> getOrderByUid(String uid);*/
	}
	static class OrderTableShardingStrategy implements TableShardingStrategy<Integer>{

		public String getTargetTable(String table, Integer id) {
			// TODO Auto-generated method stub
			int num = id < 1000 ? 0:1;
			return table+"_"+num;
		}
		
	}
}
