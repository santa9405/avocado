package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void aaa() {
		
		/* �Ǽ������� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
		�� �� ������ ����� ���������� ó���ϼ���. 
		ex.
		���� : 90.0
		���� : 90.0
		���� : 90.0
		���� : 270
		��� : 90
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double k = sc.nextDouble();
		
		System.out.print("���� : ");
		double e = sc.nextDouble();
		
		System.out.print("���� : ");
		double m = sc.nextDouble();
		
		int sum = (int)(k + e + m);
		int avg = (sum / 3);
		
		System.out.println("���� : " + sum + "\n��� : " + avg);
		
		
	}

}
