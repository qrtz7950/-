package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  Ai.jpg ==> Ai.jpg ����
 *  
 *  1. stream open
 *  2. �۾�����(input/output)
 *  3. stream close
 */

public class FileIOMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("iotest/Ai.jpg");
			fos = new FileOutputStream("iotest/Ai2.jpg");	// ������ ���� ������ ����
			
			long start = System.currentTimeMillis();
			
			while(true) {					// fis �о fos�� ����
				int c = fis.read();
				if(c==-1) {
					break;
				}
				fos.write(c);
			}
			System.out.println("�������� �Ϸ�");
			long end = System.currentTimeMillis();
			System.out.println("�ɸ� �ð� : " + (end-start)/1000. + "��");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();			// close
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
