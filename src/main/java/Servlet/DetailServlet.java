package Servlet;

import Models.Item;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/detail.php")
public class DetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Item item = new Item("Nokia 2020", "nokia.png", 500, 0.1);
        req.setAttribute("item", item);
        req.getRequestDispatcher("/views/item/detail.jsp").forward(req, resp);
    }
}
