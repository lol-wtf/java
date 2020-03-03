import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AddCookie extends HttpServlet
{
	public void doPost(HttpServletRequest req,
			HttpServletResponse res)
		throws ServletException,IOException
		{
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			//Cookie []c = req.getCookies();
			//int id=1;
			//if(c!=null) id = c.length+1;
			String value = req.getParameter("hob");
			
			Cookie newCookie = new Cookie(value,value);
			res.addCookie(newCookie);
			pw.println("<h4>Cookie added with value "+value+"</h4>");
		}
}