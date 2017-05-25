<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<div style="text-align: center;font-family: 微软雅黑;font-size: 25px;" >物资管理系统
    <c:if test="${user != null}">
        <span style="color: #246aa8;display:block; width: 300px; float:right; text-align:right;font-family: 微软雅黑;font-size: 16px;">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当前用户：&nbsp;&nbsp;&nbsp;&nbsp;${user.username}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a style="text-decoration: none;color: #246aa8" href="#" onclick="dengchu()">登出</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </span>
    </c:if>
</div>
</body>
</html>
