package com.qsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.qsl.dao.BookDao;
import com.qsl.entity.Book;
@WebServlet("/GetBookListServlet")
public class GetBookListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int page_curr = Integer.parseInt(request.getParameter("page_curr"));
		int page_row = Integer.parseInt(request.getParameter("page_row"));
		String bookName = "高";
		if(request.getParameter("bookName")!=null) {
			bookName = request.getParameter("bookName");
		}
		
//		int page_curr = 1;
//		int page_row = 10;
		
		BookDao dao = new BookDao();
		List<Book> list = dao.getList(page_curr, page_row, bookName);
		int total = dao.count(bookName);
		
		Map map = new HashMap();
		map.put("isOk", true);
		map.put("books", list);
		map.put("page_total", total);
		String json = new Gson().toJson(map);
		
		//解决跨域问题，需要添加响应头
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println(json);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}
}
