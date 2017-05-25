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

<div align="center">
    <table id="dg" title="物资借用统计" class="easyui-datagrid" style="width: 100%;height:auto"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/statistics/borrow_list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="osid" width="50">借用编号</th>
            <th field="mid" width="50">物资编号</th>
            <th field="material" width="50">物资种类</th>
            <th field="count" width="50">借用数量</th>
            <th field="useobject" width="50">借用对象</th>
            <th field="outtime" width="50">借用时间</th>
            <th field="voIsreturn" width="50">是否归还</th>
            <th field="returntime" width="50">归还时间</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>
