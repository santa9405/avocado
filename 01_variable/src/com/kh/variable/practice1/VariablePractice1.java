package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void practice() {
		// �ǽ�����1
		// �̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
		/* ex.
		�̸��� �Է��ϼ��� : �ƹ���
		������ �Է��ϼ���(��/��) : ��
		���̸� �Է��ϼ��� : 20
		Ű�� �Է��ϼ���(cm) : 180.5
		Ű 180.5cm�� 20�� ���� �ƹ����� �ݰ����ϴ�^^
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		// String.charAt(index) : ���ڿ� �߿� index ��° ���� �ϳ����� ������.
		// * index�� 0���� ����
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine(); //���๮�� ����
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		double hieght = sc.nextDouble();
		
		System.out.println("Ű " + hieght + "cm �� " + age 
							+ "�� " + gender + "�� "+ name + "�� �ݰ����ϴ�^^");
	}
}