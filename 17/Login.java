import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet 
{
 
 public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
  {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("username");
        String pass = request.getParameter("userpass");
      try{
	    Class.forName("org.postgresql.Driver");
	
         Connection c = DriverManager.getConnection("jdbc:postgresql
         ://localhost:5432/tybsc","postgres", "123");
         PreparedStatement ps =c.prepareStatement
                             ("select * from login where email=? and pass=?");
         ps.setString(1, email);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         if(rs.next()) 
        {
            out.println("Welcome");
        }
        else
        {
           out.println("Username or Password incorrect");
           response.sendRedirect("login.html");
        }
         
      }catch(Exception e)
      {
          e.printStackTrace();
      }
        
        
    }  
}