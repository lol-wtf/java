<%@page import="java.util.*"%>
<%
     String name = request.getParameter("uname");
     Date d = new Date();
     if(d.getHours()<10)
     {
%>
Good Morning <%=name%>
<%
     }
     else if(d.getHours()<16)
     {
%>
Good Afternoon <%=name%>
<%
     }
     else
     {
%>
Good Evening <%=name%>
<%
     }
%>
