package com.kh.control.loop.service;

import java.util.Scanner;

public class A_For {
	/*
	 * 1. for�� (���� for��)
	 * 
	 * for(�ʱ��; ���ǽ�; ������){ ���� �� �ڵ�; }
	 * 
	 * - �ʱ�� : for�� ���ο��� ����� ������ ������ �� �ִ� �κ� -> ���� �ݺ��� ��� ���� ������ ������
	 * 
	 * - ���ǽ� : ������ ��ȯ�Ǵ� ���� �ۼ� true�� ��� : �ݺ��� ���� false�� ��� : �ݺ��� ����
	 * 
	 * - ������ : 1ȸ �ݺ� ���� �� ���� ����� ������ �ۼ� -> ���� �ʱ���� ���� �Ǵ� ���ҽ��� ���� ������ ����� �뵵�� ���
	 */

	public void example1() {
		// 1���� 5���� ���

		for (int i = 5; i < 11; i++) {
			System.out.println(i);
		}
	}

	public void example2() {
		// 5���� 1���� 1�� �����ϸ鼭 ���

		for (int i = 5; i >= 1; i--) {
			System.out.println(i);

		}
	}

	public void example3() {
		// 1 ~ 10 ���� 0.5�� �����ϸ鼭 ���
		for (double i = 1; i <= 10; i += 0.5) {
			System.out.println(i);
		}

	}

	public void example4() {
		// A ~ Z���� ������� ���
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}

	}

	public void example5() {
		// 1���� 10 ������ ���� �� Ȧ���� ���
		// 1 3 5 7 9
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " ");

			}
		}

		System.out.println("\n=============================\n");

		for (int i = 1; i <= 10; i += 2) {
			// 1 3 5 7 9
			System.out.println(i + " ");
		}

	}

	public void example6() {
		// �Ǽ��� 3�� �Է¹޾� �հ�, ��� ���
		Scanner sc = new Scanner(System.in);

		// �հ� ���ϱ�
		double sum = 0;

		for (int i = 1; i <= 3; i++) {
			System.out.println("�Ǽ��Է�" + i + " : ");

			// �Է� ���� ���� sum������ ����
			sum += sc.nextDouble(); // ������ ���ϱ� ������ ������ �ȴ�Ƶ� ������
		}

		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum / 3);

	}

	public void example7() {
		// ���� �ϳ��� �Է¹޾� �����ܿ��� �ش��ϴ� ���� ���

		// ���� �Է� : 5
		// 5 X 1 = 5
		// 5 X 2 = 10
		// 5 X 3 = 15
		// ...
		// 5 X 9 = 45

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է� : ");
		int dan = sc.nextInt(); // ��Ȱ�� �ؾ��ϱ� ������ ������ ����

		if (dan >= 2 && dan <= 9) {
			for (int su = 1; su <= 9; su++) {
				System.out.println(dan + " x " + su + " = " + dan * su);
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

	public void example8() {
		// 1~10 ���� ������ ����(����) 5���� ����ϰ�, �հ� ���

		/*
		 * java.lang.Math.random() - �ڹٿ��� ���� ���� ����� �����ϴ� Math Ŭ������ �޼ҵ� �� �ϳ� - ���� �߻� ���� :
		 * 0.0 <= random < 1.0 (double)
		 */

		// java.lang ��Ű���� �ڹ��� �⺻ ��Ű����
		// ������ �� �ڵ����� import�� �߰���
		// -> java.lang�� �����ִ� Ŭ������ ������ import�� �ۼ����� �ʾƵ� ��
		// System.out.println(java.lang.Math.random()); // (Math.random) ���� �ص� ��

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int random = (int) (Math.random() * 10 + 1);
			// 0.0 <= Mate.random() < 1.0
			// 0.0 <= Mate.random() * 10 < 10.0
			// 1.0 <= Mate.random() * 10 + 1 < 11.0
			// 1 <= (int)(Mate.random() * 10 + 1) < 11

			sum += random; // �հ� ����
			System.out.println(random);
		}

		System.out.println("�հ� : " + sum);

	}

	public void example9() {
		// 1 ~ 20 ���� ������ ������ �߻�����
		// 1���� �߻��� ������ �� ������ �� ����ϱ�

		int random = (int) (Math.random() * 20 + 1);

		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("random : " + random);
		System.out.println("sum : " + sum);
	}

	public void example10() {
		// ���� 2���� �Է¹޾�
		// �� ���� ������ ��� ������ ���� ���

		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�1 : ");
		int num1 = sc.nextInt();

		System.out.println("�Է�2 : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			// �� ������ ����� �� �ٲٱ�
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}

		System.out.println("sum : " + sum);

	}

	// ==================================================================================================

	// ��ø for��

	public void example11() {
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345

		for (int i = 1; i <= 3; i++) { // �� ����

			for (int j = 1; j <= 5; j++) { // �� ����

				System.out.print(j);
			}

			System.out.println(); // �ٹٲ�
		}

	}

	public void example12() {
		// ��, �� ����ϱ�
		// 0�� 0�� ~ 59�� 59��
		for (int min = 0; min < 60; min++) {

			for (int sec = 0; sec < 60; sec++) {

				System.out.println(min + "��" + sec + "��");

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}

			}
		}

	}

	public void example13() {
		// 2�ܺ��� 9�ܱ��� ������ ��� ���

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	public void example14() {
		// ������ �Ųٷ� ���

		for (int i = 9; i >= 2; i--) { // ��
			System.out.println("====" + i + "��====");
			for (int j = 9; j >= 1; j--) { // ����
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}

	}

	public void example15() {
		// ���� �Է� : 5
		// 1
		// 12
		// 123
		// 1234
		// 12345
		// ����� �´� ���ǰ� �ʱ���� �ۼ� �ؾ� ��
		// �Էµ� ���ڸ�ŭ�� ��� ��

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) { // ��

			for (int j = 1; j <= i; j++) { // ��

				System.out.print(j);
			}

			System.out.println(); // �ٹٲ�
		}

	}

	public void example16() {
		// ���� �Է� : 5
		/*
		 * 1 (1�� 1��) 2 3 (2�� 2��) 4 5 6 (3�� 3��) 7 8 9 10 (4�� 4��) 11 12 13 14 15
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int input = sc.nextInt();

		int count = 1;
		for (int i = 1; i <= input; i++) { // �� (i�� 1�� �� ���� for���� ����)

			for (int j = 1; j <= i; j++) { // �� (j�� i���� ���� ������ "System.out.print(count++ + " ");" ����)
				System.out.print(count++ + " ");
				// count++; // ���� for���� ����� �� count�� 1�� ����
			}
			System.out.println();
		}

	}

	public void example17() {
		// �� �ٿ� ��ǥ���ڸ� �Էµ� �� ���� ĭ ����ŭ ���
		// ��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
		/*
		 * �� �� : 6 ĭ �� : 6 1***** Ư�� ���ǿ� ���ڰ� �Է� �� *2**** ���� ���ǹ��� �ɾ�� �� **3*** ***4**
		 * ****5* *****6
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("�� �� : ");
		int row = sc.nextInt();

		System.out.println("ĭ �� : ");
		int col = sc.nextInt();

		for (int r = 1; r <= row; r++) { // �� ��(��)

			for (int c = 1; c <= col; c++) { // ĭ ��(��)

				if (r == c) {
					System.out.print(r);
				} else {
					System.out.print("*");
				}

			}

			System.out.println();
		}

	}

}
