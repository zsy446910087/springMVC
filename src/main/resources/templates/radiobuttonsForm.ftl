<#import "/spring.ftl" as spring/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试radiobuttons标签</title>
</head>
<body>
<h3>form:radiobuttons测试</h3>
<form  method="post" action="radiobuttonForm2" >
    <table>
        <tr>
            <td>性别:</td>
            <td>
                <@spring.formRadioButtons "user4.sex" sexMap ""/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>