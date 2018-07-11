
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试checkbox标签</title>
</head>
<body>
<h3>form:checkbox测试</h3>
<form modelAttribute="user2" method="post" action="checkboxForm" >
	<table>
		<tr>
			<td>选择课程:</td>
			<td>
				<input type="checkbox" name="courses" value="JAVAEE" label="JAVAEE"/>&nbsp;
				<checkbox name="courses" value="Mybatis" label="Mybatis"/>&nbsp;
				<checkbox path="courses" value="Spring" label="Spring"/>&nbsp;
			</td>
		</tr>
	</table>
	<input type="checkbox"  label="true"/>已经阅读相关协议
</form>
</body>
</html>