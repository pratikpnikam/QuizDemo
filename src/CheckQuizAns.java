

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckQuizAns
 */
public class CheckQuizAns extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter writer = response.getWriter();
		int counter=0;
		
		if(request.getParameter("q1").equals("Mumbai")) { 
			counter++; 
			writer.println("Question 1 is Correct<br>");
		}else {
			writer.println("Question 1 is InCorrect<br>");
		}
		
		
		
		if(request.getParameter("q2").equals("Delhi")) {
			counter++;
			writer.println("Question 2 is Correct<br>");	
		}else {
			writer.println("Question 2 is InCorrect<br>");   
		}
		
		
		
		if (request.getParameter("q3").equals("India")) {
			counter++;
			writer.println("Question 3 is Correct<br>");
		}else {
			writer.println("Question 3 is InCorrect<br>");
		}
		
		
		if(request.getParameter("q4").equals("Drake")) {
			counter++;
			writer.println("Question 4 is Correct<br><br>");
		}else {
			writer.println("Question 4 is InCorrect<br><br>");
		}
		
		
		writer.print("You got "+counter+" Questions correct<br><br>");  
		writer.print("<a href=index.html>Quiz Page</a>");
		
	}

}
