package homework.com;

public class Homework; 
{
	
	package homework.com;
	import jakarta.annotation.*;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	@WebServlet("/annotation")

	public class Homework extends HttpServlet
	{
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    // Get parameters from the request
		    String firstName = request.getParameter("firstName"); // Parameter name should match the input field in HTML
		    String lastName = request.getParameter("lastName");

		    // Prepare response
		    response.setContentType("text/html");  // Set content type
		    response.getWriter().append("Welcome, ").append(firstName).append(" ").append(lastName).close();
		}

	}



