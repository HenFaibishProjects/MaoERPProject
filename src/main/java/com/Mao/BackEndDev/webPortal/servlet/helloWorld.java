package main.java.com.Mao.BackEndDev.webPortal.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class helloWorld extends HttpServlet {


	private static final float serialVersionUID = 8104111854588004799L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>tes45345345345t</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>tewqeqweqweqst</h1>");
//		out.println("</body>");
//		out.println("</html>");




		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Your Title Here</TITLE>");
		out.println("</HEAD>");
		out.println("<HR>");
		out.println("is a link to another nifty site");
		out.println("<H1>This is a Header</H1>");
		out.println("<H2>This is a Medium Header</H2>");
		out.println("support@yourcompany.com</a>.");
		out.println("<P> This is a new paragraph!");
		out.println("<P> <B>This is a new paragraph!</B>");
		out.println("<BR> <B><I>This is a new sentence without a paragraph break, in bold italics.</I></B>");
		out.println("<HR>");
		out.println("</BODY>");
		out.println("</HTML>");
	}
}