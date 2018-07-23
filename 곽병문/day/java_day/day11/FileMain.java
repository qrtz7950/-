package kr.co.mlec.day11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		
		
		File dirobj = new File("iotest");
		
		System.out.println(dirobj.exists() ? "��ȿ�� ���丮�Դϴ�" : "��ȿ���� ���� ���丮�Դϴ�");
		System.out.println(dirobj.isDirectory() ? "���丮�Դϴ�" : "���丮�� �ƴմϴ�");
		
		String[] list = dirobj.list();
		System.out.println("------------------------------------------------");
		System.out.println("\t\t" + dirobj.getName() + "���丮 ����");
		System.out.println("------------------------------------------------");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("------------------------------------------------");
		
		File newDirobj = new File("iotest\\��\\����");
		System.out.println(newDirobj.exists() ? "�����մϴ�" : "�������� �ʽ��ϴ�");
		
		boolean bool = false;
		if(!newDirobj.exists()) {
			bool = newDirobj.mkdir();
			System.out.println(bool ? "���� ����" : "���� ����");
		}
		
		newDirobj = new File("iotest\\������\\����");
		if(!newDirobj.exists()) {
//			bool = newDirobj.mkdir();		// �� ��ΰ� ���� ������ ���� �Ұ�
			bool = newDirobj.mkdirs();		// ��� �ȸ¾Ƶ� �� ����������
			System.out.println(bool ? "���� ����" : "���� ����");
		}
		
		bool = newDirobj.delete();			// ������ �κи� ����
		System.out.println(bool ? "���� ����" : "���� ����");
		
/*		
		File fileobj = new File("D:\\Lecture\\java\\iotest\\a.txt");
//		File fileobj = new File("iotest\\a.txt");
		
		String fileName = fileobj.getName();
		String parName = fileobj.getParent();
		String path = fileobj.getPath();
		
		System.out.println("���ϸ� : " + fileName);
		System.out.println("�θ��̸� : " + parName);
		System.out.println("���ϰ�� : " + path);
		
		boolean bool = fileobj.isFile();
		System.out.println(bool ? "�����Դϴ�" : "������ �ƴմϴ�");
		bool = fileobj.isDirectory();
		System.out.println(bool ? "���丮�Դϴ�" : "���丮�� �ƴմϴ�");
		
		bool = fileobj.exists();
		System.out.println(bool ? "�����մϴ�" : "�������� �ʽ��ϴ�");
		
		long length = fileobj.length();
		System.out.println("���� ũ��� " + length + "byte(s)");
		
		long time = fileobj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("������ ���� ��¥" + sdf.format(new Date(time)));
		
		bool = fileobj.canRead();
		System.out.println(bool ? "�б� ����" : "�б� �Ұ���");
		
		bool = fileobj.canWrite();
		System.out.println(bool ? "���� ����" : "���� �Ұ���");
*/
	}

}
