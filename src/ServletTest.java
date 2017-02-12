import javax.servlet.*;
import java.io.IOException;

/**
 * Created by xuwei on 2016/11/20.
 */
public class ServletTest implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化Servlet");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("接收到请求了");
        servletResponse.getWriter().write("hello world");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Servlet被销毁了");
    }
}
