	/*

 Design a servlet that provides information about a HTTP request from a client, such as IP address and browser type. The servlet also provides information about the server on which  the  servlet  is  running,  such  as  the  operating  system  type,  and  the  names  of currently loaded servlets.

	
*/


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Seta1 extends HttpServlet
 {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
    {
      try
       {  
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Request Information Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Request Information Example</h3>");
        java.util.Properties p=System.getProperties();

        out.println("Server Name :"+request.getServerName()+"<br>");        

        out.println("Operating System Name :"+p.getProperty("Linux")+"<br>"); 
        out.println("Method: " + request.getMethod()+"<Br>");
        out.println("Request URI: " + request.getRequestURI()+"<Br>");
        out.println("Protocol: " + request.getProtocol()+"<Br>");
        out.println("PathInfo: " +request.getServletPath()+"<Br>");
        out.println("Remote Address: " +request.getRemoteAddr()+"<Br>");
        out.println("</body>");
        out.println("</html>");
       }
       catch(Exception e)
       {
         e.printStackTrace();

       }
    }
 }
