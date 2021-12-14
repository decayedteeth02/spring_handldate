<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: HYZ
  Date: 2021/12/11
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--spring标签库--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    id${user.id}
</p>
<p>
    username:${user.username}
</p>
<p>
    birthday:<spring:eval expression="user.birthday"></spring:eval>
</p>
<p>
    balance:<spring:eval expression="user.balance"></spring:eval>
</p>
<p>
    hobbies:<spring:eval expression="user.hobbies"></spring:eval>
</p>
<p>
<%-- <spring:eval    一般用来显示格式化处理--%>
    salary:<spring:eval expression="user.salary"></spring:eval>
</p>
<p>
    taskCount:<spring:eval expression="user.taskCount"></spring:eval>
</p>

</body>
</html>
