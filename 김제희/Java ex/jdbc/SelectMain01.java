package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain01 {

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
			String sql ="select id, name as �̸� from t_test "; //�ٸ�� 
	        pstmt = conn.prepareStatement(sql);
	        
			//4�ܰ�
	        ResultSet rs = pstmt.executeQuery();
	        rs.next();
	        while(rs.next()) {
	        String id = rs.getString(1);
	        String name = rs.getString("�̸�"); //�ٸ�� ��밡��
	        System.out.println(id + " " + name);
	        }
			
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
