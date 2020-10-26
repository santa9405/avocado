package com.kh.practice.view;

import java.util.Scanner;

import com.kh.practice.model.service.StudentManagementService;
import com.kh.practice.model.service.StudentManagementServiceImpl;
import com.kh.practice.model.vo.Student;

public class StudentManagementViewImpl extends StudentManagementView {

	private Scanner sc = new Scanner(System.in);
	private StudentManagementService service = new StudentManagementServiceImpl();

	// ��ü �л� ��ȸ view
	@Override
	public void selectAll() {
		// service.selectAll() �޼ҵ带 ȣ���Ͽ�
		// ��ü �л� ������ Student[]�� ��ȯ �޾� ȭ�鿡 ���
		// ��, �迭 ����� �������� null�̸� ��� �ݺ��� ����

		// service.selectAll �ϸ� students ��ü �迭�� ��ȯ�ȴ�
		// �� service.selectAll = students(Student[])
		
		// ���� ���� ����
		
		Student[] students = service.selectAll(); // �迭 ��ü �ּ� ���� ����
		
		System.out.println("========== ��ü �л� ��ȸ ==========");
		for(int i=0 ; i<students.length ; i++) {
			if(students[i] == null) {
				break;
			}
			
			System.out.println(students[i].toString());
		
		/* System.out.println("========== ��ü �л� ��ȸ ==========");
		for (int i = 0; i < service.selectAll().length; i++) {
			if (service.selectAll()[i] == null) {
				break;
			}
			System.out.println(service.selectAll()[i].toString()); */
		}
	}

	// �̸� �˻� view
	@Override
	public void selectName() {
		// �̸��� ��ġ�ϴ� �л��� �ִ��� �˻��ϱ� ����
		// �̸��� �Է¹޾� service.selectName(�Է¹����̸�)�� ȣ���ϰ�
		// ����� Student Ÿ������ ����.
		// ����� null�� �ƴҰ�� �˻� ��� ���,
		// ����� null�� ��� "��ġ�ϴ� �л��� �����ϴ�." ���

		System.out.print("[�̸� �˻�] �˻��� �л� �̸� �Է� : ");
		String name = sc.nextLine();
		
		Student std = service.selectName(name); // �Է¹��� name�� �����ض�
		
		System.out.print("[�˻� ���] : ");
		if(std == null) System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
		else			System.out.println(std);
		
		/* System.out.print("[�̸� �˻�]�˻��� �л� �̸� �Է� : ");
		String name = sc.nextLine();

		if (service.selectName(name).getName() == null) {
			System.out.println("��ġ �ϴ� �л��� �����ϴ�.");
		} else {
			System.out.println("[�˻� ���]" + service.selectName(name).toString()); 
		} */

	}

