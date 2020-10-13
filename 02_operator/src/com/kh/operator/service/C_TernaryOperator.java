package com.kh.operator.service;

import java.util.Scanner;

public class C_TernaryOperator {
	
	
	// ���� ������
	// (���ǽ�) ? ��1 : ��2;
	// - ���ǽ� ����� true�̸� ��1 ����
	// - ���ǽ� ����� false�̸� ��2 ����
	public void example1() {
		// ���� �ϳ��� �Է¹޾� �������, ����� �ƴ��� �˻�
		// ����� ��� "����Դϴ�."
		// ����� �ƴ� ��� "����� �ƴմϴ�."
		// �� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "����Դϴ�." : "����� �ƴմϴ�.";
		System.out.println(input + "��/�� " + result);
		
	}
	
	public void example2() {
		// ���� ������ ��ø ���
		
		// ���� �ϳ��� �Է¹޾�, ���, 0 , �������� �˻�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "����Դϴ�." : (input == 0 ? "0�Դϴ�." : "�����Դϴ�.");
		System.out.println(input + "�� " + result);
		
	}

}
