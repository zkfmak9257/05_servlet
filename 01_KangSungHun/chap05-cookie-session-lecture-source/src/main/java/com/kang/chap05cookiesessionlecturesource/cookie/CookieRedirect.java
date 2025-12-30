package com.kang.chap05cookiesessionlecturesource.cookie;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie-redirect")
public class CookieRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* redirect (재요청) -> req, resp가 ㄱ새로 만들어짐
         * */

        // 새롭게 입력되는 파라미터
        System.out.println(request.getParameter("firstName")); // null
        System.out.println(request.getParameter("lastName")); // null

        /* 요청에 담겨서 전달된 쿠키꺼내서 사용하기 */
        String firstName = null;
        String lastName = null;

        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("firstName")) {
                firstName = cookie.getValue();
            } else if (cookie.getName().equals("lastName")) {
                lastName = cookie.getValue();

            }
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>your firstName is " + firstName + " and lastName is " + lastName + "</h1>");
        out.flush();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}