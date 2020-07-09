<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/7/8
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
    <h2>用户登录页面</h2>
    <form action="/doLogin" method="post">
      用户名:<input name="username" type="text"/>
      <p></p>
      密码:<input name="password" type="password"/>
      <p></p>
      <input type="submit" value="登录">
    </form>

  </body>
</html>
