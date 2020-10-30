package com.kh.noticeBoard.view;

import java.util.List;

import com.kh.noticeBoard.model.service.BoardService;
import com.kh.noticeBoard.model.service.BoardServiceImpl;
import com.kh.noticeBoard.model.vo.Board;

public class BoardViewImpl extends BoardView {

	private BoardService service = new BoardServiceImpl();

	@Override
	public void viewAll() {
		// service.viewAll() �޼ҵ带 ȣ���Ͽ� �Խñ� ����Ʈ�� ��ȯ�޾�
		// �ۼ��� ��ü �Խñ��� ��ȸ�ϴ� ���
		// �Խñ��� ����� �ۼ���, ��ȸ���� ǥ�õǾ�� �Ѵ�.

		List<Board> board = service.viewAll();
		for (Board boardList : board) {
			System.out.println(boardList);
		}
	}

	@Override
	public void selectTitle() {
		// service.selectTitle() �޼ҵ带 ȣ���Ͽ�
		// ���޹��� �Ű������� ���� �������� �˻��Ͽ� �Խñ��� ��ȸ�ϴ� ���
		// ������ �˻��ؼ� �Խñ��� ��ȸ�� ��� �ش� �Խñ��� ��ȸ���� 1 ������Ų��.

		System.out.println("�Խñ� ���� �Է� : ");
		String title = sc.nextLine();

		Board board = service.selectTitle(title);

		if (board != null) {
			System.out.println(board);
		} else {
			System.out.println("�˻��� �Խñ��� �������� �ʽ��ϴ�.");
		}

	}

	@Override
	public void selectAuthor() {
		// ���޹��� �Ű������� ���� �ۼ��ڷ� �˻��Ͽ� �Խñ��� ��ȸ�ϴ� ���
		// service.selectAuthor() �޼ҵ带 ȣ���Ͽ� ����Ʈ�� ��ȯ�޾�
		// ���� for���� �̿��Ͽ� ����Ѵ�.
		// �ۼ����� �̸����� �˻��ؼ� �Խñ��� ��ȸ�� ��� ��ȸ���� ������ �ʴ´�.

		System.out.println("�Խñ� �ۼ��� �Է� : ");
		String author = sc.nextLine();

		List<Board> board = service.selectAuthor(author);

		for (Board boardList : board) {
			System.out.println(boardList);
		}

	}

	@Override
	public void createBoard() {
		// �Խñ��� ���� �ۼ��ϴ� ���
		// ����, �ۼ���, �Խñ� �����
		// �Խñ��� ��й�ȣ�� �Է¹����� Board ��ü�� �����ϰ�
		// service.create() �޼ҵ带 ȣ���Ͽ� Board ��ü�� �Ű������� �����Ͽ�
		// ���ο� �Խñ��� �߰��Ѵ�.

		System.out.println("���� �Է� : ");
		String title = sc.nextLine();
		System.out.println("�ۼ��� �Է� : ");
		String author = sc.nextLine();
		System.out.println("���� �Է� : ");
		String content = sc.nextLine();

		Board board = new Board(title, author, content);

		service.createBoard(board);
	}

	@Override
	public void updateBoard() {
		// �����ϴ� �Խñ��� �����ϴ� ���
		// �Է¹��� ����� ��ġ�ϴ� �Խñ��� �������
		// "�Է��Ͻ� ����� ��ġ�ϴ� �Խñ��� �������� �ʽ��ϴ�."�� ���
		// ����� �ۼ���, ����, ��й�ȣ�� �Է¹��� ��
		// ��й�ȣ�� �Ű������� ���� �����ؼ� ��й�ȣ�� �˻��ϰ�
		// service.updateBoard() �޼ҵ带 ȣ���Ͽ�
		// ����� ��й�ȣ�� �����ϸ� ���� null ���� ���ϵǸ�
		// "�Է��Ͻ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�." ���
		System.out.println("������ �Խñ� ���� �Է� : ");
		String title = sc.nextLine();

		Board board = service.selectTitle(title);

		if (board == null) {
			System.out.println("�Է��Ͻ� ����� ��ġ�ϴ� �Խñ��� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("���� : ");
			String updateTitle = sc.nextLine();
			System.out.println("�ۼ��� : ");
			String updateAuthor = sc.nextLine();
			System.out.println("���� : ");
			String content = sc.nextLine();
			System.out.println("��й�ȣ : ");
			String pwd = sc.nextLine();
			
			Board abc = new Board(updateTitle, updateAuthor, content);

			String str = service.updateBoard(title, pwd, abc);
			
			if(str != null) {
			System.out.println(str);
			}else {
				System.out.println("�Է��Ͻ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
			}
			
		}

	}

	@Override
	public void deleteBoard() {
		// �����ϴ� �Խñ��� �����ϴ� ���
		// ������ �Խñ��� ����� ��й�ȣ�� �Է¹ް�
		// �ӽ� Board ��ü�� ���� �� service.deleteBoard() �޼ҵ带 ȣ���Ͽ�
		// ����� ��й�ȣ�� �˻� �� ��
		// �˻縦 ����ϸ� ������ �Խñ� ���� + " �Խñ��� �����Ͽ����ϴ�." ���
		// �˻縦 ������� ���ϰ� null ���� ���� ������ "���� �Ǵ� ��й�ȣ�� Ȯ���� �ּ���." ���

	}
}
