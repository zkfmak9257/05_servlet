package com.kang.chap09eljstllecturesource.el.controller;

import com.kang.chap09eljstllecturesource.el.model.dto.MemberDTO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.lang.reflect.Member;

@WebServlet("/test2")
public class TestTwoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MemberDTO member =
                new MemberDTO("박찬진", 26 ,"1303", "koreaArmy@gmail.com");

        request.setAttribute("member","member");

        RequestDispatcher rd = request.getRequestDispatcher("/views/el/testEl2.jsp");
        rd.forward(request, response);




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}