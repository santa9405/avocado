package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		/* ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
		������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		ex.
		1 2 3 4 5 6 7 8 9 10 */
		
		int[] arr = new int[10];
		
		for (int i=0; i<=arr.length; i++) {
			System.out.print(i + " ");
		}
		
	}

	public void practice2() {
		/* ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
		�������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		ex.
		10 9 8 7 6 5 4 3 2 1 */
		
		int[] arr = new int[10];
		
		for (int i=arr.length; i>=1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	public void practice3() {
		/* ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
		ex.
		���� ���� : 5
		1 2 3 4 5 */
		
		// Scanner, �迭, for��
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		for (int i=0 ; i<=num; i++) {
			int[] arr = new int[num];
			System.out.print(num);
		}
		
	}
	
	public void practice4() {
		
		/* ���̰� 5�� String�迭�� �����ϰ� �������, ���֡�, ��������, �������ơ�, �����ܡ��� �ʱ�ȭ �� ��
		�迭 �ε����� Ȱ���ؼ� ���� ����ϼ���.
		ex.
		�� */
		
		String[] str = { "���", "��", "����", "������", "����"};
		
		//System.out.println(String[1]);
		
		
		
		
	}
	
	
}
