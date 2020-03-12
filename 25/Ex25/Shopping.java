import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Shopping  extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("html/text");
		PrintWriter pw=res.getWriter();
		int sum=0;
		String [] values=req.getParameterValues("item");
		if(values!=null)
		{
			for(int i=0;i<values.length;i++)
			{
				sum=sum+Integer.parseInt(values[i]);
			}
		}
		HttpSession s1=req.getSession(true);
		s1.setAttribute("page1",sum);
		res.sendRedirect("shopping2.html");
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		doPost(req,res);
	}
}