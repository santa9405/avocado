package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void practice() {
		
		// Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
		/* ex.
		ù ��° ���� : 23
		�� ��° ���� : 7
		���ϱ� ��� : 30
		���� ��� : 16
		���ϱ� ��� : 161
		������ �� ��� : 3 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int e = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int i = sc.nextInt();
		
		//���� ���
		int ej = e + i;
		int je = e - i;
		int ee = e * i;
		int jj = e / i;
		
		System.out.println("\n���ϱ� ��� : " + ej);
		System.out.println("���� ��� : " + je);
		System.out.println("���ϱ� ��� : " + ee);
		System.out.println("������ ��� : " + jj);
		
		
		//System.out.println("\n���ϱ� ��� : " + (e + i));
		//System.out.println("���� ��� : " + (e - i));
		//System.out.println("���ϱ� ��� : " + e * i);
		//System.out.println("������ �� ��� : " + e / i);
	
		
		
		
		
		
		
		
	}
}
