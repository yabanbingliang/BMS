package com.qsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.qsl.dao.AdministratorDao;
import com.qsl.entity.Administrator;

@WebServlet("/adminLogin")
@MultipartConfig
public class AdminLoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminID = request.getParameter("adminID");
		String adminPWD = request.getParameter("adminPWD");
		System.out.println(adminID+adminPWD);

		AdministratorDao dao = new AdministratorDao();
		Administrator admin = dao.getAdministratorById(adminID);
		
		Map map = new HashMap();
		if(admin != null && admin.getAdminPWD().equals(adminPWD)){
			admin.setAdminPWD(null);
			request.getSession().setAttribute("loginUser", admin);
			map.put("admin", admin);
		}
		
		String jsonStr = new Gson().toJson(map);
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("utf8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.print(jsonStr);
		out.close();
	}

}
