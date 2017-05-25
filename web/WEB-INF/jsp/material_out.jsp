<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>出库管理</title>
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
                <label for="count" >数&nbsp;&nbsp;量&nbsp;&nbsp;&nbsp;</label>
                <input id="count" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="count" >出库方式&nbsp;&nbsp;&nbsp;</label>
                <span>
                    <input name="outway" value="1" type="radio">部门领用
                    <input name="outway" value="2" type="radio">个人领用
                    <input name="outway" value="3" type="radio">部门借用
                    <input name="outway" value="4" type="radio">个人借用
                </span>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="useobject" >使用对象&nbsp;&nbsp;&nbsp;</label>
                <input id="useobject" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="outtime" >出货日期&nbsp;&nbsp;&nbsp;</label>
                <input id="outtime" class="easyui-datebox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-button" style="height: 56px; margin: 10px;">
            <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="subStore_out()">
                <span style="font-size: 14px">保存</span>
            </a>
        </div>
    </div>
</div>
</body>
</html>
