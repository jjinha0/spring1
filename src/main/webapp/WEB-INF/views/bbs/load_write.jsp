<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오전 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" class="active"><a href="#">Home</a></li>
                <li role="presentation"><a href="#">About</a></li>
                <li role="presentation"><a href="#">Contact</a></li>
            </ul>
        </nav>
        <h3 class="text-muted">글쓰기 화면입니다.</h3>
    </div>

    <div class="jumbotron">
        <form action="/bbs/write" method="post">
        <table class="table table-bordered">

            <tbody>

                <tr>
                    <th>아이디</th>
                    <td><input type="text" name="myId"></td>
                </tr>
                <tr>
                    <th>비밀번호</th>
                    <td><input type="password" name="password" maxlength="8"></td>
                </tr>
                <tr>
                    <th>제목</th>
                    <td><input type="text" name="title" placeholder="제목을 입력하세요."></td>
                </tr>
                <tr>
                    <th>작성자</th>
                    <td><input type="text" name="author"></td>
                </tr>
                <tr>
                    <th>내용</th>
                    <td><textarea name="content" placeholder="내용을 입력하세요." rows="10" cols="70"></textarea></td>
                </tr>


        </tbody></table>
            <input type="checkbox" name="chk_agree" >Please Agree. <i class="glyphicon glyphicon-ok-sign"></i><br><br>
            <input type="submit" value="글 등록하기" class="btn btn-lg btn-success pull-right" >
            <input type="button" value="뒤로가기" class="btn btn-lg btn-danger pull-left" onclick="history.go(-1)" >
        </form>
    </div>

    <div class="row marketing">
            <div class="col-lg-6">
                <h4>Subheading</h4>
                <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>

                <h4>Subheading</h4>
                <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum.</p>

                <h4>Subheading</h4>
                <p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
            </div>

            <div class="col-lg-6">
                <h4>Subheading</h4>
                <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>

                <h4>Subheading</h4>
                <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum.</p>

                <h4>Subheading</h4>
            <p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
        </div>
    </div>

    <footer class="footer">
        <p>&copy; 2016 Company, Inc.</p>
        </footer>

</div> <!-- /container -->
</body>
</html>
