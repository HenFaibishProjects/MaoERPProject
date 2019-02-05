package main.java.com.Mao.BackEndDev.webPortal.servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class abc extends HttpServlet {
 
    /**
	 * 
	 */
	private static final float serialVersionUID = -6737820994439962168L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rs = request.getRequestDispatcher("Welcome");
        rs.forward(request, response);
        
    }  
}