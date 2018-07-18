package day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileIOMain09 {

	public static void write() {
		List<UserVO> list = new ArrayList<>();
		list.add(new UserVO("ȫ�浿", "010-1111-2222", "����� ���ʱ�"));
		list.add(new UserVO("��浿", "010-3333-4444", "��⵵ ������ �д籸"));
		list.add(new UserVO("�ֱ浿", "010-5555-6666", "����� ������ �б�����"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("io/user.txt");
			oos = new ObjectOutputStream(fos);
			
			/*
			for(int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			}
			*/
			
			oos.writeObject(list);
			
			oos.flush();
			System.out.println("���� ������ �Ϸ��Ͽ����ϴ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos);
			FileClose.close(fos);
		}
	}
	
	public static void read() throws Exception {
		
		FileInputStream fis = new FileInputStream("iotest/user.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<UserVO> list = (ArrayList<UserVO>)ois.readObject();
		
		FileClose.close(ois);
		FileClose.close(fis);
		
		System.out.println("< ȸ������ ��� >");
		for(UserVO user : list) {
			System.out.println(user);
		}
	}
	
	public static void main(String[] args) {
		
//		write();
		
		try {
			read();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
