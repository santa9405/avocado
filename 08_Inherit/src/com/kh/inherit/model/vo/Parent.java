package com.kh.inherit.model.vo;

public class Parent {
	public int assets = 1000000000;
	private int goldBar = 3;
	
	public int getgoldBar() {
		return goldBar;
	}
	
	public void setgoldBar(int goldBar) {
		this.goldBar = goldBar;
	}
	
	
	public final void hun_yug() {
		// final �޼ҵ� : �������̵� �Ұ����� �޼ҵ�
		
		
		System.out.println("������ �ض�!!!!");
	}
}