	// ���� �˻� view
	@Override
	public void selectGender() {
		// �̸��� ��ġ�ϴ� �л��� �ִ��� �˻��ϱ� ����
		// �̸��� �Է¹޾� service.selectGender(�Է¹�������)�� ȣ���ϰ�
		// ����� Student[] Ÿ������ �޾� for���� �̿��Ͽ� ���.
		// ������ �߸� �Է��� ��� "�߸� �Է��ϼ̽��ϴ�. (M �Ǵ� F�� �Է����ּ���.)" ���

		System.out.print("[���� �˻�] �˻��� ���� �Է�(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		if(gender == 'M' || gender == 'F' ) {
			Student[] students = service.selectGender(gender); // service.selectGender���� �ش��ϴ� ���� ���
			
			for(int i=0; i<students.length; i++) {
				System.out.println(students[i]);
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. (M �Ǵ� F�� �Է����ּ���.)");
		}
		
		/* System.out.print("[���� �˻�]�˻��� ���� �Է� : ");
		char input = sc.nextLine().charAt(0);

		if (input == 'M' || input == 'F') {

			System.out.println("[���� �˻� ���]");
			for (int i = 0; i < service.selectGender(input).length; i++) {
				if (service.selectGender(input)[i] == null) {
					break;
				}
				System.out.println(service.selectGender(input)[i].toString());
			}

		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. (M �Ǵ� F�� �Է����ּ���.)");
		} */
	}

	// ���� �˻� view
	@Override
	public void selectAge() {
		// ���̰� ��ġ�ϴ� �л��� �ִ��� �˻��ϱ� ����
		// ���̸� �Է¹޾� service.selectAge(�Է¹�������)�� ȣ���ϰ�
		// ����� Student[] Ÿ������ �޾� for���� �̿��Ͽ� ���.
		// ��, ���޹��� Student[]�� ���̰� 0�� ���
		// "���̰� ��ġ�ϴ� �л��� �����ϴ�." ���
		
		System.out.print("[���� �˻�] �˻��� ���� �Է� : ");
		int age = sc.nextInt();
		sc.nextLine(); // �Է� ���ۿ� �����ִ� ���๮�� ����
		
		Student[] students = service.selectAge(age);
		
		if(students.length == 0) {
			System.out.println("���̰� ��ġ�ϴ� �л��� �����ϴ�.");
		}else {
			for(int i=0; i<students.length; i++) {
				System.out.println(students[i]);
			}
		}
		
		/* System.out.print("[���� �˻�]�˻��� ���� �Է� : ");
		int input = sc.nextInt();
		
		if (service.selectAge(input).length != 0) {
		
		System.out.println("[���� �˻� ���]");
		for (int i = 0; i < service.selectAge(input).length; i++) {
			if (service.selectAge(input)[i]== null) {
				break;
			}
			System.out.println(service.selectAge(input)[i].toString());
		}

	}else {
		System.out.println("���̰� ��ġ�ϴ� �л��� �����ϴ�.");
		}	*/
	}

	// �л� ���� �߰� view
	@Override
	public void insertStudent() {
		// �̸�, ����, ������ �Է¹޾� Student ��ü�� �����ϰ�,
		// service.insertStundet(������ Student��ü)�� ȣ���Ͽ� ����.
		// (��ȯ�� ����)
		
		System.out.println("[�л� ���� �߰�]");
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ �Է����ּ��� : ");
		char gender = sc.nextLine().charAt(0);
		
		//Student std = new Student(name, age, gender); // ��ü ���� �� �ʱ�ȭ
		//service.insertStudent(std); // insertSudent�� ����
		
		// Student ��ü ���� �� ��ȯ�� �ּҰ��� service.insertStudent() �޼ҵ�� ����
		service.insertStudent(new Student(name, age, gender));
		
		/* System.out.println("[�л� ���� �߰�]");
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ �Է����ּ��� : ");
		char gender = sc.nextLine().charAt(0);
		
		Student std = new Student(name, age, gender);
		
		service.insertStudent(std); */
		
		
	}

	// �л� ���� ���� view
	@Override
	public void updateStudent() {
		// ������ �л��� �̸��� �Է¹ް� �̸��� ��ġ�ϴ� �л��� ������ �Ǵ�����
		// service.selectName(�˻��� �̸�)�� ȣ���Ͽ� Student Ÿ���� ��ȯ ����.
		// ��ġ�ϴ� �л��� ���� ��� "��ġ�ϴ� �л��̾����ϴ�." ��� �� �޼ҵ� ����.

		// ��ġ�ϴ� �л��� ������ ��� �̸�, ���� ,������ �Է¹޾� Student ��ü�� �����ϰ�
		// service.updateStudent(�˻��� �̸�, ������ �л���ü)�Ͽ� �л� ������ ����.
		// (��ȯ�� ����)
		
		System.out.print("[���� �л� �̸� �˻�] �Է� : ");
		String name = sc.nextLine();
		
		if (service.selectName(name) == null) {
			System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
		}else {
			System.out.println("[�л� ���� ����]");
			System.out.print("�̸� �Է� : ");
			String updateName = sc.nextLine();
			System.out.print("���� �Է� : ");
			int updateAge = sc.nextInt();
			sc.nextLine();
			System.out.print("���� �Է� : ");
			char updateGender = sc.nextLine().charAt(0);
			Student std = new Student(updateName, updateAge, updateGender);
			service.updateStudent(name, std);
		}
	}

	// �л� ���� ���� view
	@Override
	public void deleteStudent() {
		// ������ �л��� �̸��� �Է� �޾�
		// service.deleteStudent(�Է¹����л��̸�)�� ȣ���ϰ�
		// Student Ÿ���� ��ȯ �޾�
		// ���� ���� �� ������ �л� ���� + " �����Ǿ����ϴ�.,
		// ���� ���� �� "��ġ�ϴ� �л��� �����ϴ�." ���

		System.out.print("[�л� ���� ����]������ �л� �̸� : ");
		String name = sc.nextLine();
		
		// service.deleteStudent(�Է¹����л��̸�)�� ȣ���ϰ�
		// Student Ÿ���� ��ȯ �޾�
		Student std = service.deleteStudent(name);
		
		if(std == null) { // ���� ����
			System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
		}else { // ���� ����
			System.out.println(std + "�����Ǿ����ϴ�." );
		}
	}
}
