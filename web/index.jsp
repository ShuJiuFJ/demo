<%--
  Created by IntelliJ IDEA.
  User: 9350
  Date: 2021/3/27
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>查询</title>
  </head>

  <body>
  <form action="/demo_war_exploded/UserServlet" method="post">
    姓名<br>
    <input type="text" name="name" value="王林">
    <br>
<%--    <input type="submit" value="提交">--%>
<%--  </form>--%>
  <form action="/demo_war_exploded/UserServlet" method="post">
    性别<br>
    <input type="text" name="sex" value="男">
    <br>
<%--    <input type="submit" value="提交">--%>
<%--  </form>--%>
  <form action="/demo_war_exploded/UserServlet" method="post">
    出生日期 格式YYYY-MM-DD<br>
    <input type="text" name="birthday" value="2021-03-04">
    <br><br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
