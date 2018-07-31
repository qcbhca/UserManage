<%--
  Created by IntelliJ IDEA.
  User: hongqin.luo
  Date: 2018/7/31
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<div align = "center">
    <h3>用户列表</h3>
    <form action="getUser" method="post">
        <table>
            <tr>
                <th>用户编号</th>
                <th>用户姓名</th>
                <th>手机号码</th>
                <th>备注</th>
                <th>最后编辑时间</th>
                <th>删除</th>
            </tr>
            <c:forEach items="userList" var="user">
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.username}</td>
                    <td>${user.phone}</td>
                    <td>${user.note}</td>
                    <td>${user.lastModifyTime}</td>
                    <td></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>
</body>
</html>
