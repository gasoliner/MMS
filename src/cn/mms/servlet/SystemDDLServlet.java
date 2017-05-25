package cn.mms.servlet;

import cn.mms.po.DataGrid;
import cn.mms.po.Page;
import cn.mms.po.Systemddl;
import cn.mms.service.SystemDDLService;
import cn.mms.service.impl.SystemDDLServiceImpl;
import cn.mms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class SystemDDLServlet extends HttpServlet {


    private SystemDDLService systemddlService = new SystemDDLServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestName = PageUtil.getRequestName(req.getRequestURL().toString());
        if (requestName.equals("add")){
            resp.getWriter().print(addtion(req));
        }else if (requestName.equals("list")){
            resp.getWriter().print(list(req));
        }else if (requestName.equals("delete")){
            resp.getWriter().print(delete(req));
        }else if (requestName.equals("ddlList")){
            resp.getWriter().print(ddlList(req));
        }else {
            resp.getWriter().print(update(req));
        }
    }

    private String delete(HttpServletRequest req) {
        systemddlService.delete(Integer.parseInt(req.getParameter("sysid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        systemddlService.update(getObjectByRequest(request));
        return JSON.toJSONString("successful");
    }

    public String list(HttpServletRequest request){
        Page page = new Page();
        page.setPage(Integer.parseInt(request.getParameter("page")));
        page.setSize(Integer.parseInt(request.getParameter("rows")));
        page.setKey(request.getParameter("key"));
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(systemddlService.getList(page));
        dataGrid.setTotal(systemddlService.count());
        return JSON.toJSONString(dataGrid);
    }

    public String ddlList(HttpServletRequest request){
        Page page = new Page();
        page.setKey(request.getParameter("key"));
        return JSON.toJSONString(systemddlService.getList(page));
    }

    public String addtion(HttpServletRequest request){
        systemddlService.insert(getObjectByRequest(request));
        return JSON.toJSONString("successful");
    }

    public Systemddl getObjectByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        Systemddl systemddl = new Systemddl();
        if (parameterMap.get("sysid")!=null && parameterMap.get("sysid").length > 0){
            systemddl.setSysid(Integer.parseInt(parameterMap.get("sysid")[0]));
        }
        if (parameterMap.get("ddlname")!=null && parameterMap.get("ddlname").length > 0){
            systemddl.setDdlname(parameterMap.get("ddlname")[0]);
        }
        if (parameterMap.get("keyword")!=null && parameterMap.get("keyword").length > 0){
            systemddl.setKeyword(parameterMap.get("keyword")[0]);
        }
        if (parameterMap.get("ddlremarks")!=null && parameterMap.get("ddlremarks").length > 0){
            systemddl.setDdlremarks(parameterMap.get("ddlremarks")[0]);
        }
        return systemddl;
    }
}
