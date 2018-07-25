package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 *  ���̵� �Է� : hong
 *  ������ �̸��� �Է� : ������
 *  
 *  id : hong ==> �̸� : �浿�浿 -> ������
 *  
 */

public class UpdateMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		Scanner s = new Scanner(System.in);
		
		try {
			// 1�ܰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2�ܰ�
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3�ܰ�
			String sql = "update t_test ";
				   sql += " set name = ? ";
				   sql += " where id = ? ";
		    pstm = conn.prepareStatement(sql);
		    System.out.print("���̵� �Է� : ");
		    String id = s.nextLine();
		    System.out.print("������ �̸� �Է� : ");
		    String name = s.nextLine();
		    
		    pstm.setString(2, id);
		    pstm.setString(1, name);
		    
		    // 4�ܰ�
		    int cnt = pstm.executeUpdate();
		    System.out.println("�� " + cnt + "�� ���� �����Ǿ����ϴ�");
				   
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 5�ܰ�
			if(pstm != null) {
				try {
					pstm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
