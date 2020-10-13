package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		/* Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
		ex.
		���� : -9
		����� �ƴϴ�*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int input = sc.nextInt();
		
		String result1 = (input > 0) ? "�����" : "����� �ƴϴ�";
		
		System.out.println(result1);
		
	}
	
	public void practice2() {
		/* Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�,
		����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
		ex.
		���� : -9
		������*/
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int input = sc.nextInt();
		
		String result2 = (input > 0) ? "�����" : (input == 0) ? "0�̴�" : "������";
		System.out.println(result2);
		
		
		
	}

	public void practice3() {
		/* Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		ex.
		���� : 5
		Ȧ����*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int input = sc.nextInt();
		
		String result3 = (input % 2 == 0) ? "¦����" : "Ȧ����";
		System.out.println(result3);
		
		
	}
	public void practice4() {
	/* ��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް�
		1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
		ex.
		�ο� �� : 29
		���� ���� : 100
		1�δ� ���� ���� : 3
		���� ���� ���� : 13*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ο� �� : ");
		int input = sc.nextInt(); // 29
		
		System.out.println("���� ���� : ");
		int input2 = sc.nextInt(); // 100
		
		int result4 = input2 / input; // 100 / 29
		int result5 = input2 % input;
		
		System.out.println("1�δ� ���� ���� : " + result4);
		System.out.println("���� ���� ���� : " + result5);
	}
	public void practice5() {
	/* Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
		�� �� ������ ��M���̸� ���л�, ��M���� �ƴϸ� ���л����� ��� ó�� �ϼ���.
		ex.
		�̸� : ȫ�浿
		�г�(���ڸ�) : 3
		��(���ڸ�) : 4
		��ȣ(���ڸ�) : 15
		����(M/F) : M
		����(�Ҽ��� �Ʒ� ��° �ڸ�����) : 85.75
		3�г� 4�� 15�� ȫ�浿 ���л��� ������ 85.75�̴�.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println("�г�(���ڸ�) : ");
		int a = sc.nextInt();
		System.out.println("��(���ڸ�) : ");
		int b = sc.nextInt();
		System.out.println("��ȣ(���ڸ�) : ");
		int c = sc.nextInt();
		sc.nextLine();
		System.out.println("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
		double db = sc.nextDouble();
		
		String result6 = (gender == 'M') ? "���л�" : "���л�";
		
		System.out.println(a + "�г� " + b + "�� " + c + "�� " + name + " " + result6 + "�� ������ " + db + "�̴�." );
		
	}
	
	public void practice6() {
		/* ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
		����(19�� �ʰ�)���� ����ϼ���.
		ex.
		���� : 19
		û�ҳ�*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		int iNum1 = sc.nextInt();
		
		String result7 = (iNum1 <= 13 ) ? "���" : ((iNum1 > 13 && iNum1 <= 19) ? "û�ҳ�" : "����");
		
		System.out.println(result7);
		
	}

	public void practice7() {
	/* ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
		�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
		�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
		�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
		ex.
		���� : 60
		���� : 80
		���� : 40
		�հ� : 180
		��� : 60.0
		�հ�*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		int iNum1 = sc.nextInt();
		System.out.println("���� : ");
		int iNum2 = sc.nextInt();
		System.out.println("���� : ");
		int iNum3 = sc.nextInt();
		
		int result8 = iNum1 + iNum2 + iNum3;
		double result9 = result8/3;
		
		System.out.println(result8);
		System.out.println(result9);
		
		String result10 = (iNum1 >= 40) && (iNum2 >= 40) && (iNum3 >= 40) && (result9 >= 60) ? "�հ�" : "���հ�" ;
		
		System.out.println(result10);
	}
	
	public void practice8() {
		/* �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���. (charAt() Ȱ��)
		ex.
		�ֹι�ȣ�� �Է��ϼ���(- ����) : 132456-2123456
		���� */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ�� �Է��ϼ���(- ����)");
		char ch1 = sc.nextLine().charAt(7);
		
		String result11 = (ch1 == '2' || ch1 == '4') ? "����" : "����";
		
		System.out.println(result11);
		
		
	}
	
	public void practice9() {
	/* Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
		�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
		�ƴϸ� false�� ����ϼ���.
		(��, num1�� num2���� �۾ƾ� ��)
		ex.
		����1 : 4
		����2 : 11
		�Է� : 13
		true */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����1�� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.println("����2�� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		System.out.println("����3�� �Է��ϼ��� : ");
		int num3 = sc.nextInt();
		
		String result = (num3 <= num1 || num3 >= num2) ? "true" : "false";
		
		System.out.println(result);
	}
	
	public void practice10() {
		/* 3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
		ex.
		�Է�1 : 5
		�Է�2 : -8
		�Է�3 : 5
		false */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2 && num2 == num3) ? "true" : "false";
		System.out.println(result);
	}
	public void practice11() {
		
		/* A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
		�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, �̸��̸� ��3000 �̸����� ����ϼ���.
		(A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
		ex.
		A����� ���� : 2500
		B����� ���� : 2900
		C����� ���� : 2600
		A��� ����/����+a : 2500/3500.0
		3000 �̻�
		B��� ����/����+a : 2900/2900.0
		3000 �̸�
		C��� ����/����+a : 2600/2989.9999999999995
		3000 �̸�*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A����� ���� : ");
		int money1 = sc.nextInt();
		
		System.out.println("B����� ���� : ");
		int money2 = sc.nextInt();
		
		System.out.println("C����� ���� : ");
		int money3 = sc.nextInt();
		
		double in1 = (money1 + money1 * 0.4);
		double in2 = money2;
		double in3 = (money3 + money3 * 0.15);
		
		String result1 = (in1 >= 3000) ? "3000 �̻�" : "3000 �̸�";
		String result2 = (in2 >= 3000) ? "3000 �̻�" : "3000 �̸�";
		String result3 = (in3 >= 3000) ? "3000 �̻�" : "3000 �̸�";
		
		System.out.println("A��� ����/����+a : " + money1 + "/" + result1);
		System.out.println("B��� ����/����+a : " + money2 + "/" + result2);
		System.out.println("C��� ����/����+a : " + money3 + "/" + result3);
		
		
		
		
		
		
		
	
	}
}
