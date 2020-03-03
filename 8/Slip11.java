import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Slip11 extends HttpServlet
{
	public void doGet(HttpServletRequest req,
			HttpServletResponse res)

		
		{
PrintWriter pw=null;
try
{
			res.setContentType("text/html");
			pw = res.getWriter();
			Cookie []c = req.getCookies();
			int i;
			if(c==null) 
			{
			pw.println("<B>Welcome");
			Cookie newCookie = new Cookie("Count","1");
			res.addCookie(newCookie);
			}
			else
			{
			for(i=0;i<c.length;i++)
			{
				String s=c[i].getName();
         			if(s.equals("Count"))
        			{
         			String s1=c[i].getValue();
         			int n=Integer.parseInt(s1)+1;
         			pw.println("page is visited for "+n+" Times");
         			Cookie c2=new Cookie("Count",Integer.toString(n));
          			res.addCookie(c2);
          			break;
        			}
			}
			}
		}catch(Exception e){pw.println("Error"+e);}	
		}
}
