package kr.co.mlec.day05;

import java.util.Scanner;

public class HandphoneMain {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		Handphone khj = new Handphone();
		
		khj.name = "������";
		khj.number = "010-0823-0597";
		khj.company = "����";
		
		Handphone csg = new Handphone();
		
		csg.name = "�ּ���";
		csg.number = "010-1934-7752";
		csg.company = "����";
		
		System.out.println("������ : " + khj.name + ", ��ȭ��ȣ : " + khj.number + ", ������ : " + khj.company);
		System.out.println("������ : " + csg.name + ", ��ȭ��ȣ : " + csg.number + ", ������ : " + csg.company);
		
		Handphone numberBook[] = new Handphone[2];
		numberBook[0] = khj;
		numberBook[1] = csg;
		
		numberBook[0].call();
		numberBook[1].call();
		System.out.println("�Ф�");
		
		for(int i=0; i<numberBook.length; i++) {
			System.out.println("������ : " + numberBook[i].name + ", ��ȭ��ȣ : " + numberBook[i].number+ ", ������ : "+ numberBook[i].company);
		}
		
		for(Handphone phone : numberBook) {
			System.out.println("������ : " + phone.name + ", ��ȭ��ȣ : " + phone.number+ ", ������ : "+ phone.company);
		}
		
		System.out.println("============================================================================");
		
		Handphone nB[] = new Handphone[2];
		for(int i =0; i<nB.length; i++) {
			nB[i] = new Handphone();
		}
		System.out.print("������? : ");
		nB[0].name = s.nextLine();
		System.out.print("����? : ");
		nB[0].number = s.nextLine();
		System.out.print("������? : ");
		nB[0].company = s.nextLine();
		
		System.out.println(nB[0].name + ", " + nB[0].number + ", " + nB[0].company);
		
		s.close();
	}

}
