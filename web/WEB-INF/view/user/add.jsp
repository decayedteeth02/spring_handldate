<%--
  Created by IntelliJ IDEA.
  User: HYZ
  Date: 2021/12/12
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>添加用户</title>
</head>
<body>

<h1>添加用户</h1>

<form action="${pageContext.request.contextPath}/user" method="post">
<%--    private Integer id;--%>
<%--    private String Username;--%>
<%--    private Date brithday;--%>
<%--    private Double balance;//--%>
<%--    private String[] hobbies;--%>
<%--    private Double salary;//工资--%>
<%--    private Double taskCount;//任务完成百分比--%>
    <p>id:<input type="text" name="id"></p>
    <p>username:<input type="text" name="username"></p>
    <p>birthday :<input type="text" name="birthday"></p>
    <p>balance:<input type="text" name="balance"></p>
    <p>salary:<input type="text" name="salary"></p>
    <p>taskCount:<input type="text" name="taskCount"></p>
    <p>hobbies:<input type="checkbox" name="hobbies" value="唱歌">唱歌
                <input type="checkbox" name="hobbies" value="跳舞">跳舞</p>
    <p><input type="submit" value="提交"></p>

</form>

</body>
</html>
