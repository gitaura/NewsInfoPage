package com.example.controler;

import com.example.model.Article;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ArticleServlet", value = {"/articles"})
public class ArticleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String idString = request.getParameter("id");
        int id = Integer.parseInt(idString);
        Article article = DataBaseArticle.getArticleById(id);

        request.setAttribute("article", article);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/article.jsp");
        dispatcher.forward(request, response);
    }
}


