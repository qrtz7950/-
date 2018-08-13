<%@page import="util.vo.BoardVO"%>
<%@page import="util.dao.BoardDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="util.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%--
    	�۾�����
    	1. ��ȸ�� �۹�ȣ(�Ķ���� no)������
    	2. ���� �۹�ȣ�� ����t_board���̺��� �ش� �Խù� ��ȸ�ϱ�
    	3. ��ȸ�� �Խù��� �������� ���
     --%>
     
    <%
    	int no = Integer.parseInt(request.getParameter("no"));
    
    	BoardDAO dao = new BoardDAO();
    	BoardVO board = dao.selectByNo(no);
    	
    	pageContext.setAttribute("board", board);
    	
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
			<td>${ board.no }</td>
		</tr>
		<tr>
			<th>����</th>
			<td><c:out value="${board.title }" /></td>
		</tr>
		<tr>
			<th>�ۼ���</th>
			<td>${board.writer }</td>
		</tr>
		<tr>
			<th>����</th>
			<td><c:out value="${board.content }"/></td>
		</tr>
		<tr>
			<th>��ȸ��</th>
			<td>${board.viewCnt }</td>
		</tr>
		<tr>
			<th>�����</th>
			<td>${ board.regDate}</td>
		</tr>
	</table>
	<Br><Br>
	<button>����</button>&nbsp;
	<button>����</button>&nbsp;
	<button>���</button>&nbsp;
	
	
</div>
</body>
</html>