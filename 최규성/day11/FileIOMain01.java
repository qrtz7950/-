package kr.co.mlec.day11;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main(String[] args) {
		
		System.out.println("�Է��� �ϼ���. ctrl+z �Է½� ����");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		try {
			while (true) {
				int c = isr.read();
				if(c == -1) {
					break;
				}
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		try {
			while (true) {
				int c = is.read();
				if(c == -1) {
					break;
				}
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}
}






