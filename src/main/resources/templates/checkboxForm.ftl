<#import "/spring.ftl" as spring/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试checkbox标签</title>
</head>
<body>
<h3>form:checkbox测试</h3>
<form method="post" action="checkboxesForm" >
	<table>
		<tr>
        <td>选择课程:</td>
        <td>
             <@spring.formCheckboxes path="user2.courses" options=courseMap separator="<br>"/>
        </td>
    </tr>
	</table>
</form>
</body>
</html>