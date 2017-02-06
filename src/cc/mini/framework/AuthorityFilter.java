package cc.mini.framework;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 通过该Filter设置request的编码字符集
 * Created by wxc on 2017/2/5.
 */
@WebFilter(filterName = "authority", urlPatterns = {"/admin/*"},
        initParams = {
                @WebInitParam(name = "encoding", value = "UTF-8"),
                @WebInitParam(name = "loginPage", value = "/admin/login.jsp"),
                @WebInitParam(name = "loginUrl", value = "/admin/login/check")
        })
public class AuthorityFilter implements Filter {
    private FilterConfig config;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String encoding = config.getInitParameter("encoding");
        String loginPage = config.getInitParameter("loginPage");
        String loginUrl = config.getInitParameter("loginUrl");

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        request.setCharacterEncoding(encoding);
        HttpSession session = request.getSession();

        // 获取客户请求的页面
        String requestPath = request.getServletPath();
        if (requestPath.startsWith("/admin/assets") || session.getAttribute("account") != null || !requestPath.endsWith(loginPage) || !requestPath.startsWith(loginUrl)) {
            filterChain.doFilter(request, servletResponse);
        } else {
            request.setAttribute("error", "您还没登录!");
            request.getRequestDispatcher(loginPage).forward(request, servletResponse);
        }
    }

    @Override
    public void destroy() {
        this.config = null;
    }

    public void test(  ){
    }
}
