package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		/*
		 * ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ� ������� �迭 �ε����� ���� �� �� ���� ����ϼ���. ex. 1 2
		 * 3 4 5 6 7 8 9 10
		 */

		int[] arr = new int[10];

		for (int i = 0; i <= arr.length; i++) {
			System.out.print(i + " ");
		}

	}

	public void practice2() {
		/*
		 * ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ� �������� �迭 �ε����� ���� �� �� ���� ����ϼ���. ex. 10
		 * 9 8 7 6 5 4 3 2 1
		 */

		int[] arr = new int[10];

		for (int i = arr.length; i >= 1; i--) {
			System.out.print(i + " ");
		}

	}

	public void practice3() {
		/*
		 * ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ� 1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���. ex. ���� ���� : 5
		 * 1 2 3 4 5
		 */

		// Scanner, �迭, for��

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			int[] arr = new int[num];
			System.out.print(num);
		}

	}

	public void practice4() {

		/*
		 * ���̰� 5�� String�迭�� �����ϰ� �������, ���֡�, ��������, �������ơ�, �����ܡ��� �ʱ�ȭ �� �� �迭 �ε����� Ȱ���ؼ� ����
		 * ����ϼ���. ex. ��
		 */

		String[] sArr = { "���", "��", "����", "������", "����" };
		System.out.println("������ ���� : " + sArr[1]);
	}

	public void practice6() {

		String[] Strings = { "������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���" };

		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.print(Strings[num]);
		} else {
			System.out.print("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

	public void practice7() {

		// System.out.print("��� �� �Է� : ");
		// double[] hieght = new double[sc.nextInt()];

		Scanner sc = new Scanner(System.in);

		System.out.println("���� : ");
		int[] input = new int[sc.nextInt()];

		// for(int i=0; i<height.length ; i++) {

		for (int i = 0; i < input.length; i++) {
			System.out.println("�迭 " + i + "��° �ε����� ���� �� : ");
			input[i] = sc.nextInt();
		}
		
		//double sum = 0; // �ڵ� ����ȯ�� �ǹǷ� int�� ǥ��� ���
		//for(int i=0 ; i<height.length ; i++) {
			//sum += height[i];
			// �迭��ҿ� �ݺ� �����Ͽ� sum�� ����
		int sum = 0;
		for (int i=0; i<input.length; i++) {
			sum += input[i];
			
			//for(int i=0; i<height.length ; i++) {
			//	System.out.println(height[i] + " ");
			//}
			
			for(int k=0; k<input.length; k++) {
				System.out.print(input[k] + " ");
			}
			
			System.out.println("�� �� : " + sum);
		}
		
	}

}
