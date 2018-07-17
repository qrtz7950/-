package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//rena.jpg ==> rena2.jpg ����
/*
	�۾�����
	1. stream open
	2. �۾�����(input/output)
	3. stream close
	���� �������
	//io���� Ŭ������ �� üũ�� �ͼ����̴� trycatch����
*/

public class FileMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 1. stream open
			fis = new FileInputStream("io/rena.jpg");
			fos = new FileOutputStream("io/rena2.jpg");
			//������ ��� �������� + �����
			//������ �̴�δ� �����ϸ� ����
			
			long start = System.currentTimeMillis();
			// 2. �۾�����(read/write)
			while(true) {
				int c = fis.read();
				if(c==-1) break; 
				fos.write(c);
			}
			long end = System.currentTimeMillis();
			System.out.println("����!" + ((end-start)/1000.) + "sec");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 3. stream close
			if(fis != null) {
				try{
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}//��Ʈ���� ���� ������ ioŬ�������� ������� ������ �＼���� �źεȴ�
		//�������� �� �ݾ�
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
