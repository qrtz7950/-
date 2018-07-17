package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.co.mlec.util.FileClose;

public class FileIOMain08 {

	public static void write() {
		
		UserInfo user = new UserInfo("ȫ�浿", 20, "����� ���ʱ�");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
//			fos = new FileOutputStream("iotest/object.txt");
			fos = new FileOutputStream("iotest/object_transient.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			
			System.out.println("object.txt�� ����Ϸ�...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos);
			FileClose.close(fos);
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
//			fis = new FileInputStream("iotest/object.txt");
			fis = new FileInputStream("iotest/object_transient.txt");
			ois = new ObjectInputStream(fis);
			
			UserInfo user = (UserInfo)ois.readObject();
			System.out.println("���� �б� �Ϸ�...");
			System.out.println(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(ois);
			FileClose.close(fis);
		}
	}
	
	public static void main(String[] args) {
	
		read();
//		write();
	}
}










