package com.kh.poly.model.vo;

import com.kh.poly.ex1.model.vo.AllinOnePrinter;

public class LGAP extends AllinOnePrinter {

	public LGAP() {}
	
	public LGAP(String brand, String name) {
		super(brand, name);
	}

	@Override
	public double maxPaperSize() {
		// TODO Auto-generated method stub
		return 420;
	}
	
	public void print3D() {
		System.out.println("3D ����Ʈ ����");
	}

	@Override
	public void print() {
		System.out.println("�Ｚ���� ������");		
	}

	@Override
	public void powerOn() {
		System.out.println("��ġ��");		
	}

	@Override
	public void powerOff() {
		System.out.println("��ġ��");		
		
	}

	@Override
	public void scan() {
		System.out.println("�Ｚ���� ����");		
	}
	

}
