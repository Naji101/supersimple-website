

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class loginServlet
 */

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("failed to login");
		response.sendRedirect("index.jsp");
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("enter here ");     
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        String action = request.getParameter("action");
        if (action.equals("login")) {
        	System.out.println("action is " +action);
        // Your expected username and password
        String expectedUsername = "naji";
        String expectedPassword = "1234";

        if (username.equals(expectedUsername) && password.equals(expectedPassword)) {
            // Successful login
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            response.sendRedirect("site.jsp");
        } else {
            // Failed login
        	response.sendRedirect("index.jsp");
        }
        }else if (action.equals("site")) {
        	System.out.println("action is "+action);
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
        	response.sendRedirect("welcome.jsp");
        }
	}

}
