package com.kh.inherit.model.vo;

public class Child1 extends Parent {
			 // �ڽ�			    �θ�
	// extends �����
	// - �ڽ� Ŭ������ �θ� Ŭ������ ����ϴ� ��� �ʵ�, �޼ҵ��� ���� �����ϹǷ�
	//   Ȯ���Ѵ��ϴ� �ǹ��� ���� ����Ѵ�
	
	/* ��� : �ٸ� Ŭ����(�θ�)�� ������ �ִ� ���(�ʵ�, �޼ҵ�)��
	 * 	���� �ۼ��� Ŭ����(�ڽ�)�� ���� ������ �ʰ�
	 *  �� Ŭ������ �ٸ� Ŭ������ ����� �ڽ��� ���ó�� ����� �� �ִ� ���(�Ǵ� ���)
	 *  
	 * ��� ���� : Ŭ������ ����, ������ Ŭ�����鿡 ���� �������� �Ծ� ����
	 * 
	 * ��� ����
	 * 1) ���� ���� ���� �ڵ�� ���ο� Ŭ������ �ۼ��� �� �ִ� -> �ڵ� �ߺ� ����, ���뼺 ����
	 * 2) �ڵ带 ���������� �����ϱ� ������ ���������� ������ -> ����������, ���꼺 ��� */
	
	private String myCar = "������Ƽ";
	private String myHouse = "���� ��򰡿� ������";
	
	public String getMyCar() {
		return myCar;
	}
	public void setMyCar(String myCar) {
		this.myCar = myCar;
	}
	public String getMyHouse() {
		return myHouse;
	}
	public void setMyHouse(String myHouse) {
		this.myHouse = myHouse;
	}
	
	
}
