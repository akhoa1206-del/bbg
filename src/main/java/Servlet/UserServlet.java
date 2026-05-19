package Servlet;

import Models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/user.php")
public class UserServlet extends HttpServlet {


    static List<User> users = new ArrayList<>(Arrays.asList(
            new User("Username 1", "Password 1", true),
            new User("Username 2", "Password 2", false),
            new User("Username 3", "Password 3", true)
    ));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message", "Quản lý người sử dụng!");
        req.setAttribute("form", users.get(0));
        req.setAttribute("items", users);
        req.getRequestDispatcher("/views/user/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String u = req.getParameter("username");
        String p = req.getParameter("password");
        boolean r = req.getParameter("remember") != null;


        User newUser = new User(u, p, r);
        users.add(newUser);


        req.setAttribute("message", "Thêm thành công tài khoản: " + u);
        req.setAttribute("form", newUser);
        req.setAttribute("items", users);
        req.getRequestDispatcher("/views/user/index.jsp").forward(req, resp);
    }
}