package com.project.servlet;

import java.io.IOException;

import com.project.DAO.InsertDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String t_name = request.getParameter("tname");
		String t_email = request.getParameter("temail");
		String t_phone = request.getParameter("tphone");
		
		InsertDAO insertdao = new InsertDAO();
		insertdao.addTeacher(t_name, t_email, t_phone);
	}

}
