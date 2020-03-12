
 <p>
   Today's date: <%= (new java.util.Date()).toLocaleString()%>
</p>
<p>
 The user agent is <%= request.getHeader("user-agent") %>
</p>
<p>	
	Request method: 
	<%= request.getMethod() %>
</p>
<p>	
	Request URI: 
	<%= request.getRequestURI() %>
</p>	
  <p>	
	Cookie Added  
<%   
Cookie firstname = new Cookie("name","Nilambari");

 response.addCookie(firstname);

%> 	
</p>    
<p>	
	Servlet Name:
	<%= config.getServletName() %>
</p>	

<p>	
<%	String val=config.getInitParameter("cl");  
	out.println("Value is="+val);
%></p> 	
<p><%	String driver=application.getInitParameter("dname");  
	out.println("Application parameter is="+driver);  
	%>
</p>
