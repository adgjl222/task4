<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019/3/18
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/static/css/css8.css">

</head>


<body>
<header>
    <div class="container logo">
        <span>客服热线：010-594-78634</span>
        <div class="img-amuse">
            <img src="static/img/task8.2.png" height="24" width="25"/>
            <img src="static/img/task8.1.png" height="24" width="25"/>
            <img src="static/img/task8.png" height="24" width="25"/>
        </div>
    </div>

    <nav class="navbar navbar-default" id="header" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target="#example-navbar-collapse">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                    <img src="static/img/ptt8.png">
                </a>
            </div>
            <div class="collapse navbar-collapse" id="example-navbar-collapse">
                <ul class="nav navbar-nav" id="top">
                    <li><a href="http://localhost:8080/stu">首页</a></li>
                    <li><a href="http://localhost:8080/listjob">职业</a></li>
                    <li><a href="http://localhost:8080/rec">推荐</a></li>
                    <li><a href="http://www.jnshu.com/home">关于</a></li>
                </ul>
            </div>
        </div>
    </nav>
</header>
