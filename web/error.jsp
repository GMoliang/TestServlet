<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/7/8
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
   String errorlog=(String) request.getAttribute("errorlog");
    System.out.println(errorlog);
%>
<%=errorlog%>
</body>
</html>