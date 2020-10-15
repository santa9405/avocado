package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class C_ArrayOverlap {
	// �迭 �ߺ� ����
	// [1, 3, 3, 4, 5]

	public void example1() {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) { // �Է¹��� �迭 ��� ����
			System.out.println(i + "�� �ε��� �� �Է� : ");
			arr[i] = sc.nextInt();

			// �̹� �Էµ� ���� �� �Էµ� ���
			// "�̹� �Էµ� ���Դϴ�." ��� �� ���Է� �ޱ�

			for (int j = 0; j < i; j++) { // �� ��� ����

				if (arr[i] == arr[j]) {
					// ���� �Է¹��� arr[i] ����
					// �񱳴���� arr[j]�� ���� ���

					System.out.println("�̹� �Էµ� ���Դϴ�.");
					i--;
					break; // �ߺ��� ���� �Էµ� ��� �ٽ� ���� �ʿ� ���� ���߰� �� ��� ����� for������ ���ư�

				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

	public void example2() {
		// 1 ~ 10 ���� �ߺ����� ���� ���� 5�� ����
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {

			// ���� ���� �� ����
			arr[i] = (int) (Math.random() * 10 + 1); // Math.random �� double�� �̹Ƿ� int�� ���� ����ȯ

			// �ߺ� �˻�
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println("��� : " + Arrays.toString(arr));

	}

	public void createLoottoNumber() {
		// �Է� ���� �ݾ� ��ŭ �ζǹ�ȣ ����
		// 1000���� 1�پ�
		// ex) �ݾ� : 3000
		// �ζ� ��ȣ : [39, 10, 4, 3, 38, 23, 20]
		// �ζ� ��ȣ : [11, 21, 32, 36, 37, 38, 40]
		// �ζ� ��ȣ : [8, 15, 20, 24, 34, 36, 45]

		/*
		 * int[] lotto2 = new int[7];
		 * 
		 * for(int i=0; i<lotto2.length; i++) { lotto2[i] = (int)(Math.random() * 45 +
		 * 1);
		 * 
		 * for(int j=0; j<i; j++) {
		 * 
		 * }
		 * 
		 * }
		 */

		// 1 ~ 45 ���� �ߺ����� ���� �� 7��

		Scanner sc = new Scanner(System.in);

		System.out.print("�ݾ� : ");
		int won = sc.nextInt();

		for (int k = 1; k <= won / 1000; k++) {

			int[] lotto = new int[7];

			// �ζ� ��ȣ ����
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45 + 1); // Math.random �� double�� �̹Ƿ� int�� ���� ����ȯ

				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}

			// ������ �ζ� ��ȣ ����(��������)
			for (int i = 1; i < lotto.length; i++) { // ��ü ����, i=�ε��� ���� ��ȣ
				for (int j = i - 1; j >= 0; j--) { // ��� ����
					if (lotto[j + 1] < lotto[j]) { // ��� ������ ���� ��� ������ ���� ���
						int temp = lotto[j + 1]; // �ڸ� �ٲ�
						lotto[j + 1] = lotto[j];
						lotto[j] = temp;
					}

				}
			}

			System.out.println("�ζǹ�ȣ : " + Arrays.toString(lotto));

		}

	}

}
