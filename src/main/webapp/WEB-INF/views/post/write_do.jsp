<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 3:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <form action="/post/write" method="post">
        <table class="table table-bordered">
            <thead>
            <caption>글쓰기</caption>
            </thead>
            <tbody>

            <tr>
                <th>글번호</th>
                <td><input type="text" name="postId"> </td>
            </tr>
            <tr>
                <th>제목</th>
                <td><input type="text" name="title"> </td>
            </tr>
            <tr>
                <th>내용</th>
                <td><input type="text" name="content"> </td>
            </tr>
            </tbody>
        </table>
        <input type="submit" value="등록" class="btn btn-lg btn-success">
    </form>
</div>
</body>
</html>
