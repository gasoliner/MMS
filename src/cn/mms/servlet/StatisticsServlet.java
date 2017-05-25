package cn.mms.servlet;

import cn.mms.po.DataGrid;
import cn.mms.po.Outstore;
import cn.mms.po.Page;
import cn.mms.po.Systemddl;
import cn.mms.service.InventoryService;
import cn.mms.service.OutstoreService;
import cn.mms.service.SystemDDLService;
import cn.mms.service.impl.InventoryServiceImpl;
import cn.mms.service.impl.OutstoreServiceImpl;
import cn.mms.service.impl.SystemDDLServiceImpl;
import cn.mms.util.PageUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class StatisticsServlet extends HttpServlet {


    private InventoryService inventoryService = new InventoryServiceImpl();
    private OutstoreService outstoreService = new OutstoreServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestName = PageUtil.getRequestName(req.getRequestURL().toString());
        if (requestName.equals("inventory_list")){
            resp.getWriter().print(inventory_list(req));
        }else if (requestName.equals("borrow_list")){
            resp.getWriter().print(borrow_list(req));
        }else if (requestName.equals("destroy_Inventory")){
            resp.getWriter().print(delete(req));
        }
    }

    private String delete(HttpServletRequest req) {
        inventoryService.delete(Integer.parseInt(req.getParameter("mid")));
        return JSON.toJSONString("successful");
    }


    public String inventory_list(HttpServletRequest request){
        Page page = new Page();
        page.setPage(Integer.parseInt(request.getParameter("page")));
        page.setSize(Integer.parseInt(request.getParameter("rows")));
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(inventoryService.getList(page));
        dataGrid.setTotal(inventoryService.count());
        return JSON.toJSONString(dataGrid);
    }

    public String borrow_list(HttpServletRequest request){
        Page page = new Page();
        page.setPage(Integer.parseInt(request.getParameter("page")));
        page.setSize(Integer.parseInt(request.getParameter("rows")));
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(outstoreService.getBorrowList(page));
        dataGrid.setTotal(outstoreService.count_borrow());
        return JSON.toJSONString(dataGrid);
    }
}
