package kr.co.mlec.day09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatMain {

	public static void main(String[] args) {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��(E)");
		 System.out.println("��¥���� : " + sdf.format(new Date()));
		 
		 String pattern = "yyyy-MM-dd HH:mm:ss";
		 sdf = new SimpleDateFormat(pattern);
		 System.out.println(sdf.format(new Date()));

	}

}
