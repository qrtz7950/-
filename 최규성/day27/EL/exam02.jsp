<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%--
		http://localhost:9999/Lecture-Web/JSP/EL/exam02.jsp?id=hong&name=aaa ȣ���ߴٴ� �����Ͽ�
		hong�̶�� ���� �����ϴ� �ڵ�
	--%>
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String[] hobbys = request.getParameterValues("hobby");
	 	if(hobbys == null){
			hobbys = new String[]{"�Ķ���;���"};
		}
	%>
	ID : <%= id %><Br>
	ID : <%=request.getParameter("id") %><Br>
	ID : ${param.id }<Br>
	NAME : <%= request.getParameter("name") %><Br>
	NAME : ${param.name} <br>
	
	<%--
		http://localhost:8888/Lecture-Web/JSP/EL/exam02.jsp?
				id=hong&name=aaa&hobby=music&hobby=movie
	 --%>
	hobby[0] : 	<%= hobbys[1] %> <br>
	hobby[1] : ${paramValues.hobby[1] }<Br> 
	
</body>
</html>