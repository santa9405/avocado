package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	
	public void autoCasting() {
		// 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����");
		char e = sc.nextLine().charAt(0);
		int i = e;
		
		System.out.println(e + "unicode : " + i);
		
		// ���� ���ϰ� ���� ����ȯ �� ���
		// System.out.println(ch + "unicode : " + (int)ch);
		
		

	}
}
