package userLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		PrintWriter out= resp.getWriter();
		
		String username= req.getParameter("uname");
		String password= req.getParameter("pass");
		
		if(username != null && username.equals("aliyas") && password != null && password.equals("admin123")) {
          
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("uname", username);
            RequestDispatcher rd = req.getRequestDispatcher("disp");
            rd.forward(req, resp);
        }
		else {
			out.print("Sorry, Invalid Login ! ");
		}
		
		
	}


}
