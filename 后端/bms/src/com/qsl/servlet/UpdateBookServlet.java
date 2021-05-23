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

@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookID = Integer.parseInt(request.getParameter("bookID"));
		String bookName = request.getParameter("bookName");
		String bookAuthor = request.getParameter("bookAuthor");
		String bookCategory = request.getParameter("bookCategory");
		String bookPublish = request.getParameter("bookPublish");
		int bookStock = Integer.parseInt(request.getParameter("bookStock"));
		System.out.println(bookID + bookName + bookAuthor + bookCategory + bookPublish + bookStock);
		
//		int bookID = 1021;
//		String bookName = "Java�������";
//		String bookAuthor = "����";
//		String bookCategory = "�����";
//		String bookPublish = "����ͼ�������";
//		int bookStock = 67;
		
		
		BookDao dao = new BookDao();
		Book book = new Book(bookID, bookName,bookAuthor,bookCategory,bookPublish,bookStock);
		
		JsonObject result = new JsonObject();
		if (dao.updateBook(book) != 0) {
			result.addProperty("result", "�޸ĳɹ�");
		} else {
			result.addProperty("result", "�޸�ʧ��");
		}
		
		//����������⣬��Ҫ�����Ӧͷ
		response.addHeader("Access-Control-Allow-Origin", "*");
		//������Ӧ���ĵ��ַ���
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println(result);
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

}
