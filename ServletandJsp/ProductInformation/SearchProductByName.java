package com.myserv.search;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myserv.dao.ProductDao;
import com.myserv.model.Product;

/**
 * Servlet implementation class SearchProductByName
 */
@WebServlet("/SearchProductByName")
public class SearchProductByName extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//response.setContentType("text/html");
		
		String data=request.getParameter("name");
		
		
		ProductDao dao=new ProductDao();
		ArrayList<Product> productList=  dao.searchProductByName(data);

//System.out.println(productList.size());
		
	HttpSession session= request.getSession();
		session.setAttribute("productList", productList);


		RequestDispatcher rd= request.getRequestDispatcher("displaySearchResult.jsp");
		rd.forward(request, response);


	}

}
