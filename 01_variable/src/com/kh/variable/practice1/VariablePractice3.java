package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void practice() {
		
		Scanner sc = new Scanner(System.in);
		
		/* Ű����� ����, ���� ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		��� ���� ) ���� : ���� * ����
		�ѷ� : (���� + ����) * 2
		
		ex.
		���� : 13.5
		���� : 41.7
		���� : 562.95
		�ѷ� : 110.4 */
		
		System.out.print("����  : ");
		double e = sc.nextDouble();
		
		System.out.print("���� : ");
		double i = sc.nextDouble();
		
		System.out.println("���� : " + (e * i));
		System.out.println("�ѷ� : " + (e + i) * 2);
		
		
	}
}
