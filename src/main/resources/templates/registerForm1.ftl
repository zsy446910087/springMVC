<#import "/spring.ftl" as spring/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试form标签</title>
</head>
<body>
<h3>注册页面</h3>
<form  method="post" action="register" >
	<table>
		<tr>
			<td>姓名:</td>
			<td><@spring.formInput "user1.username"/></td>
            <td><@spring.showErrors "" "user1.username" /></td>
		</tr>
		<tr>
			<td>性别:</td>
			<td><@spring.formInput "user1.sex"/></td>
            <td><color="red"><@spring.showErrors "" "user1.sex"/></td>
		</tr>
		<tr>
			<td>年龄:</td>
			<td><@spring.formInput "user1.age"/></td>
            <td><bgcolor="red"><@spring.showErrors "" "user1.age" /></td>
		</tr>
		<tr>
        	<td><input type="submit" value="注册"/></td>
        </tr>
	</table>
</form>
</body>
</html>