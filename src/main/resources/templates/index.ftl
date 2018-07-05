
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试@Model和@ModelMap</title>
</head>
<body>
<h3>测试@Model和@ModelMap</h3>
<a href="modelTest">测试Model</a><br><br>
<a href="ModelMapTest">测试ModelMap</a><br><br>
<h4>测试数据绑定</h4>
<a href="pathVariableTest/1">测试@PathVariable</a><br><br>
<a href="requestHeaderTest">测试@RequestHeader</a><br><br>
<a href="cookieValueTest">测试@CookieValue</a><br><br>
<h5>测试@SessionAttributes注解</h5>
<form action="login" method="post">
    <table>
        <tr>
            <td><label>登录名: </label></td>
            <td><input type="text" id="loginname" name="loginname" ></td>
        </tr>
        <tr>
            <td><label>密码: </label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>