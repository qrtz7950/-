package kr.co.Homework0716;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Membermain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> idList = new ArrayList<String>();
		List<String> pwrdList = new ArrayList<String>();
		
		String id = null;
		String pwrd = null;
		
		System.out.println("�߰��غ��ô�");
		System.out.print("���?: ");
		int cnt = sc.nextInt();
		sc.nextLine();
	
		for(int i = 0; i<cnt; i++) {
			System.out.print("input id: ");
			id = sc.nextLine();
			idList.add(id);
			System.out.print("input password: ");
			pwrd = sc.nextLine();
			pwrdList.add(pwrd);
		}
		
		for(int i = 0; i < idList.size(); i++) {
			System.out.print(i+1 + "��° ȸ�� id: " + idList.get(i));
			System.out.println("  password: " + pwrdList.get(i));
			}
		
		System.out.println("password�� �ٲ㺾�ô�");
		System.out.println("password�� �ٲٰ� ���� id�� �Է��ϼ���: ");
		id = sc.nextLine();
		
		int changeNum = 0;
		
		if(!idList.contains(id)) {
			System.out.println(id + "��� ���̵� �����ϴ�");
			System.out.println("���α׷��� �����մϴ�");
			System.exit(0);
		} else { 
			System.out.println(id +"�� ��й�ȣ�� �����մϴ�");
			changeNum = idList.indexOf(id);
		}
		
		System.out.println("������ �н����带 �Է� : ");
		String newPwrd = sc.nextLine();
		
		pwrdList.remove(changeNum);
		pwrdList.add(changeNum,newPwrd);
		
		for(int i = 0; i < idList.size(); i++) {
			System.out.print(i+1 + "��° ȸ�� id: " + idList.get(i));
			System.out.println("  password: " + pwrdList.get(i));
		}
		
		
		
		
	}
}

