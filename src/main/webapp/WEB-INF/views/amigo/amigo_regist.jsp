<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 2:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <form action="/amigo/regist" method="post"> <%--method의 defalut는 get--%>
    <table class="table table-bordered">
        <thead>
        <caption>친구 정보 입력하기</caption>
        </thead>
        <tbody>

            <tr>
                <th>이름</th>
                <td><input type="text" name="name"> </td>
            </tr>
            <tr>
                <th>핸드폰</th>
                <td><input type="text" name="phone"> </td>
            </tr>
            <tr>
                <th>E-mail</th>
                <td><input type="text" name="email"> </td>
            </tr>
        </tbody>
    </table>
        <input type="submit" value="등록" class="btn btn-lg btn-success">
    </form>
</div>
</body>
</html>
