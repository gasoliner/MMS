<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
    .menu-last{
        margin-bottom: 5px;
    }
</style>
<body>
<div class="easyui-accordion" style="width:auto;height: 350px;border: 0px;">
    <div title="物资入库管理" iconCls="icon-cog" style="overflow: auto;padding: 10px;">
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('购买入库','UI/store_buy')">购买入库</a><br/>
        </div>
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('归还入库','UI/store_return')">归还入库</a><br/>
        </div>
    </div>
    <div title="物资出库管理" iconCls="icon-computer" style="overflow:auto;padding:10px;">
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('物资出库','UI/material_out')">物资出库</a>
        </div>
    </div>
    <div title="查询统计管理" iconCls="icon-computer" style="overflow:auto;padding:10px;">
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('在库物资清单','UI/material_inventory')">在库物资清单</a>
        </div>
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('物资借用统计','UI/material_borrow')">物资借用统计</a>
        </div>
    </div>
    <div title="物资报损管理" iconCls="icon-computer" style="overflow:auto;padding:10px;">
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('报损物资','UI/report_loss')">报损物资</a>
        </div>
    </div>
    <c:if test="${user.rid == 1}">
        <div title="基础信息管理" iconCls="icon-computer" style="overflow:auto;padding:10px;">
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('供应商管理','UI/material_provider')">供应商管理</a>
        </div>
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('物资种类管理','UI/material_kind')">物资种类管理</a>
        </div>
    </div>
        <div title="系统内容管理" iconCls="icon-computer" style="overflow:auto;padding:10px;">
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('用户列表','UI/userList')">用户列表管理</a>
            </div>
        </div>
    </c:if>
</div>
</body>
