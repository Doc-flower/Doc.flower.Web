package main.java.com.example.docflower;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID=1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String type=request.getParameter("type");
        if(type.equalsIgnoreCase("signin"))
            signin(request, response);
    }
    private void signin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String user=request.getParameter("user");
        String password=request.getParameter("password");
        if(user.equals("zhangsan") && password.equals("123456"))
        {
            out.write("登陆成功😁");
        }else{
            out.write("登陆失败☹");
        }
        out.close();
    }
}