package kr.co.mlec.homework.homework09;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		RandNum r = new RandNum();
		
		System.out.println("< Lotto program >");
		
		System.out.print("���Ӽ��� �Է��ϼ��� : ");
		int gamen = Integer.parseInt(s.nextLine());
		
		for(int i=1; i<=gamen; i++) {
			System.out.print("����" + i + " : ");
			r.rand(0);
			System.out.println();
		}
		
		
	}

}
