package com.kh.oop.ch2_encapsulation.model.service;

import com.kh.oop.ch2_encapsulation.model.vo.Account;

public class EncapsulationService {

	public void example() {
		Account ac = new Account();
		
		// System.out.println(ac.name);
		// name ��� ������ �ܺη� ���� ���� ������ ���ܵǾ� �־�
		// ���� ���� �� ���� --> getter�� ����� ���������� ���;� ��
		
		System.out.println(ac.getName());
		// ac�� �����ϰ� �ִ� ��ü�� ��� ��
		// getName()�޼ҵ��� ��ȯ���� ���
		
		String name = ac.getName();
		System.out.println(name);
		
		// �ܾ� ��ȸ
		System.out.println("�ܾ� : " + ac.getBalance());
		int balance = ac.getBalance(); // 100000
		
		balance -= 3000; // 97000
		
		// ���� �ܾ� ����
		ac.setBalance(balance);
		
		System.out.println("���� �� �ܾ� : " + ac.getBalance());
		
	
		
	}
	
	// ��������� ĸ��ȭ��
}
