package com.kh.darr.practice;

public class DArrayPractice {

	public void practice1() {
		/*
		 * 3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ� �ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� ��(0, 0)���� ���� �������� ����
		 * �� ����ϼ���.
		 * 
		 * ex. 
		 * (0, 0)(0, 1)(0, 2) 
		 * (1, 0)(1, 1)(1, 2) 
		 * (2, 0)(2, 1)(2, 2)
		 */

		String[][] result = new String[3][3];

		for (int i = 0; i < result.length; i++) { // ������

			for (int j = 0; j < result[i].length; j++) { // ������
				System.out.print("(" + i + "," + j + ")");

			}
			System.out.println();
		}

	}
	
	public void practice2() {
		/* 4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
			1) 1 ~ 16���� ���� ���ʴ�� �����ϼ���.
			2) ����� ������ ���ʴ�� ����ϼ���.
		    ex.
			1 2 3 4
			5 6 7 8
			9 10 11 12
			13 14 15 16 */
		
		String[][] result = new String[4][4];
		
		//int[][] result2 = new int[4][4];
		
		
		for (int i=0; i<result.length; i++) {
			
			for (int j=0; j<result[i].length; j++) {
				//sum += j;
				System.out.print(j+1+ " ");
			}
			System.out.println();
		}
		
		
	}
	

}
