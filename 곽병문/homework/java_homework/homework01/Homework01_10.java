package kr.co.mlec.homework.homework01;

import java.util.Scanner;

public class Homework01_10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int a = s.nextInt();
		System.out.print("�ι�° ���� : ");
		int b = s.nextInt();
		System.out.print("����° ���� : ");
		int c = s.nextInt();
		
		if(a>b) {								// ���� ū�� ���
			if(a>c) {
				System.out.print(a+"\t");
			}
			else {
				System.out.print(c+"\t");
			}
		}
		else {
			if(b>c) {
				System.out.print(b+"\t");
			}
			else {
				System.out.print(c+"\t");
			}
		}
//--------------------------------------------------------------
		if(a>b) {								// �߰��� ���
			if(a<c) {
				System.out.print(a+"\t");
			}
			else if(c>b){
				System.out.print(c+"\t");
			}
			else {
				System.out.print(b+"\t");
			}
		}
		else {
			if(b<c) {
				System.out.print(b+"\t");
			}
			else if(c>a){
				System.out.print(c+"\t");
			}
			else {
				System.out.print(a+"\t");
			}
		}
//--------------------------------------------------------------
		if(a<b) {								// ���� ������ ���
			if(a<c) {
				System.out.print(a+"\t");
			}
			else {
				System.out.print(c+"\t");
			}
		}
		else {
			if(b<c) {
				System.out.print(b+"\t");
			}
			else {
				System.out.print(c+"\t");
			}
		}
		
		s.close();
		

	}
}
