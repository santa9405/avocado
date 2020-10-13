package com.kh.operator.service;

import java.util.Scanner;

public class B_BinaryOperator {

	
	public void arithmeticOp() {
		// arithmetic : ���
		// ��� ������ : 
		// ���� ��Ģ����(+ - * /)�� %(modulars, mod) �߰�
		// % : ������ ���� ������
		
		// �� ������ �Է¹޾� + - * / % ����� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.println("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));	
	}
	
	public void comparisonOp() {
		// ComparisonOp : ��
		
		// �� ������(���� ������)
		// �� �ǿ����ڸ� ���Ͽ� ���� (true, false)�� ��ȯ�ϴ� ������
		
		// * ��ȯ : ����� ����(����)����
		
		// a < b : a�� b �̸�? / b�� a �ʰ�?
		// a > b : a�� b �ʰ�? / b�� a �̸�?
		// a <= : a�� b ����?
		// a >= : a�� b �̻�?
		// a == b : a�� b�� ������?
		// a != b : a�� b�� �ٸ���?
		
		// tip. ���� ��ȣ���� '=' ǥ�ô� ������ ������!
		
		int num1 = 10;
		int num2 = 25;
		int num3 = 25;
		
		boolean result1, result2;
		// ���� �ڷ��� ���� ���� �� �� �ٷ� ���޾� ���� ����
		// --> ���ʻ� ������� ����
		// �� �ٿ��� �ϳ��� �ǹ̸��� ������ �ۼ��ϴ� ���� ���� ������
		
		result1 = num1 == num2; // == �켱������ �����Ƿ� num1 == num2 ����� result1 �� ������. ����� false
		result2 = num2 != num3; // != �켱������ �����Ƿ� num2 != num3 ����� result2�� ������. ����� false
		
		
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 < num2 : " + (num1 < num2));

		System.out.println("num2 >= num3 : " + (num2 >= num3));
		System.out.println("num2 <= num3 : " + (num2 <= num3));
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result1 == result2 : " + (result1 == result2));
		
		// %, == , != �̿��Ͽ� Ȧ��, ¦��, ��� �Ǻ�
		num1 = 5;
		
		System.out.println("num1�� ¦���ΰ�? : " + (num1 % 2 == 0) );
		System.out.println("num1�� Ȧ���ΰ�? : " + (num1 % 2 == 1) );
		
		System.out.println("num1�� 5�� ����ΰ�? : " + (num1 % 5 == 0) );
		
	}
	
	public void logicalOp() {
		// �� ������
		// - ���� �� ���� ���ϴ� ������
		
		// && (AND) : �� �� true�� ���� true
		// -> �׸���, ~�鼭, ~�̸鼭, ~����, ~����, ~����
		
		// || (OR) : �� �� false�� ���� false
		// -> �Ǵ�, ~�ų�, ~�̰ų�
		
		// �Է¹��� ������ 1 ~ 100 ���� �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		boolean result = (input >= 1) && (input <= 100);
		System.out.println(input + "��/�� 1~100 �� �ΰ�? : " + result);
		
	}
	
	public void logicalOp2() {
		// �Է¹��� ���ĺ��� �빮��(A~Z)���� �˻�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ĺ� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A' <= ch <= 'Z'
		boolean result = ('A' >= ch) && (ch <= 'Z');
		// char �ڷ����� ���� ����Ǵ� ���� �����̹Ƿ�
		// ���ڳ����� ���� �񱳰� �����ϴ�.
		
		System.out.println(ch + "��/�� �빮�� �ΰ�? : " + result);
		
	}
	
	public void logicalOp3() {
		// �Է� ���� ���ڰ� 'Y' ���� �˻�(��ҹ��� ���� X)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		// �Է¹��� ���ڰ� 'Y' �̰ų� 'y'
		boolean result = (ch == 'Y') || (ch == 'y');
		
		System.out.println(ch + "��/�� 'Y' �Ǵ� 'y' �ΰ�? : " + result);
		
		
	}
	
	public void logicalOp4() {
		// ���� + ��� + �� + ��
		
		int a = 2;
		int b = 3;
		
		boolean c = a > b; // false
		boolean d = ++a <= b++; // true 
					//3 <= 3
						// 4�� ����
		
		System.out.println("a : " +a); // 3
		System.out.println("b : " +b); // 4
		System.out.println("c : " +c); // false
		System.out.println("d : " +d); // true
		
		System.out.println();
		
		System.out.println("!c : " + !c); // true
		System.out.println("c != d : " + (c != d)); // true
		
		System.out.println();
		
		System.out.println("(a % b) == 1 : " + ((a % b) == 1)); // false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); // true
		System.out.println("!d || (a-b) > 0 : " + (!d || (a-b) > 0)); // false 
													// false  || (3-4) > 0
	
		
		System.out.println();
		
		System.out.println("!(c == d) && ((a * b == 10) || ( b % 2 == 0)) : " + (!(c == d) && ((a * b == 10) || ( b % 2 == 0)))); 
																			//	t (f || t)
		
	}
	
	public void compoundAssignmentOp() {
		// ���� ���� ������
		// - �ٸ� �����ڿ� ���� �����ڸ� �Բ� ����ϴ� ������
		// - �ڱ� �ڽŰ� ���� ��
		//	  ����� �ٽ� �ڱ� �ڽſ� ����
		
		// * ���� ���� ������ ���� ó���ӵ��� �ξ� �����Ƿ� ��� ����
		
		int num = 12;
		
		// 3����
		// num = num + 3;
		num += 3;
		System.out.println("3���� : " + num); // 15
		// 5����
		num -= 5;
		System.out.println("5���� : " + num);	// 10
		// 6�� ����
		num *= 6;
		System.out.println("6������ : " + num); // 60
		// 1/2�� ����
		num /= 2;
		System.out.println("1/2�� ���� : " + num);	// 30
		// 4�� ������ �� ������
		num %= 4;
		System.out.println("4�� ������ �� ������ : " + num); // 2
		
	}
	
	
	
	
	
	
	
}
