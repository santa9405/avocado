package com.kh.control.loop.service;

import java.util.Scanner;

public class B_While {
	/* while��
	 * 
	 * - for���� �޸� ���� ������ ��Ȯ���� ��쿡 ����ϴ� �ݺ���
	 * 
	 * [�ʱ��] * [] <- ���ȣ�� ������ �� ������ �ǹ���
	 * while(���ǽ�){
	 * 		�����ڵ�;
	 * 		[������]
	 * }
	 */
	public void example1() {
		// 1 ~ 5 ���� ���
		int i = 1; // �ʱ��
		while(i <= 5) { // ���ǽ�
			System.out.println(i);
			i++; // ������
		}
		
	}
	
	public void example2() {
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void example3() {
		// �ԷµǴ� ��� �� ���ϱ�
		// ��, 0 �Է� �� ������ ���� ����ϰ� ����
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int input = -1; 
		// -1�� while���� �ٷ� ������� �ʰ� �ο��� ������ ��
		
		while(input != 0) { // ���ǽ�
			System.out.println("���� �Է� : "); // ���� �ڵ�
			input = sc.nextInt();
			
			sum += input;
		}
		
		System.out.println("�հ� : " + sum);
		
		/* count input sum
		 *  1	 1    1
		 *  2	 2    3
		 *  3	 5    8
		 *  4	 0    8 -> 0�� �ԷµǾ� while�� ����
		 *  */
		
	}
	
	public void example4() {
		// �ԷµǴ� ��� �� ���ϱ�
		// ��, -1 �Է� �� �հ踦 ����ϰ� ����
		// (-1 �Է� �� sum�� �������� �ʰ� �Ͻÿ�)
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �հ� ����� ����
		int input = 0; // �Է¹��� ���� ������ �ӽ� ����
		
		boolean flag = true;
		
		while(flag) { // flag�� true �̹Ƿ� while�� ���� ��
			System.out.print("���� �Է� : ");
			input = sc.nextInt();
			
			if(input == -1) {
				flag = false; // -1�� �� ����� ����
			} else {
				sum += input;				
			}
			
		}
		
		System.out.println("�հ� : " + sum);
		
		/* count input sum
		 *  1	  5    5
		 *  2	  3    8
		 *  3	 -1    7
		 *  */
		
	}
	
	public void example5() {
		// �ԷµǴ� ��� �� ���ϱ�
		// ��, -1 �Է� �� �հ踦 ����ϰ� ���� 
		// (-1 �Է� �� sum�� �������� �ʰ� �Ͻÿ�)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �հ� ����� ���� 
		int input = 0; // �Է¹��� ���� ������ �ӽ� ����
		
		
		while(input != -1) {
			System.out.print("���� �Է� : ");
			input = sc.nextInt();
			
			if(input != -1) {
				sum += input;
			}
			
		}
		
		System.out.println("�հ� : " + sum);
		
	}
	
	
	
	
	
	
	
}
