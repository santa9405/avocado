package com.kh.control.condition.service;

import java.util.Scanner;

public class B_Switch {
	
	/* switch��
	 * 
	 * -if���� ���� ���ǹ�������
	 *  if���� �޸� ���ǽ��� ������ ������ �� ����
	 *   (== ���ǽ��� ����� �� �������� ���̿��� ��)
	 *   
	 * - ���ǽ��� ����� true/false(����)�� �ƴϾ ����� �� ����
	 * 
	 * - ���� �� : ���� �������� ��
	 * - case �������� break : ���� switch�� �������� �ؼ��Ǵ� ���� ����
	 * switch(���� �� �����){
	 * case ��1 : �����ڵ�1; break;
	 * case ��2 : �����ڵ�2; break;
	 * default : ��� case�� ��ġ���� ���� �� �����ϴ� �ڵ�;
	 * }
	 */

	public void example1() {
		// 1�� �Է��ϸ� "������"
		// 2�� �Է��ϸ� "�����"
		// 3�� �Է��ϸ� "�ʷϺ�"
		// �ٸ� ���ڸ� �Է��ϸ� "�߸� �Է��ϼ̽��ϴ�" ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : System.out.println("������"); break;
		case 2 : System.out.println("�����"); break;
		case 3 : System.out.println("�ʷϺ�"); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
		public void example2() {
			// ���� �ΰ��� ��� �����ڸ� 1���� �Է¹޾�
			// �����ڿ� �´� ������ �����Ͽ� ��� ����ϱ�
			// ��, �߸��� �����ڸ� �Է��� ��� "�ش��ϴ� �����ڰ� �������� �ʽ��ϴ�." ���
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.println("�� ��° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine(); // �Է� ���ۿ� �����ִ� ���๮�� ����
		
		System.out.println("������ : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0; // ���� ����� ������ ����
		switch(op) {
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		case '/' : result = num1 / num2; break;
		case '%' : result = num1 % num2; break;
		default : System.out.println("�ش��ϴ� �����ڰ� �������� �ʽ��ϴ�."); return;
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		
		}
		
		
		public void example3() {
			// ��޺� ���Ѻο�
			// ������ : ��ȸ
			//		    �ۼ� 
			//		    ����
			// ȸ��    : ��ȸ 
			//        �ۼ�
			// ��ȸ�� : ��ȸ
			
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� ���� : ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "������" : System.out.println("����");
		case "ȸ��" : System.out.println("�ۼ�");
		case "��ȸ��" : System.out.println("��ȸ");
		}
			
			
		}
		
		
		
	}
