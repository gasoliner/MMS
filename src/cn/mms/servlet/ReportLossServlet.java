package cn.mms.servlet;

import cn.mms.po.DataGrid;
import cn.mms.po.Page;
import cn.mms.po.Reportloss;
import cn.mms.service.ReportLossService;
import cn.mms.service.impl.ReportLossServiceImpl;
import cn.mms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class ReportLossServlet extends HttpServlet {


    private ReportLossService reportLossService = new ReportLossServiceImpl();

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
        }else {
            resp.getWriter().print(update(req));
        }
    }

    private String delete(HttpServletRequest req) {
        reportLossService.delete(Integer.parseInt(req.getParameter("sysid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        if (reportLossService.update(getObjectByRequest(request))){
            return JSON.toJSONString("successful");
        }else {
            return JSON.toJSONString("failed");
        }
    }

    public String list(HttpServletRequest request){
        Page page = new Page();
        page.setPage(Integer.parseInt(request.getParameter("page")));
        page.setSize(Integer.parseInt(request.getParameter("rows")));
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(reportLossService.getList(page));
        dataGrid.setTotal(reportLossService.count());
        return JSON.toJSONString(dataGrid);
    }

    public String addtion(HttpServletRequest request){
        if (reportLossService.insert(getObjectByRequest(request))){
            return JSON.toJSONString("successful");
        }else {
            return JSON.toJSONString("failed");
        }
    }

    public Reportloss getObjectByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        Reportloss reportloss = new Reportloss();
        if (parameterMap.get("rlid")!=null && parameterMap.get("rlid").length > 0){
            reportloss.setRlid(Integer.parseInt(parameterMap.get("rlid")[0]));
        }
        if (parameterMap.get("mid")!=null && parameterMap.get("mid").length > 0){
            reportloss.setMid(Integer.valueOf(parameterMap.get("mid")[0]));
        }
        if (parameterMap.get("material")!=null && parameterMap.get("material").length > 0){
            reportloss.setMaterial(parameterMap.get("material")[0]);
        }
        if (parameterMap.get("rpobject")!=null && parameterMap.get("rpobject").length > 0){
            reportloss.setRpobject(parameterMap.get("rpobject")[0]);
        }
        if (parameterMap.get("count")!=null && parameterMap.get("count").length > 0){
            reportloss.setCount(Float.valueOf(parameterMap.get("count")[0]));
        }
        if (parameterMap.get("rptime")!=null && parameterMap.get("rptime").length > 0){
            reportloss.setRptime(new Date(parameterMap.get("rptime")[0]));
        }
        return reportloss;
    }
}
