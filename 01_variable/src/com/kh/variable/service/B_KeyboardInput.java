package com.kh.variable.service;

import java.util.Scanner;

public class B_KeyboardInput {
	
	public void inputTest1() {
		Scanner sc = new Scanner(System.in);
		
		String name; // ���ڿ� ���� ����
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		
		name = sc.nextLine();
		// ����ڰ� Ű����� �Է��� �� ��(���� �� ����)�� ������ �о�ͼ�
		// name ������ �����ض�;
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		
	}

}
