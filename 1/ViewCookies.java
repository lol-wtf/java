import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ViewCookies extends HttpServlet
{
public void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
Cookie []c = req.getCookies();
pw.println("<table border=1>"+
"<tr><th>Name</th><th>Value</th></tr>");
for(int i=0;i<c.length;i++)
{
pw.println("<tr>"+
"<td>"+c[i].getName()+"</td>"+
"<td>"+c[i].getValue()+"</td>"+
"</tr>");
}
}
}