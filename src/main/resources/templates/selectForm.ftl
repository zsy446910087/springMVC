<#import "/spring.ftl" as spring/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试checkbox标签</title>
</head>
<body>
<h3>form:checkbox测试</h3>
<form method="post" action="selectForm" >
    <table>
        <tr>
            <td>选择部门:</td>
            <td>
            <@spring.formSingleSelect path="user4.deptId" options=deptMap/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>