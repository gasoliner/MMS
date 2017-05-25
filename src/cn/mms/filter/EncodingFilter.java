package cn.mms.filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {


    public void init(FilterConfig fConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}
