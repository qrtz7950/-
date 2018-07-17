package kr.co.mlec.day11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.co.mlec.util.FileClose;

public class FileIOMain04 {

	public static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			
			fos = new FileOutputStream("iotest/writer.txt");
			dos = new DataOutputStream(fos);
			
			char c = 'A';
			int num = 123;
			
//			fos.write(c);
			dos.writeChar(c);
			dos.writeInt(num);
			
			System.out.println("������ �Ϸ�Ǿ����ϴ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(dos != null) {
				try {
					dos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			
			fis = new FileInputStream("iotest/writer.txt");
			dis = new DataInputStream(fis);
		/*	
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				System.out.println(c);
			}
		*/
			
			char ch = dis.readChar();
			int num = dis.readInt();
			
			System.out.println("���� : " + ch);
			System.out.println("���� : " + num);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(dis);
			FileClose.close(fis);
			
//			if(dis != null) {
//				try {
//					dis.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//			if(fis != null) {
//				try {
//					fis.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
		}
	}
	
	public static void main(String[] args) {
		
		read();
		
//		write();
	}
}







