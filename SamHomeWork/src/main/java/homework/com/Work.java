package homework.com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/annotation")
public class Work extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get parameters from the request
		
		String firstname=request.getParameter("Firstname");
		String lastname=request.getParameter("lastname");
		//prepare response
		
		response.setContentType("text/html");
	    
		response.getWriter().append("Welcome, ").append(firstname).append(lastname).close();
	}

}
