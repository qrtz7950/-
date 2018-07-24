package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * ���̵� �Է�: hong
 * ������ �̸��� �Է� : ȫ���
 * 
 * id : hong ===> �̸� : ȫ�浿 -> ȫ���
 */ 

public class UpdateMain01 {

	public static void main(String[] args) {
		
		Connection 	conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1�ܰ� : ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2�ܰ� 
			String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user 	= "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			//3�ܰ�
			String sql ="update t_test ";
			       sql +="set name = ? ";
			       sql +="where id = ? ";
		   	Scanner sc = new Scanner(System.in);
			System.out.print("id: ");
			String id = sc.nextLine();
			System.out.print("�������̸�: ");
			String name = sc.nextLine();

	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, name);
	        pstmt.setString(2, id);
	        
			//4�ܰ�
	        int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "�� �� ����");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			// 5�ܰ� : ��������
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
