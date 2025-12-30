package com.kang.chap04forwardredirectlecturesource.section01.forward;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/forward")
public class Receivelnformation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 요청에서 전달된 데이터 중에서 key 값이 userID인걸 받아옴 (페이로드 방식)
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        /* RequestDispatcher (요청 발송자)
         *  - 현재 서블릿이 받은 요청을
         *    다른 서블릿으로 위임(forward) 하는 역할의 객체
         *
         *  - 객체 생성 시 위임할 경로 작성
         *    1) 서블릿 요청 주소
         *    2) JSP 파일 경로
         * */

        /* 비즈니스 로직 수행과
         *  응답 화면 생성(print)을 분리하기 위해 다른 서블릿으로 위임*/
        RequestDispatcher rd
                = request.getRequestDispatcher("/print");

        rd.forward(request, response);
    }
}