package com.kh.poly.ex2.run;

import com.kh.poly.ex2.model.service.StudentService;
import com.kh.poly.ex2.model.service.StudentServiceImpl;

public class StudentRun {
	public static void main(String[] args) {
		
		// �߻�Ŭ������ ��ü�� ������ ���ϰ� �� �� ���
		// �������̽��� ����� ���, ��Ģ�� �ο��� �� ���
		
		// �������̽��� �θ� ���������� Ȱ��, ������ - ��ĳ����
		StudentService service = new StudentServiceImpl(); // �ӵ��� ������ �ϰ� ������ ������ ���� ����� ����
		//StudentService service = new StdServiceImpl(); // 
		
		long start = System.nanoTime();
		
		service.addStudent("ȫ�浿");
		service.addStudent("��ö��");
		service.addStudent("�ڿ���");
		service.addStudent("�̼���");
		service.addStudent("������");
		service.addStudent("������");
		service.addStudent("���Ѽ�");
		
		long end = System.nanoTime();
		
		System.out.println(end - start);
			
		System.out.println("���� �����.");
		
	}
}
