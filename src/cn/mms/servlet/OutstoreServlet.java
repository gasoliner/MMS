package cn.mms.servlet;

import cn.mms.po.Instore;
import cn.mms.po.Outstore;
import cn.mms.service.InstoreService;
import cn.mms.service.OutstoreService;
import cn.mms.service.impl.InstoreServiceImpl;
import cn.mms.service.impl.OutstoreServiceImpl;
import cn.mms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class OutstoreServlet extends HttpServlet {


    private OutstoreService outstoreService = new OutstoreServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestName = PageUtil.getRequestName(req.getRequestURL().toString());
        if (requestName.equals("add")){
            resp.getWriter().print(addtion(req));
        }
    }

    public String addtion(HttpServletRequest request){
        getObjectByRequest(request);
        if (outstoreService.insert(getObjectByRequest(request))){
            return JSON.toJSONString("successful");
        }{
            return JSON.toJSONString("failed");
        }
    }

    public Outstore getObjectByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        Outstore outstore = new Outstore();
        if (parameterMap.get("material")!=null && parameterMap.get("material").length > 0){
            outstore.setMid(Integer.valueOf(parameterMap.get("material")[0]));
        }
        if (parameterMap.get("count")!=null && parameterMap.get("count").length > 0){
            outstore.setCount(Float.valueOf(parameterMap.get("count")[0]));
        }
        if (parameterMap.get("outway")!=null && parameterMap.get("outway").length > 0){
            outstore.setOutway(parameterMap.get("outway")[0]);
        }
        if (parameterMap.get("useobject")!=null && parameterMap.get("useobject").length > 0){
            outstore.setUseobject(parameterMap.get("useobject")[0]);
        }
        if (parameterMap.get("outtime")!=null && parameterMap.get("outtime").length > 0){
            outstore.setOuttime(new Date(parameterMap.get("outtime")[0]));
        }
        return outstore;
    }
}
