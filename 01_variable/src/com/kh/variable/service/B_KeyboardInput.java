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

	
	
	public void inputTest2() {
		// ����� ������ �Է¹޾� �ѹ��� ����ϱ�
		// �̸� : ������
		// ���� : 27
		// Ű : 163.0
		// ���������� 27���̸� Ű�� 163.0cm �Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("�̸� : ");
		//String name = sc.next();
		// Ű����� �Էµ� �� ���� ���ڿ��� �о�� String ���� name�� ����;
		System.out.print("�̸� : ");
		String na = sc.nextLine();
		
		//System.out.print("���� : ");
		//int age = sc.nextInt();
		// Ű����� �Էµ� �������� �о�� int�� ���� age�� ����;
		System.out.print("���� : ");
		int ag = sc.nextInt();
		
		//System.out.print("Ű : ");
		//double height = sc.nextDouble();
		// Ű����� �Էµ� �Ǽ����� �о�� double�� ���� height�� ����;
		System.out.print("Ű : ");
		double he = sc.nextDouble();
		
		// �Էµ� ���� �̿��Ͽ� �� �ٷ� ���
		// ���������� 27���̸� Ű�� 163.0cm �Դϴ�.
		/*System.out.println(name + "���� " + age + "���̸� Ű��"
							+ height + "cm �Դϴ�."); */
		
		System.out.println(na + "���� " + ag + "�� �̸� Ű��"
							+ he + "cm �Դϴ�.");
		
		
		
	}
	
		public void inputTest3() {
			// ������� �̸�, ����, �ּҸ� �Է¹޾� �� �ٷ� ����ϱ�
			
			// ���Է� ����
			// �̸� : ������
			// ���� : 27
			// �ּ� : ����� �߰ 698
			// ���������� 27���̰�, ����� �߰ 698�� ��� �ֽ��ϴ�.
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			// �Է¹��ۿ� �����ִ� ���๮��(����) �����ϱ�
			// 31 ���� ���� <- ����
			sc.nextLine(); // ���ۿ� �����ִ� ���๮�ڸ� �о���� �����ִ� ȿ��
			
			System.out.print("�ּ� : ");
			String address = sc.nextLine();
			
			System.out.println(name + "����" + age + "�� �̰�,"
								+ address + "�� ��� �ֽ��ϴ�.");
			
		}
	
}








