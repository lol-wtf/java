import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Slip3 extends HttpServlet 
{
 
 public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
  {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int billno = Integer.parseInt(request.getParameter("bno"));
       
       
      try{
	    Class.forName("org.postgresql.Driver");
	
         Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsc","postgres", "123");
         PreparedStatement ps =c.prepareStatement
                             ("select * from billmaster,billdetails where billmaster.billno=billdetails.billno and billmaster.billno=?");
         ps.setInt(1, billno);
         int sno=1,finaltotal=0,total,rate,qty;
         ResultSet rs =ps.executeQuery();
         if(rs.next()) 
        {
	    out.println("<html><body><title>CUSTOMER BILL</title>");
	    out.println("<p>Bill No: "+rs.getInt(1)+"      Bill Date : "+rs.getDate(3)+"</p>");
	    out.println("<p>Customer Name : "+rs.getString(2)+"</p>");
	    out.println("<table border="+1+"><tr><td>Sr. No</td><td>Item Name</td><td>Quantity</td><td>Rate</td><td>Total</td></tr>");
	    
	     rate=rs.getInt(6);
	     qty=rs.getInt(5);
	     total=rate*qty;
	     finaltotal+=total;
	    out.println("<tr><td>"+sno+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getInt(5)+"</td><td>"+rs.getInt(6)+"</td><td>"+total+"</td></tr>");
   
	    
            
        }
        while(rs.next())
        {
	     rate=rs.getInt(6);
	     qty=rs.getInt(5);
	     total=rate*qty;
	    sno=sno+1;
	     finaltotal+=total;
	    out.println("<tr><td>"+sno+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getInt(5)+"</td><td>"+rs.getInt(6)+"</td><td>"+total+"</td></tr>");
   
        }
        out.println("<tr><td> Net Bill </td><td>"+finaltotal+"</td></tr>");
       out.println("</table></body></html>");      
        
         
      }catch(Exception e)
      {
          e.printStackTrace();
      }
        
        
    }  
}