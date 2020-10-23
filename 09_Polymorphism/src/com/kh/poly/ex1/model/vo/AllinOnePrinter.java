package com.kh.poly.ex1.model.vo;

public abstract class AllinOnePrinter implements Printer, Scanner{
	// implements : �����ϴ�
	// �θ� �������̽� - �ڽ� Ŭ���� ��� : implements
	// �������̽��� ���� ��� ����
	// * �߻� Ŭ������ �������̽� ��� ��
	//	  �������̽��� �߻� �޼ҵ带 �������̵� ���� �ʾƵ� ���� �߻� ����
	//	 -> ��? �߻� Ŭ������ ���������� �߻� �޼ҵ带 ������ �� �ֱ� ������
	
	// ���ձ� (������ + ��ĳ��)
	
	// �߻� Ŭ����
	// - �Ϲ� ���(���� + �ϼ��� �޼ҵ�) + �̿ϼ� �޼ҵ尡 ���Ե� Ŭ����
	// - �̿ϼ� �����̱� ������ new�� �̿��� ��ü ������ �Ұ�����
	// -> ��, �θ�Ÿ�� ���� �����δ� ��� ������(������)
	
	// �Ϲ� ��� ����
	private String brand;
	private String name;

	// ������ : ��ȯ���� ���� Ŭ������� ���ƾ� ��
	// �����ڴ� �ʵ� �ʱ�ȭ�� ������ ������ ������ �����ڰ� �־�� ��ü ������ ������
	public AllinOnePrinter() {}
	
	public AllinOnePrinter(String brand, String name) {
		this.brand = brand;
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// �̿ϼ� �޼ҵ�(abstract method)
	// -> ��� ���迡 �ִ� �ڽ� �޼ҵ忡�� �������̵��� ����ȭ ��
	public abstract double maxPaperSize(); // �̿ϼ� �޼ҵ尡 ���Ե� Ŭ������ �߻�ȭ ����� ��

}











