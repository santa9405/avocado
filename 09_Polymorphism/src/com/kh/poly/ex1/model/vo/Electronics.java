package com.kh.poly.ex1.model.vo;

public interface Electronics {
	// �������̽�
	// - ��� �ʵ�� �߻� �޼ҵ常�� �ۼ��� �� �ִ�
	//	 �߻�Ŭ������ ����ü
	
	// - �߻� Ŭ������ �����̹Ƿ� �������� ��ü ������ �Ұ���
	//	 ������, �θ� Ÿ�� ���� �����δ� ��� ������(������)
	
	// - ��ӹ��� Ŭ�������� �޼ҵ� ���ϼ� �ο�
	
	// �������̽��� �ʵ�
	// public static final int VOLT = 220;
	// public static final (��������)
	int VOLT = 220;
	
	// �������̽��� �޼ҵ�
	// - ��� �޼ҵ尡 public abstract (�߻� �޼ҵ�)
	public abstract void powerOn();
	
	// ��� �޼ҵ�� ���������� public abstract (���� ����)
	void powerOff();
	
	
	
	
	
	
	
	
}
