function newSystemDDL() {
    $("#fm").form("clear");
    $("#systemDDLDialog").dialog("open").dialog("setTitle","新建");
    url = "/systemDDL/add?keyword="+$("#keyword").val();
}
function editSystemDDL() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#systemDDLDialog").dialog("open").dialog("setTitle","编辑");
        $("#fm").form("load",row);
        url = "/systemDDL/update?sysid="+row.sysid;
    }
}
function destroySystemDDL() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/systemDDL/delete?sysid="+row.sysid,
                    success: function (res) {
                        alert(res);
                        $("#systemDDLDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveSystemDDL() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#systemDDLDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function subStore_buy() {
    $.post("/instore/add?way=1",{
        material:$("#material").val(),
        count:$("#count").val(),
        price:$("#price").val(),
        provider:$("#provider").val()
    },function (backresult) {
        alert(backresult);
    })
}
function subStore_return() {
    $.post("/instore/add?way=2",{
        material:$("#material").val(),
        borrowid:$("#borrowid").val(),
        returndate:$("#returndate").val(),
    },function (backresult) {
        alert(backresult);
    })
}
function subStore_out() {
    $.post("/outstore/add",{
        material:$("#material").val(),
        count:$("#count").val(),
        outway:$("input[name='outway']:checked").val(),
        useobject:$("#useobject").val(),
        outtime:$("#outtime").val()
    },function (backresult) {
        alert(backresult);
    })
}
function newReportLoss() {
    $("#fm").form("clear");
    $("#reportLossDialog").dialog("open").dialog("setTitle","新建");
    url = "/reportloss/add";
}
function editReportLoss() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#reportLossDialog").dialog("open").dialog("setTitle","编辑");
        $("#fm").form("load",row);
        url = "/reportloss/update?rlid="+row.rlid;
    }
}
function destroyReportLoss() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/reportloss/delete?rlid="+row.rlid,
                    success: function (res) {
                        alert(res);
                        $("#reportLossDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveReportLoss() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#reportLossDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function destroyInventory() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/statistics/destroy_Inventory?mid="+row.mid,
                    success: function (res) {
                        alert(res);
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function newUser() {
    $("#fm").form("clear");
    $("#userDialog").dialog("open").dialog("setTitle","新建");
    url = "/user/add";
}
function editUser() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#userDialog").dialog("open").dialog("setTitle","编辑");
        $("#fm").form("load",row);
        url = "/user/update?uid="+row.uid;
    }
}
function destroyUser() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/user/delete?uid="+row.uid,
                    success: function (res) {
                        alert(res);
                        $("#userDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveUser() {
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#userDialog").dialog("close");
            $('#dg').datagrid("reload");
        }
    })
}
function dengchu() {
    $.get("/user/dengchu",null,function (res) {
        window.location.href = "/UI/denglu";
    })
}
function perInf1() {
    $.post("/user/update",
        {
            uid:$("#id").val(),
            username:$("#username").val(),
            department:$("#department").val(),
            phone:$("#phone").val(),
            email:$("#email").val()
        },
        function (data) {
            alert(data);
        });
}
function perPas1() {
    $.post("/user/password",
        {
            uid:$("#id").val(),
            oldpass:$("#oldpass").val(),
            newpass:$("#newpass").val(),
            newpass_check:$("#newpass_check").val()
        },
        function (data) {
            alert(data);
        });
}