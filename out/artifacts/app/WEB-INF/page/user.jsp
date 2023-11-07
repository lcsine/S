<%--
  User: tang
  Date: 2023/11/4
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
</head>
<body>
<%--<form action="user/insert" method="post">--%>
<%--    <label for="username">用户名:</label>--%>
<%--    <input id="username" name="username" type="text">--%>
<%--    <label for="password">密码:</label>--%>
<%--    <input id="password" name="password" type="password">--%>
<%--    <input type="submit" value="提交">--%>
<%--</form>--%>

<form action="user/queryParam" method="post">
    排序字段：<br>
    <input type="text" name="sortField">
    <hr>
    数组：<br>
    <input type="text" name="ids[0]"> <br>
    <input type="text" name="ids[1]">
    <hr>
    user对象：<br>
    <input type="text" name="user.username" placeholder="姓名"><br>
    <input type="text" name="user.password" placeholder="密码">
    <hr>
    list集合<br>
    第一个元素：<br>
    <input type="text" name="userList[0].username" placeholder="姓名"><br>
    <input type="text" name="userList[0].password" placeholder="密码"><br>
    第二个元素： <br>
    <input type="text" name="userList[1].username" placeholder="姓名"><br>
    <input type="text" name="userList[1].password" placeholder="密码">
    <hr>
    map集合<br>
    第一个元素：<br>
    <input type="text" name="userMap['user1'].username" placeholder="姓名"><br>
    <input type="text" name="userMap['user1'].password" placeholder="密码"><br>
    第二个元素：<br>
    <input type="text" name="userMap['user2'].username" placeholder="姓名"><br>
    <input type="text" name="userMap['user2'].password" placeholder="密码"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
