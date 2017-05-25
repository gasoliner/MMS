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
    <table id="dg" title="供应商管理" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/systemDDL/list?key=provider',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="ddlname" width="50">供应商名称</th>
            <th field="sysid" width="50">供应商ID</th>
            <th field="ddlremarks" width="50">备注</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newSystemDDL()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editSystemDDL()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroySystemDDL()">删除</a>
</div>
<div id="systemDDLDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#providerForm-buttons">
    <div class="ftitle">供应商管理信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>供应商名称&nbsp;&nbsp;&nbsp;</label>
            <input name="ddlname" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>备注&nbsp;&nbsp;&nbsp;</label><br/>
            <textarea name="ddlremarks" class="textareaComment"></textarea>
        </div><br/>
    </form>
</div>
<div id="providerForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveSystemDDL()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#systemDDLDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
<input id="keyword" type="hidden" value="provider">
</body>
</html>
