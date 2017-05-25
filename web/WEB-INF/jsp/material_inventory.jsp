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
    <table id="dg" title="库存物资清单" class="easyui-datagrid" style="width: 100%;height:auto"
           fitColumns="true" singleSelect="true" pagination="true" toolbar="#toolbar"
           data-options="rownumbers:true,
            url:'/statistics/inventory_list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="mid" width="50">物资编号</th>
            <th field="material" width="50">物资种类</th>
            <th field="count" width="50">库存量</th>
            <th field="price" width="50">单价</th>
        </tr>
        </thead>
    </table>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyInventory()">删除</a>
</div>
</body>
</html>
