package com.kh.control.condition.service;

import java.util.Scanner;

public class A_If {

	/*
	 * ���α׷��� ����� �ؼ��� �⺻������ ��->�Ʒ�, ����->������ ���� ���������� �ؼ���
	 * 
	 * �̷��� �ؼ� ������ �����ϴ� ���� ����̶� ��
	 * 
	 * <���ǹ�> - ���ǽ��� ���� �� �Ǵ� ������ �Ǵ��Ͽ� ������ �����ϴ� ��� �ش� �ڵ带 �����ϴ����
	 *
	 * (���׿����ڵ� ����̴�.)
	 * 
	 */

	public void example1() {
		// ���� if��
		// ���� �ϳ��� �Է¹޾� ���, ����, 0�� �Ǻ��Ͽ� ���

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �ϳ� �Է� : ");
		int input = sc.nextInt();

		if (input > 0) { // input�� ����� ���
			System.out.println("��� �Դϴ�.");
		}

		if (input < 0) { // input�� ������ ���
			System.out.println("���� �Դϴ�.");
		}

		if (input == 0) { // input�� 0�� ���
			System.out.println("0 �Դϴ�.");
		}

	}

	public void example2() {
		// if - else��

		/*
		 * if(���ǽ�){ true�� �� ���� } else{ false�� �� ���� }
		 */

		// ���� �ϳ��� �Է� �޾� ¦��, Ȧ�� �Ǻ��ϱ�

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();

		if (input % 2 == 1) { // input�� Ȧ���� ���
			System.out.println("Ȧ���Դϴ�.");
		} else { // input�� Ȧ���� �ƴ� ��� == ¦���� ���
			System.out.println("¦���Դϴ�.");
		}
	}

	public void example3() {
		// 1 ~ 12 ������ ���ڸ� �Է� �޾�
		// �ش� ���� ������ ����ϼ���.
		// ��, 1 ~ 12 ������ ���ڰ� �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�" ����ϱ�.

		Scanner sc = new Scanner(System.in);

		System.out.println("1 ~ 12 ���� ���ڸ�  �Է��� �ּ��� : ");
		int month = sc.nextInt();

		String season = null;

		// �� : 3,4,5 / ���� : 6,7,8 / ���� : 9/10/11 / �ܿ� : : 12,1,2
		if (month >= 3 && month <= 5) {
			// month�� 3 �̻�, 5 ������ ���
			season = "��";
		} else if (month >= 6 && month <= 8) {
			season = "����";
		} else if (month >= 9 && month <= 11) {
			season = "����";
		} else if (month == 12 || month == 1 || month == 2) {
			season = "�ܿ�";
		} else { // �� ���ǹ��� ��� false�� ���
			season = "�߸� �Է��ϼ̽��ϴ�.";
		}
		System.out.println(season);
	}

	public void example4() {
		// ���̸� Ű����� �Է� �޾� ���(13�� ����)����,
		// û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
		// ����(19�� �ʰ�)���� ����ϼ���.

		Scanner sc = new Scanner(System.in);

		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		String result = null;

		if (age <= 13) {
			result = "���";
		} else if (age <= 19) {
			result = "û�ҳ�";
		} else {
			result = "����";
		}

		System.out.println(result);
	}

	public void example5() {
		// ���̸� Ű����� �Է� �޾�
		// 0 ~ 120�� ������ ���
		// ���(13�� ����)����,
		// û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
		// ����(19�� �ʰ�)���� �Ǻ��ϰ�
		// ���� ������ �ʰ��ϴ� ��� "�߸� �Է��ϼ̽��ϴ�." ���

		Scanner sc = new Scanner(System.in);

		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();

		String result = null;

		if (age >= 0 && age <= 120) { // age�� 0�̻� 120������ ���
			if (age <= 13) {
				result = "���";
			} else if (age <= 19) {
				result = "û�ҳ�";
			} else {
				result = "����";
			}
		} else {
			result = "�߸� �Է��ϼ̽��ϴ�.";
		}
		
		System.out.println(result);
	}
	
	public void example6() {
		// ���̸� Ű����� �Է� �޾� ���(13�� ����)����,
		// û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
		// ����(19�� �ʰ�)���� ����ϼ���.

		Scanner sc = new Scanner(System.in);

		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		String result = null;

		if(age < 0 || age > 120) { // age�� 0�̸� �Ǵ� 120 �ʰ��� ���
			result = "�߸� �Է��ϼ̽��ϴ�.";
		} else if (age <= 13) {
			result = "���";
		} else if (age <= 19) {
			result = "û�ҳ�";
		} else {
			result = "����";
		}

		System.out.println(result);
	}
	
	public void example7() {
		// �̸��� �Է��Ͽ� �������� Ȯ���ϱ�
		
		
		// �̸��� �Է��ϼ��� : ������
		// ���� �Դϴ�.
		
		// �̸��� �Է��ϼ��� : ȫ�浿
		// ������ �ƴմϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		if(!name.equals("������")) { 
			// String ���� ���ϱ� ���ؼ� ==, != �񱳿����� ����� �� ����
			// -> String ���� ���ϱ� ���ؼ���
			// 	  String.equals() �޼ҵ带 ����ؾ� ��
			// 		-> �� String�� ���� ���� �������� ���ϴ� �޼ҵ�
			//			������ true, �ƴϸ� false ��ȯ
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
		
		
	}
	
}
