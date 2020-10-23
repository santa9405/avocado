package com.kh.poly.model.vo;

import com.kh.poly.ex1.model.vo.AllinOnePrinter;
import com.kh.poly.ex1.model.vo.Fax;

public class SamsungAP extends AllinOnePrinter implements Fax {
	// Ŭ���� ��Ӱ� �������̽� ����� ���ÿ� �� �� �ִ�

	public SamsungAP() {
	}

	public SamsungAP(String brand, String name) {
		super(brand, name);
	}

	// AllinOnePrinter Ŭ�������� ��ӹ��� �̿ϼ� �޼ҵ带
	// ���������� �������̵���
	@Override
	public double maxPaperSize() {
		return 210.0;
	}

	// ����Ʈ�� ����
	public void connectPhone() {
		System.out.println("����Ʈ���� �����Ͽ� ���� ��� ����");
	}

	@Override
	public void print() {
		System.out.println("�����ν�");
	}

	@Override
	public void powerOn() {
		System.out.println("�����ν�");
	}

	@Override
	public void powerOff() {
		System.out.println("�����ν�");
	}

	@Override
	public void scan() {
		System.out.println("�����ϰ� ����ϰ� ��ĵ");
	}

	@Override
	public void sendFax() {
		System.out.println("��ȣ ������ ����");
	}

	@Override
	public void receiveFax() {
		System.out.println("�������� ���Ű���");
	}

}
