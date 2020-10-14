package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	/*
	 * �迭 - ���� �ڷ����� �������� �ϳ��� �������� �ٷ�� ��. - �迭���� �̸��� �ϳ��� �ο��Ǳ� ������ ������ ���� �迭��
	 * ����(index)�� ����. (index�� 0���� ����)
	 */

	public void example1() {
		// 1. �迭 ����
		// �ڷ���[] �迭��;
		// �ڷ��� �迭��[];
		// [] ��ȣ�� 1���� �迭�� �ǹ���.

		int[] arr; // int�� �迭 ����
		// �迭 ������ �迭�� �ڷ����� �̸��� �����ϴ� ���� ��
		// ���� �����͸� ������ ������ ����� ���� �ƴϴ�!

		// 2. �迭 �Ҵ�
		// �迭�� = new �ڷ���[�迭ũ��];
		arr = new int[5];

		// 3. �迭 �ʱ�ȭ
		// 3-1. �ε����� �̿��Ͽ� �ϳ��� �ʱ�ȭ
		/*
		 * arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;
		 */

		// 3-2. for���� �̿��� �ʱ�ȭ
		for (int i = 0; i < arr.length; i++) { // �迭 ũ�� : 5
			// �迭��.length : �迭�� ����(ũ��)�� ��ȯ
			arr[i] = i + 1;
		}

		/*
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 * System.out.println(arr[2]); System.out.println(arr[3]);
		 * System.out.println(arr[4]);
		 */

		for (int i = 0; i < arr.length; i++) { // arr.length�� arr�� ��
			System.out.println(arr[i]);
		}

	}

	public void example2() {
		// ����ڷ� ���� ���� 5���� �Է¹ް�
		// �Է¹��� ������ �Ųٷ� ���

		Scanner sc = new Scanner(System.in);

		int[] inputs = new int[5];

		for (int i = 0; i < inputs.length; i++) {
			System.out.println(i + "�ε��� �Է� : ");
			inputs[i] = sc.nextInt(); // inputs �迭�� ��� index
		}

		System.out.println("==========���==========");

		for (int i = inputs.length - 1; i >= 0; i--) {
			System.out.println(i + "�ε��� �� : " + inputs[i]);

		}
	}

	public void example3() {
		// �迭 ����, �Ҵ�, �ʱ�ȭ

		double[] dArr = { 1.1, 2.2, 3.3 };
		// �迭 ���� �� �Ҵ�, �ʱ�ȭ�� {}�� �̿��Ͽ� �����ϴ� ���
		// new ������ ���� �ۼ��� �� ������
		// {} ���� �������� ������ŭ �迭 ũ�Ⱑ �Ҵ�ȴ�

		String[] sArr = { "�θ���", "�ƺ�ī��", "���θӽ�Ĺ", "���", "�м��ĸ���" };

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 4 ���� ���� �Է� : ");
		int sel = sc.nextInt();
		
		System.out.println("������ ���� : " + sArr[sel]);
		// ArrayIndexOutOfBoundsException
		// --> �����Ϸ��� �迭 index���� �ش� �迭�� ������ �Ѿ��ٴ� ����

	}
	
	public void example4() {
		// ����ڷκ��� 4���� Ű�� �Է¹޾�
		// �Է¹��� Ű, �հ�, ����� ����ϼ���
		
		// �Է� 1 : 170.5
		// �Է� 2 : 185.5
		// �Է� 3 : 190.0
		// �Է� 4 : 160.0
		
		// 170.5 185.5 190.0 160.0
		// �հ� : xxx.xx
		// ��� : xxx.xx
		
		// Scanner, �迭(double, 4ĭ), sum, sum/4
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[4];
		// 4���� Ű�� �Է¹ް� ���� �� �迭 height ���� �� �Ҵ�
		
		for(int i=0; i<height.length ; i++) {
			// 4���� Ű�� �Է¹ޱ� ���� �ݺ���
			
			System.out.println("�Է� " + (i + 1) + " : ");
			height[i] = sc.nextDouble();
			// �Է¹��� Ű�� ������ �迭 ��ҿ� ����
		}
		
		// �迭�� ����� �� �հ� ���ϱ�
		double sum = 0; // �ڵ� ����ȯ�� �ǹǷ� int�� ǥ��� ���
		for(int i=0 ; i<height.length ; i++) {
			sum += height[i];
			// �迭��ҿ� �ݺ� �����Ͽ� sum�� ����
		}
		
		// ��� ����ϱ�
		for(int i=0; i<height.length ; i++) {
			System.out.println(height[i] + " ");
		}
		
		System.out.println("\n�հ� : " + sum);
		// \n : �� �ٲ�(����)�� �ǹ��ϴ� escape ����
		
		System.out.println("\n��� : " + sum/height.length);
		
	}
	
	public void example5() {
		// �Է¹��� ����� ���� ���� �Է��ϰ�
		// Ű�� �Է¹޾� Ű, �հ�, ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� �Է� : ");
		double[] hieght = new double[sc.nextInt()];

		double sum = 0.0; // �հ�
		for(int i=0 ; i<hieght.length ; i++) { // length �ε����� ����
			System.out.print("Ű �Է�" + (i+1) + " : ");
			hieght[i] = sc.nextDouble();
			sum += hieght[i]; // �Է� ���� Ű ����
		}
		
		System.out.println( Arrays.toString(hieght) );
		// Arrays Ŭ���� : java���� �����ϴ� �迭 ���� ������ ����� ��Ƴ��� Ŭ����
		// Arrays.toString(�迭��) :
		// �迭�� ����� ���� �� �ٷ� ���, ��µǴ� �� ���̿� ','�� �����
		// ex) (123, 123, 123, 123)
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum / hieght.length);
		
	}
	
	

}
