package com.servlet;

import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//编码问题
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String birthday = req.getParameter("birthday");
        System.out.println(name);
        System.out.println(sex);
        System.out.println(birthday);


        req.setAttribute("name",name);
        req.setAttribute("sex",sex);
        req.setAttribute("birthday",birthday);

        UserService userService = new UserService();

        req.setAttribute("msg",userService.queryUserList(name,sex,birthday));
        System.out.println(userService.queryUserList(name,sex,birthday));
        req.getRequestDispatcher("/WEB-INF/select.jsp").forward(req,resp);
        //System.out.println("已经转发到select.jsp");

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
