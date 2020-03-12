import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Shopping2  extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int sum2=0;
		String [] values=req.getParameterValues("item");
		if(values!=null)
		{
			for(int i=0;i<values.length;i++)
			{
				sum2=sum2+Integer.parseInt(values[i]);
			}
		}
		HttpSession hs=req.getSession(true);
		int sum1=((Integer) hs.getAttribute("page1")).intValue();
		
		pw.println("<html>");
		pw.println("Total of first page: "+sum1);
		pw.println("<br>");
		pw.println("Total of second page: "+sum2);
		pw.println("<br>");
		pw.println("</html>");
		int k=sum1+sum2;
		pw.println("Total Bill : "+k);
	}	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		doPost(req,res);
	}
}