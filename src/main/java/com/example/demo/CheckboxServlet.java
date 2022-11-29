package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public CheckboxServlet(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // 입력한 데이터 수신
        // 여러개의 값을 수신할 때 getParameterValues()를 이용
        String[] items = request.getParameterValues("item");

        PrintWriter out = response.getWriter();

        out.println("<html><head></head><body>");
        if(items == null) {
            out.println("선택한 항목이 없습니다.");
        } else {
            out.println("당신이 선택한 항목입니다.<br>");
            for(String item: items) {
                out.println("[" + item + "] ");
            }
        }
        out.println("<br><a href='javascript.history.go(-1)'>다시</a>");
        out.println("</body></html>");
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
