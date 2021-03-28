<%--
  Created by IntelliJ IDEA.
  User: 9350
  Date: 2021/3/28
  Time: 4:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--<%--%>
<%--    String s = (String) request.getAttribute("msg");--%>
<%--    System.out.println(s);--%>
<%--%>--%>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<c:forEach items="${msg}" var="msg" varStatus="status">
<tr >
    <td>${msg.name}</td>
    <td>${msg.sex}</td>
    <td>${msg.birthday}</td>
    <td>${msg.phone}</td>
    <td>${msg.job}</td>
    <td>${msg.remake}</td><br>
</tr>
</c:forEach>

</body>
</html>
