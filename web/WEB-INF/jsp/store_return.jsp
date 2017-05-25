<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userList</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/metro/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/mms.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/mms.js"></script>
</head>
<body>
    <div style="width: 900px;height: auto;margin: 0 auto">
        <div class="messager-body" style="width: auto;height: auto;margin: 0 auto">
            <div class="messager-input" style="height: 56px; margin: 10px;">
                <p align="center" style="font-size: 14px;">
                    <label for="borrowid" >借用编号&nbsp;&nbsp;&nbsp;</label>
                    <input id="borrowid" class="easyui-textbox" style="width: 300px;height: 32px"/>
                </p>
            </div>
            <div class="messager-input" style="height: 56px; margin: 10px;">
                <p align="center" style="font-size: 14px;">
                    <label for="material" >物资名称&nbsp;&nbsp;&nbsp;</label>
                    <input id="material" class="easyui-combobox"
                           data-options="
                               valueField:'sysid',
                               textField:'ddlname',
                               width:300,
                               url:'${pageContext.request.contextPath}/systemDDL/ddlList?key=kind'" />
                </p>
            </div>
            <div class="messager-input" style="height: 56px; margin: 10px;">
                <p align="center" style="font-size: 14px;">
                    <label for="returndate" >归还日期&nbsp;&nbsp;&nbsp;</label>
                    <input id="returndate" class="easyui-datebox" style="width: 300px;height: 32px"/>
                </p>
            </div>
            <div class="messager-button" style="height: 56px; margin: 10px;">
                <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="subStore_return()">
                    <span style="font-size: 14px">保存</span>
                </a>
            </div>
        </div>
    </div>
</body>
</html>
