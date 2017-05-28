package cn.mms.servlet;

import cn.mms.po.DataGrid;
import cn.mms.po.Page;
import cn.mms.po.Systemddl;
import cn.mms.po.User;
import cn.mms.service.SystemDDLService;
import cn.mms.service.UserService;
import cn.mms.service.impl.SystemDDLServiceImpl;
import cn.mms.service.impl.UserServiceImpl;
import cn.mms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class UserServlet extends HttpServlet {


    private UserService userService = new UserServiceImpl();

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
        }else if (requestName.equals("denglu")){
            resp.getWriter().print(denglu(req,resp));
        }else if (requestName.equals("dengchu")){
            dengchu(req);
        }else if (requestName.equals("password")){
            resp.getWriter().print(password(req));
        }else {
            resp.getWriter().print(update(req));
        }
    }

    private String password(HttpServletRequest req) {
        if (userService.updatePassword(
                req.getParameter("newpass"),
                req.getParameter("newpass_check"),
                req.getParameter("oldpass"),
                Integer.valueOf(req.getParameter("uid"))
        )){
            return JSON.toJSONString("修改成功，下次登录有效");
        }else {
            return JSON.toJSONString("修改失败");
        }
    }

    private void dengchu(HttpServletRequest req) {
        req.getSession().invalidate();
        return;
    }

    private String denglu(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = userService.getObjectByUsername(username);
        if (user != null && user.getPassword().equals(password)){

            req.getSession().setAttribute("user",user);

            resp.sendRedirect("/UI/index");
            return "/UI/index";
        }else {
            resp.sendRedirect("/UI/denglu");
            return "/UI/denglu";
        }
    }

    private String delete(HttpServletRequest req) {
        userService.delete(Integer.parseInt(req.getParameter("uid")));
        return JSON.toJSONString("successful");
    }

    public String update(HttpServletRequest request){
        userService.update(getObjectByRequest(request));
        return JSON.toJSONString("修改成功，下次登录生效");
    }

    public String list(HttpServletRequest request){
        Page page = new Page();
        page.setPage(Integer.parseInt(request.getParameter("page")));
        page.setSize(Integer.parseInt(request.getParameter("rows")));
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(userService.getList(page));
        dataGrid.setTotal(userService.count());
        return JSON.toJSONString(dataGrid);
    }

    public String addtion(HttpServletRequest request){
        userService.insert(getObjectByRequest(request));
        return JSON.toJSONString("successful");
    }

    public User getObjectByRequest(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        User user = new User();
        if (parameterMap.get("uid")!=null && parameterMap.get("uid").length > 0){
            user.setUid(Integer.parseInt(parameterMap.get("uid")[0]));
        }
        if (parameterMap.get("username")!=null && parameterMap.get("username").length > 0){
            user.setUsername(parameterMap.get("username")[0]);
        }
        if (parameterMap.get("password")!=null && parameterMap.get("password").length > 0){
            user.setPassword(parameterMap.get("password")[0]);
        }
        if (parameterMap.get("rid")!=null && parameterMap.get("rid").length > 0){
            user.setRid(Integer.valueOf(parameterMap.get("rid")[0]));
        }
        if (parameterMap.get("department")!=null && parameterMap.get("department").length > 0){
            user.setDepartment(parameterMap.get("department")[0]);
        }
        if (parameterMap.get("phone")!=null && parameterMap.get("phone").length > 0){
            user.setPhone(parameterMap.get("phone")[0]);
        }
        if (parameterMap.get("email")!=null && parameterMap.get("email").length > 0){
            user.setEmail(parameterMap.get("email")[0]);
        }
        return user;
    }
}
