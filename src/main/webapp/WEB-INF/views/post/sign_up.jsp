<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 5:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/member/signup" method="post">
    <table class="table table-bordered">
        <thead>
        <caption>회원가입</caption>
        </thead>
        <tbody>
        <tr>
            <th>ID</th>
            <td><input type="text" name="userId"> </td>
        </tr>
        <tr>
            <th>PASSWORD</th>
            <td><input type="text" name="password"> </td>
        </tr>
        <tr>
            <th>E-Mail</th>
            <td><input type="text" name="email"> </td>
        </tr>
        </tbody>
    </table>
    <input type="submit" value="등록" class="btn btn-lg btn-success">
</form>
</body>
</html>
