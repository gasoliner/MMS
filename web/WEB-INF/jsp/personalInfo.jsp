<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>personalInfo</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/material/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="application/javascript" src="/ui/mms.js"></script>
</head>
<body>
<div style="width: 900px;height: auto;margin: 0 auto">
    <div class="messager-body" style="width: auto;height: auto;margin: 0 auto">
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 16px;">
                <label for="username" >用户名: </label>
                <input id="username" value="${user.username}" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 16px;">
                <label for="department" >部&nbsp;&nbsp;门: </label>
                <input id="department" value="${user.department}" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 16px;">
                <label for="email" >邮&nbsp;&nbsp;箱: </label>
                <input id="email" value="${user.email}" class="easyui-textbox"   style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 16px;">
                <label for="phone" >手机号: </label>
                <input id="phone" value="${user.phone}" class="easyui-textbox"  style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-button" style="height: 56px; margin: 10px;">
            <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="perInf1()">
                <span style="font-size: 16px">提交</span>
            </a>
        </div>
        <div>
            <input id="id" type="hidden" value="${user.uid}"/>
        </div>
    </div>
</div>
</body>
</html>

