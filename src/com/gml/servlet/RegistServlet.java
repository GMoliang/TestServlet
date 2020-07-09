package com.gml.servlet;

import com.gml.dao.RegistDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doRegist")
public class RegistServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("用户注册后台系统");
        //根据 inpuut框里的name属性 拿到具体的值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+password);

        RegistDao registDao=new RegistDao();
        int flag=registDao.insertUserIofo(username,password);
        System.out.println(flag);
        if(flag!=0){
            System.out.println("注册成功");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else{

        }


    }
}
