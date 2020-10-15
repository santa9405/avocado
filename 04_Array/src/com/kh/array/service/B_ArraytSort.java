package com.kh.array.service;

import java.util.Arrays;

public class B_ArraytSort {
	// �迭 ����
	// - �������� �� �ٲٴ� ����� ������ �־�� ��
	// - for���� �̿��� �迭 ���� ����� �� �����ϰ� �־�� ��

	// 1) �迭 ��� ���� �� �ٲٱ�
	// 2) ���� ����
	// 3) ���� ����

	public void example1() {
		int[] arr = { 2, 1, 3 };

		// �������� : ���� �� -> ū �� ����
		// �������� : ū �� -> ���� �� ����

		// ���� ���� �� �ٲٱ�
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void insertionSort() {
		// ���� ������ ���� �� ����
		// ���� ����
		// - ���� �˰��򿡼� ���� �����ϰ� �⺻�� �Ǵ� �˰���
		// - �迭�� n��° ��Ҹ�
		// 0 ~ n-1 ��Ұ� ���Ͽ� ������ ����

		int[] arr = { 2, 5, 4, 1, 3 };

		System.out.println("�ʱⰪ : " + Arrays.toString(arr));

		// 1. �� ��ü�� �����ϴ� for��
		for (int i = 1; i < arr.length; i++) {
			System.out.println("�� ��ü : " + arr[i]); // �� ��ü : 5

			// 2. �� ����� �����ϴ� for��
			for (int j = i - 1; j >= 0; j--) {

				// �� ��ü�� ��󺸴� ���� �۴ٸ� �� ��ȯ
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

					// �� ��ȯ�� �Ͼ �� �迭 ���
					System.out.println(Arrays.toString(arr));
				}
			}
		}

		System.out.println("��� : " + Arrays.toString(arr));

	}

	public void bubbleSort() {
		// ���� ����
		// - ������ �� ��Ҹ� �˻��Ͽ� �����ϴ� �������
		// �迭�� ���ʺ��� ������ �ϼ��Ǵ°� Ư¡
		// - ������ ���ٶ�� ������ �ְ�,
		// �̹� ���ĵ� �����͸� �ٽ� ������ �� �ӵ��� ���� ����(ex. ���ο� ���� ���� ���)

		// - ó����ó ���� �� ��� �ٸ� ���� ������� ���ļӵ��� ����

		int[] arr = { 2, 5, 4, 1, 3 };

		System.out.println("�ʱⰪ : " + Arrays.toString(arr));

		// 1. ȸ�� ����
		// ��ü ������ �� -1ȸ ��ŭ �ݺ�
		for (int i = 0; i < arr.length - 1; i++) { // i=arr�� �ε��� ��, 4ȸ���� �ݺ�
			System.out.println(i+1 + "ȸ��");

			// 2. ���� ��� ������ ���� for��(bubble �̵�)
			for (int j = 0; j < (arr.length - 1) - i; j++) { // j�� ȸ������ �ε��� ���� �� ���Ǳ���
				// 4

				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}

		}

		System.out.println("��� : " + Arrays.toString(arr));

	}

}
