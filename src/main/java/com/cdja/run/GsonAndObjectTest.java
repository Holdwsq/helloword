package com.cdja.run;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.Rename;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.operator.Mango;

import com.cdja.pojo.Card;
import com.cdja.pojo.SubCard;
import com.cdja.utils.MangoUtil;

public class GsonAndObjectTest {
	public static void main(String[] args) {
		Mango mango = MangoUtil.getMango();
		CardDao cd = mango.create(CardDao.class);
	
		Card card = new Card();
		
		card.setName("hello");
		SubCard sc = new SubCard();
		sc.setContent("i am subcard");
		sc.setType(11);
		card.setSubCard(sc);
		
		cd.addCard(card);
		
		Card c = cd.getCardById(1);
		System.out.println(c);
	
	}
	@DB(table = "student")
	public interface CardDao{
		@SQL("insert into Card(name,sub_card) values (:name,:subCard)")
		public void addCard(Card card);
		@SQL("select id,name,sub_card from Card where id = :id")
		public Card getCardById(@Rename("id")int id);
	}
}
