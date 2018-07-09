<title>测试@ModelAttribute注释一个方法的参数</title>
</head>
<body>
访问request作用范围域中的user对象的loginname属性：${(Request.user.loginname)! "不存在" }<br>
访问request作用范围域中的user对象的password属性：${Request.user.password }<br>
访问request作用范围域中的user对象的username属性：${Request.user.username }<br>
<br>
</body>
</html>