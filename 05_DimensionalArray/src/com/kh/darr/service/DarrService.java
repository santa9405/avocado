package com.kh.darr.service;

import java.util.Scanner;

public class DarrService {

	public void example1() {
		// 2���� �迭
		// - 1���� �迭�� ����

		// 2���� �迭 ����
		int[][] iArr; // int�� 2���� �迭 ���� ���� ����

		// 2���� �迭 �Ҵ�
		iArr = new int[2][3];
		// 2���� �迭 2�� 3���� �Ҵ��Ͽ�
		// ���� �ּҰ��� iArr ���� ������ ����

		int count = 1; // 1 ~ 6 �����ϴ� ����
		// �迭�� �� ��ҿ� 1���� 6���� ����
		for (int i = 0; i < iArr.length; i++) { // �� ����
			// iArr.length : ���� ����

			for (int j = 0; j < iArr[i].length; j++) { // �� ����
				// iArr[i].length : i��° ���� �����ϰ� �ִ� ���� ����

				iArr[i][j] = count++;
				// �迭 ��ҿ� count ���� �� count 1����

			}
		}

		// �迭 �� ���
		for (int i = 0; i < iArr.length; i++) {

			for (int j = 0; j < iArr[i].length; j++) {

				System.out.print(iArr[i][j] + " ");

			} // ���� for end
			System.out.println(); // �� �ٲ�

		}

	}

	public void example2() {
		// 2���� �迭 ����, �Ҵ�, �ʱ�ȭ
		int[][] arr = { { 10, 20, 30 }, { 4, 5, 6 }, { 19, 17, 21 } };

		// 2���� �迭�� ����� �� �հ� ���ϱ�
		int sum = 0;
		for (int i = 0; i < arr.length; i++) { // ��
			for (int j = 0; j < arr[i].length; j++) { // ��

				sum += arr[i][j]; // arr i j��°�� ���� �ϰڴ�
			}

		}

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (double) sum / (arr.length * arr[0].length));
	}

	public void example3() {
		// �л� �θ��� ����, ����, ���� ������ �Է¹޾�
		// �� �л��� ���� �հ�, ��� ���
		// �� �л��� ���� ���, ���� ���, ���� ���

		/*
		 * 1�� �л� ���� �Է� ���� : 50 ���� : 60 ���� : 70
		 * 
		 * 2�� �л� ���� �Է� ���� : 70 ���� : 80 ���� : 90
		 * 
		 * ------------ 
		 * 
		 * 1�� �л� ���� ���� : 50 ���� : 60 ���� : 70 �հ� : 180 ��� : 60
		 * 
		 * 2�� �л� ���� ���� : 50 ���� : 60 ���� : 70 �հ� : 180 ��� : 80
		 * 
		 * ���� ��� : 60  ���� ��� : 70  ���� ��� : 80
		 */

		Scanner sc = new Scanner(System.in);

		// �л� ���� ������ ������ 2���� �迭 ���� �� �Ҵ�
		int[][] score = new int[2][3];
		String[] subject = { "����", "����", "����" };

		// �л��� ���� �Է� �ޱ�
		for (int i = 0; i < score.length; i++) { // �� ���� 
							// score.length = 2
			System.out.println(i + 1 + "�� �л� ����");
			for (int j = 0; j < score[i].length; j++) { // �� ����
								// score.length = 3
				System.out.print(subject[j] + " : ");

				// subject �迭�� ����� ���� ������� ���
				score[i][j] = sc.nextInt(); // ���� �Է�
			}
			System.out.println(); // �ٹٲ�
		}
		// ��輱 ���
		System.out.println("------------------------");

		// �л� ���� ���� ���
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "�� �л� ����");
			
			int sum = 0; // �л� �Ѹ��� ���� ��
			for (int j = 0; j < score[i].length; j++) {
				System.out.println(subject[j] + " : " + score[i][j]);
				sum += score[i][j];
			}

			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + sum / score[i].length);
			System.out.println(); // �ٹٲ�
		}

		// �� ���� ���
		for(int j=0 ; j<score[0].length ; j++) { // ��
			
			int sum = 0; // ���� �հ�
			for(int i=0 ; i<score.length ; i++) { // ��
				sum += score[i][j];
			}
			
			System.out.println(subject[j] + "��� : " + sum / score.length);
		}
		
	}

}
