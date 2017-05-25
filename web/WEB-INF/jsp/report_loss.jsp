<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>物资报损管理</title>
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
    <table id="dg" title="物资报损管理" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/reportloss/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="mid" width="50">物资编号</th>
            <th field="material" width="50">物资种类</th>
            <th field="rpobject" width="50">报损对象</th>
            <th field="count" width="50">报损数量</th>
            <th field="rptime" width="50">报损时间</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newReportLoss()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editReportLoss()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyReportLoss()">删除</a>
</div>
<div id="reportLossDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#rpForm-buttons">
    <div class="ftitle">物资报损信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>物资种类&nbsp;&nbsp;&nbsp;</label>
            <input name="mid" class="easyui-combobox"
                   data-options="
                           valueField:'sysid',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemDDL/ddlList?key=kind'" />        </div><br/>
        <div class="fitem">
            <label>报损对象&nbsp;&nbsp;&nbsp;</label>
            <input name="rpobject" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>报损数量&nbsp;&nbsp;&nbsp;</label>
            <input name="count" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>报损时间&nbsp;&nbsp;&nbsp;</label>
            <input name="rptime" class="easyui-datebox" style="width: 300px;height: 32px"/>
        </div><br/>
    </form>
</div>
<div id="rpForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveReportLoss()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#reportLossDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
