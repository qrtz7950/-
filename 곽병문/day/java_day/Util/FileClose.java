package kr.co.mlec.Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileClose {
	
	public static void close(FileOutputStream fos) {	// ������ ����ȯ�Ϸ��� �ֻ��� ��ü �Ű�����
		
		if(fos!=null) {
			try {
				fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(OutputStream os) {	// ������ ����ȯ�Ϸ��� �ֻ��� ��ü �Ű�����
		
		if(os!=null) {
			try {
				os.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(Reader r) {
			
		if(r!=null) {
			try {
				r.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(Writer w) {
		
		if(w!=null) {
			try {
				w.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(ObjectOutputStream oos) {
		
		if(oos!=null) {
			try {
				oos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(Reader r, Writer w) {
		close(r);
		close(w);		
	}

	public static void close(ObjectInputStream ois) {
		if(ois!=null) {
			try {
				ois.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void close(FileInputStream fis) {
		if(fis!=null) {
			try {
				fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
