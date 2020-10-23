package com.kh.poly.model.service;

import com.kh.poly.model.vo.Animal;
import com.kh.poly.model.vo.Fish;
import com.kh.poly.model.vo.Person;
import com.kh.poly.model.vo.Snake;

public class PolyService {
	public void example1() {
		// * x 50
		// ������
		// - ����� �̿��� ����� �θ� Ÿ�� �������� �ϳ���
		//   ��� ���迡 �ִ� ���� Ÿ���� �ڽ� ��ü�� ������ �� �ִ� ���
		
		// �θ� ���� = �θ� ��ü
		Animal a = new Animal();
		
		// �ڽ� ���� = �ڽ� ��ü
		Person p = new Person(); // Animal ��ü�� ���ο� ���ԵǾ� ����
		Fish f = new Fish(); // Animal ��ü�� ���ο� ���ԵǾ� ����
		Snake s = new Snake(); // Animal ��ü�� ���ο� ���ԵǾ� ����
		
		// ������ �˰��ִ� ���� ���� ��ü ���� ���
		// Person person = new Person();
		
		// ��ĳ���� : ���������� Ÿ���� �θ� Ÿ������ ����Ǵ� ��
		// -> �θ�Ÿ���� ���������� �ڽ� ��ü�� �����ϴ� ��
		Animal person = new Person();
		
		// person.studyJava(); // �ڽ� ��ü�� ���� ����� ������ �� ����
		a.eat();
		person.eat();
		// ���α׷� ���� ��(������ �ܰ����) person(Animal)
		// person��(Anilam)�� �����ϰ� �ִ� ��ü��
		// person��ü ���ο� �����ϴ� Animal ��ü�� eat()�� ȣ����.
		// --> ���� ���ε�
		
		// ���α׷� ���� ��
		// person(Animal) �� �����ϰ� �ִ� ��ü�� eat()�� ȣ���ϸ�
		// ���ο� �����ϴ� Animal ��ü�� eat()�� �ƴ�
		// �������̵� �� Person�� eat()�� ȣ����
		// --> ���� ���ε�
		
		Animal[] arr = new Animal[4];
		
		arr[0] = new Animal();
		arr[1] = new Person();
		arr[2] = new Fish();
		arr[3] = new Snake();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].breath();
			// arr�� 0, 1, 2�� �ε��� ��Ұ� �����ϰ� �ִ�
			// �ڽ� ��ü���� �θ��� Animal�� ���� ��ӹ���
			// breath() �޼ҵ带 �������̵� �Ͽ��� ������
			// ������ ������ �θ��� breath()�� ���ε� �Ǿ� �ִٰ�(���� ���ε�)
			// ���� �߿��� ���� �������̵� �� breath()�� �����(���� ���ε�)
		}
		
		
		// �θ� ���������� �ڽĸ��� �޼ҵ� ȣ��
		
		// Person ��ü ���� ���� ��������
		//arr[1].studyJava();
		// �θ� Ÿ�� ���������δ� �ڽ� �� �θ� �κи� ���� ����
		
		// �ٿ� ĳ����
		// �θ� ���� ���� = �ڽ� ��ü
		// --> �ڽ� ���� ���� = �ڽ� ��ü
		// ���������� �θ�->�ڽ����� �������ν�
		// �ڽ� ��ü�� ������ ������ �� �ְԵ�
		
		// (Person)arr[1].studyJava(); // X
		// -> (�ڷ���), . �� ���� �� .(�� ������)�� �켱������ ����
		
		System.out.println("\n============ �ٿ� ĳ���� ============");
		((Person)arr[1]).studyJava();
		((Fish)arr[2]).swim();
		((Snake)arr[3]).lock();
		
		System.out.println("\n ==== instanceof ==== ");
		for(int i=0; i<arr.length; i++) {
			// instanceof ������
			// - ���� ������ Ư�� �ڷ��� ��ü�� �����ϰ� �ִ��� Ȯ���ϴ� ������
			// 1) ���� ������ �����ϰ� �ִ� ��ü�� Ư�� �ڷ��� ��ü�� ���� �ϴ°�?
			// 2) ���� ������ Ư�� �ڷ������� ����ȯ�� �� �� �ִ°�?
			
			if(arr[i] instanceof Person) { // arr[i]��  ��ü�� Person ���� ����ȯ �� �� �ִ���?
				((Person)arr[i]).studyJava();
			}else if(arr[i] instanceof Fish) {
				((Fish)arr[i]).swim();
			}else if(arr[i] instanceof Snake) {
				((Snake)arr[i]).lock();
			}else {
				System.out.println("�׳� Animal ��ü�Դϴ�.");
			}
	

		}
		
		
	}
	
	
	
	
	
	
	
}
