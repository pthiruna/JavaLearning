<%@page import="java.lang.reflect.InvocationTargetException"%>
<%@page import="java.lang.reflect.Method"%>
<%@page import="com.prakash.algo.client.Index"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Class objClass = Index.class;

for (Method method : objClass.getDeclaredMethods()) {
%>
<a href="TreeAlgorithmResult.jsp?methodToInvoke=<%=method.getName()%>"> <%=method.getName()%></a> <br>
<%

    System.out.println(method.getName());

}


%>

</body>
</html>