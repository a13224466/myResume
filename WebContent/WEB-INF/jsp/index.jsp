<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/index.css">
<title>应用中心</title>
</head>
<body>
	<nav class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">应用中心</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">当前时间：</a></li>
<!-- 					<li><a href="#">Link</a></li> -->
				</ul>
				<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
						<input type="text" class="form-control insert-input" placeholder="输入内容">
					</div>
					<button type="submit" class="btn btn-default search">查询</button>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<!-- <li><a href="#">Link</a></li> -->
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">菜单 <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">我的简历</a></li>
							<li><a href="#">开心一笑</a></li>
							<li><a href="#">看看天气</a></li>
							<li class="divider"></li>
							<li><a href="#" class="exit">退出</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
		<div class="row">
		    <a href=""><div class="col-md-12 content-item">笑话中心</div></a>
		    <a href=""><div class="col-md-12 content-item">天气查询</div></a>
		    <a href=""><div class="col-md-12 content-item">万年历</div></a>
		    <a href=""><div class="col-md-12 content-item">天气预报</div></a>
		</div>
	</div>
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script src="resources/js/index.js"></script>
</body>
</html>