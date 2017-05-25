package cn.mms.servlet;

import cn.mms.po.Instore;
import cn.mms.service.InstoreService;
import cn.mms.service.impl.InstoreServiceImpl;
import cn.mms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class InstoreServlet extends HttpServlet {


    private InstoreService instoreService = new InstoreServiceImpl();

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
        if (Integer.parseInt(request.getParameter("way")) == 1){
            instoreService.insert(getObjectByRequest(request));
        } else if (Integer.parseInt(request.getParameter("way")) == 2){
            instoreService.returnn(getObjectByRequest(request));
        }
        return JSON.toJSONString("successful");
    }

    public Instore getObjectByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        Instore instore = new Instore();
        if (parameterMap.get("material")!=null && parameterMap.get("material").length > 0){
            instore.setMid(Integer.valueOf(parameterMap.get("material")[0]));
        }
        if (parameterMap.get("count")!=null && parameterMap.get("count").length > 0){
            instore.setCount(Float.valueOf(parameterMap.get("count")[0]));
        }
        if (parameterMap.get("price")!=null && parameterMap.get("price").length > 0){
            instore.setPrice(Float.valueOf(parameterMap.get("price")[0]));
        }
        if (parameterMap.get("provider")!=null && parameterMap.get("provider").length > 0){
            instore.setProvider(parameterMap.get("provider")[0]);
        }
        if (parameterMap.get("borrowid")!=null && parameterMap.get("borrowid").length > 0){
            instore.setBorrowid(Integer.valueOf(parameterMap.get("borrowid")[0]));
        }
        if (parameterMap.get("returndate")!=null && parameterMap.get("returndate").length > 0){
            instore.setReturndate(new Date(parameterMap.get("returndate")[0]));
        }
        return instore;
    }
}
