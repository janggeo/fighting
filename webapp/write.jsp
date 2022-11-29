<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022-09-30
  Time: 오전 1:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.io.PrintWriter"%>
<%@ page contentType="text/html;charset=utf-8" language="java"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
  <%--휴대폰이든 노트북이든 디바이스 크기에 맞춰 화면을 보여준다.--%>
  <meta name="viewport" content="width=device-width",intial-scale="1">
  <%--stylesheet를 참조하겠다. ㄴ--%>
  <link rel="stylesheet" href="css/bootstrap.min.css?after">
  <title>jsp 게시판 웹사이트</title>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle collapsed"
            data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
            aria-expanded="false">
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="main.jsp">jsp게시판 웹사이트</a>
  </div>
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <%--하나의 리스트를 보여줄때 ul 사용--%>
    <ul class="nav navbar-nav">
      <li ><a href="main.jsp">메인</a></li>
      <li class="active"><a href="bbs.jsp">게시판</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown">
        <%-- #은 가리키고있는 링크가 없다는 것을 의미--%>
        <a href="#" class="dropdown-toggle"
           data-toggle="dropdown" role="button" aria-haspopup="true"
           aria-expanded="false">접속하기<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <%--active는 현재 선택이 되었다는 뜻--%>
          <li><a href="login.jsp">로그인</a></li>
          <li><a href="join.jsp">회원가입</a></li>
        </ul>
      </li>
    </ul>
  </div>
</nav>
<div class="container">
  <div class="row">
    <table class="table table-striped" style="text-align: center; border:1px solid #dddddd">
      <thead>
      <tr>
          <th colspan="2" style="background-color: #eeeeee; text-align: center;">게시판 글쓰기 양식</th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td><img width="30" height="30" src="https://cdn.imweb.me/upload/S201804155ad2afd810d1e/304b25f098253.jpg"></td>
        <td>1</td>
        <td>충북대학교</td>
      </tr>
      </tbody>
    </table>
    <a href="write.jsp" class="btn btn-primary pull-right"></a>
  </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


</body>
</html>
