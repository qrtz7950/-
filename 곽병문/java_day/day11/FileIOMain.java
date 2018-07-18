package kr.co.mlec.day11;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileIOMain {

	public static void main(String[] args) {
		
		System.out.print("�Է��� �ϼ���. ctrl+z �Է½� ���� => ");
		
		InputStream is = System.in;
/*
		try{
			while(true) {
				int c = is.read();
				if(c==-1) {			// ctrl+z == -1
					break;
				}
				System.out.print((char)c);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
*/
		
		System.out.print("�Է��� �ϼ���. ctrl+z �Է½� ���� => ");
		InputStreamReader isr = new InputStreamReader(is);
		try{
			while(true) {
				int c = isr.read();
				if(c==-1) {			// ctrl+z == -1
					break;
				}
				System.out.print((char)c);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
