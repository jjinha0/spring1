<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-13
  Time: 오후 1:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<h1>전체보기 페이지입니다.</h1>
<c:forEach var="amigo" items="${list}">
    <ul>
        <li>${amigo.name}</li>
        <li>${amigo.phone}</li>
        <li>${amigo.email}</li>
    </ul>
</c:forEach>
</body>
</html>
