package controller;

import model.Caculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "ServletCaculator", value = "/caculator")
public class ServletCaculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstNumber = req.getParameter("number1");
        String operator = req.getParameter("operator");
        String secondNumber = req.getParameter("number2");

        float number1 = Float.parseFloat(firstNumber);
        float number2 = Float.parseFloat(secondNumber);
        char method = operator.charAt(0);

        float result = Caculator.caculator(number1, number2, method);

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("ReSulT");
        writer.println(number1 +" "+ method +" " + number2+" = ");
        writer.println(result);
        writer.println("</html>");

//        req.setAttribute("result", result);
//        req.setAttribute("firstNumber", number1);
//        req.setAttribute("secondNumber", number2);
//
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/result.jsp");
//        requestDispatcher.forward(req,resp);


    }
}
