package com.qsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;
import com.qsl.dao.BookDao;
import com.qsl.entity.Book;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookName = request.getParameter("bookName");
		String bookAuthor = request.getParameter("bookAuthor");
		String bookCategory = request.getParameter("bookCategory");
		String bookPublish = request.getParameter("bookPublish");
		int bookStock = Integer.parseInt(request.getParameter("bookStock"));
		
//		String bookName = "1";
//		String bookAuthor = "1";
//		String bookCategory = "1";
//		String bookPublish = "1";
//		int bookStore = 6;
		
		BookDao dao = new BookDao();
		Book book = new Book(bookName,bookAuthor,bookCategory,bookPublish,bookStock);
		
		JsonObject result = new JsonObject();
		if (dao.addBook(book) != 0) {
			result.addProperty("result", "添加成功");
		} else {
			result.addProperty("result", "添加失败");
		}
		
		//解决跨域问题，需要添加响应头
		response.addHeader("Access-Control-Allow-Origin", "*");
		//设置相应报文的字符集
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println(result);
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
