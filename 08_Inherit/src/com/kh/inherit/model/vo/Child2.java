package com.kh.inherit.model.vo;

public final class Child2 extends Parent {
	// final class : ��� �Ұ����� Ŭ����
	// -> �ٸ� Ŭ�������� extends�� ��� ���踦 ���� �� ����
	
	private String computer = "150��¥�� ��ǻ��";
	private String membership = "õ������";
	
	public String getComputer() {
		return computer;
	}
	public void setComputer(String computer) {
		this.computer = computer;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	
	/* // final �޼ҵ� �������̵� �Ұ�
	@Override
	public void hun_yug() {
		System.out.println("������ �ҷ�?");
} */
	
	
}
