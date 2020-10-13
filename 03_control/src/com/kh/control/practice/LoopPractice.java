package com.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1(){
		 /* ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
			 ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
			 ���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
			 ex.
			 1�̻��� ���ڸ� �Է��ϼ��� : 4
			 1 2 3 4 
			 1 �̻��� ���ڸ� �Է����ּ���. 
		 	 1�̻��� ���ڸ� �Է��ϼ��� : 0
			 */
		 
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		 
		if (num1 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
		}
		
		for (int i = 1; i <= num1; i++) {
			System.out.print(i);
			
		}
		
		 
	 }

	public void practice2(){
		/* 1���� ����ڿ��� �Է� ���� �������� �������� ���� for���� �̿��Ͽ� ����ϼ���.
			ex.
			������ �ϳ� �Է��ϼ��� : 8
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �ϳ� �Է��ϼ��� : ");
		int iNum = sc.nextInt();
		
		int sum = 0;
		
		for (int i=1; i<=iNum ; i++) {
			sum += i;
			System.out.print(i + " + " + sum );
		}
		
		
		
		
		
		
	}
}
