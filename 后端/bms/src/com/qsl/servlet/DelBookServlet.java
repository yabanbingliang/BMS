package com.qsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.qsl.dao.BookDao;
@WebServlet("/DelBookServlet")
public class DelBookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//得到要删除的消息编号
		String bookID = request.getParameter("bookID");
		
		BookDao dao = new BookDao();
		int num = dao.deleteBook(bookID);
		Map map = new HashMap();
		if(num>0){
			map.put("isOk", true);
		}else{
			map.put("isOk", false);
		}
		String json = new Gson().toJson(map);
		
		//解决跨域问题，需要添加响应头
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println(json);
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	
}
