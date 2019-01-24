<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("a").click(function() {
			$("img").attr("src", "/Spring/validCode?date=" + new Date);
			return false;
		})
	})
</script>
</head>
<body>
	${error }
	<!-- <img alt="test" src="demo"> -->
	<form action="login" method="post">
		帳號：
		<input type="text" name="username" />
		<br />
		密碼：
		<input type="password" name="password" />
		<br />
		驗證碼：
		<input type="text" size="4" name="code" />
		<img alt="valid" src="validCode" width="80" height="40" />
		<a href="">換一張</a>
		<br />
		<input type="submit" value="登入" />
		<input type="reset" value="Reset" />
	</form>
</body>
</html>