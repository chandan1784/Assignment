package com.myserv.delete;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myserv.dao.ProductDao;


@WebServlet("/GetDeleteProducts")
public class GetDeleteProducts extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//PrintWriter out= response.getWriter();
	response.setContentType("text/html");

	int prodId=Integer.parseInt(request.getParameter("id"));
	ProductDao dao=new ProductDao();
	String deletedrow=dao.deleteProductById(prodId);
	

	HttpSession session= request.getSession();
	session.setAttribute("deletedrow",deletedrow );
	
RequestDispatcher rd= request.getRequestDispatcher("DeleteProducts.jsp");
rd.forward(request, response);

}


}
