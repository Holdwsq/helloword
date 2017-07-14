package com.cdja.pojo;

public class SubCard {
	private int type;
	private String content;
	
	
	public SubCard(){
		
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	public String toString(){
		return "type:"+type+",content"+content;
	}
}
