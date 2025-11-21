package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet implements Servlet {

    private StreamResult response;

    public HelloServlet(StreamResult response) {
        this.response = response;
        System.out.println("HelloServlet加载和实例化...");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("HelloServlet初始化...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("HelloServlet请求处理（服务）...");


        PrintWriter out = (PrintWriter) response.getWriter();
        out.println("hello servlet!!!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("HelloServlet销毁...");

    }
}
