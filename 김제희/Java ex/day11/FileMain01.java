package kr.co.mlec.day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileMain01 {

	public static void main(String[] args) {

		System.out.println("�Ķ�! ctrl+z�� ���� =>");
		
		InputStream is = System.in;
		Reader isr = new InputStreamReader(is);
		try {
		while(true) {
			int c = isr.read();
			if(c==-1) {
				break;
			}
			System.out.print((char)c);
		} 
		}catch (IOException e) {
				e.printStackTrace();
		} 

		
/*			
		try {
			while(true) {
				int c = is.read(); //��Ʈ���� ���� or ����Ʈ�ε� �̴� ��� ���ڱ� ������ ���ϰ��� ��Ʈ��
				if(c==-1) {
					break;
				}
				System.out.print((char)c);
			} 
		}catch (IOException e) {
			e.printStackTrace();
		} 
*/	
	}

}
