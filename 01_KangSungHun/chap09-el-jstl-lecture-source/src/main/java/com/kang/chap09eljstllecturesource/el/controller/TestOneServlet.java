package com.kang.chap09eljstllecturesource.el.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/test1")
public class TestOneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("name", "홍길동");
        request.setAttribute("age", "3045");
        request.setAttribute("phone", "112");


        List<String> items = new ArrayList<>();
        items.add("목검");
        items.add("장미칼");
        items.add("집행검");

        request.setAttribute("items", items);

        RequestDispatcher rd = request.getRequestDispatcher("/views/el/testEl1.jsp");

        rd.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}