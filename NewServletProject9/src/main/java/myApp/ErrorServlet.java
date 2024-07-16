package myApp;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorStatus")
public class ErrorServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String errorType = request.getParameter("error");

	        if ("400".equals(errorType)) {
	            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Simulated 400 Error");
	            return;
	        } else if ("500".equals(errorType)) {
	            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Simulated 500 Error");
	            return;
	        }

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html><body>");
	        out.println("<h1>Hello, World!</h1><p/>");
	        out.println("<h1>Status TEST!</h1><p/>");
	        out.println("</body></html>");
	    }
	}
	
	
	


