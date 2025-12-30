package com.kang.chap09eljstllecturesource.el.controller;

import com.kang.chap09eljstllecturesource.el.model.dto.MemberDTO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/test4")
public class TestFourServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        MemberDTO requestMember
                = new MemberDTO("홍길동",19,"010-1234-1234","gdh123@gmail.com");
        MemberDTO sessionMember
                = new MemberDTO("이순순",21,"010-1231-1234","ssl@gmail.com");


        /* request scope 내장 객체에 속성 추가 */
        request.setAttribute("member",requestMember);

        /* session scope 내장 객체에 속성 추가 */
        HttpSession session = request.getSession();
        session.setAttribute("member", sessionMember);

        RequestDispatcher rd = request.getRequestDispatcher("/views/el/testEl4.jsp");
        rd.forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}