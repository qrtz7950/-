package kr.co.mlec.jdbc.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.co.mlec.util.ConnectionFactory;
import kr.co.mlec.util.JDBCClose;

public class InsertMain04 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			
			conn = ConnectionFactory.getConnection();
			
			String sql = "insert into t_test(id, name) ";
				   sql += " values('choi', 'ť��ť��') ";
				   
			pst = conn.prepareStatement(sql);
			
			int cnt = pst.executeUpdate(sql);
			System.out.println("�� " + cnt + "�� ���� �����Ͽ����ϴ�");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(conn, pst);
		}
		
	}

}
