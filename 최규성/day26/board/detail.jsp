<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="util.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%--
    	�۾�����
    	1. ��ȸ�� �۹�ȣ(�Ķ���� no)������
    	2. ���� �۹�ȣ�� ����t_board���̺��� �ش� �Խù� ��ȸ�ϱ�
    	3. ��ȸ�� �Խù��� �������� ���
     --%>
     
    <%
    	int no = Integer.parseInt(request.getParameter("no"));
    	Connection conn = ConnectionFactory.getConnection();
    	StringBuilder sql = new StringBuilder();
    	sql.append("select no,title,writer,content,view_cnt ");
    	sql.append("	, to_char(reg_date, 'yyyy-mm-dd') reg_date ");
    	sql.append("  from t_board ");
    	sql.append(" where no = ? ");
    	
    	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
    	pstmt.setInt(1,no);
    	
    	ResultSet rs = pstmt.executeQuery();
    	rs.next();
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��������</title>
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
	$(document).ready(function(){
		/* $('button').eq(2).click(function(){
			location.href = "list.jsp";
		}) */
	
		$('button').click(function(){
			switch($(this).text()){
			case '�Է�' :
				location.href = "list.jsp";
				break;
			}
		});
	});
</script>
</head>
<body>
<div align="center">
	<Hr width="80%">
	<h2>�Խ��� ��</h2>
	<Hr width="80%">
	<br>
	<table border="1" style="width:80%">
		<tr>
			<th width="25%">��ȣ</th>
			<td><%= rs.getInt("no") %></td>
		</tr>
		<tr>
			<th>����</th>
			<td><%= rs.getString("title") %></td>
		</tr>
		<tr>
			<th>�ۼ���</th>
			<td><%= rs.getString("writer") %></td>
		</tr>
		<tr>
			<th>����</th>
			<td><%= rs.getString("content") %></td>
		</tr>
		<tr>
			<th>��ȸ��</th>
			<td><%= rs.getInt("view_cnt") %></td>
		</tr>
		<tr>
			<th>�����</th>
			<td><%= rs.getString("reg_date") %></td>
		</tr>
	</table>
	<Br><Br>
	<button>����</button>&nbsp;
	<button>����</button>&nbsp;
	<button>���</button>&nbsp;
	
	
</div>
</body>
</html>