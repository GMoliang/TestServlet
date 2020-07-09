package com.gml.servlet;

import com.gml.dao.LoginDao;
import com.gml.module.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doLogin")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        System.out.println("用户登录后台系统");
        //根据 inpuut框里的name属性 拿到具体的值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+password);

        LoginDao loginDao=new LoginDao();
        User user=loginDao.selectUserIofo(username);

        if (!username.equals(user.getUsername())){
            request.setAttribute("errorlog","用户名错误");
            request.getRequestDispatcher("/error.jsp").forward(request,response);
        } else if(!password.equals(user.getPassword())){
            System.out.println("66");
            request.setAttribute("errorlog","密码错误");
            request.getRequestDispatcher("/error.jsp").forward(request,response);
        }else {
            System.out.println("登录成功");
        }
    }
}
