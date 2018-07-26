<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="webProject.bean.*" %>
<%@ page import="webProject.daoImpl.*" %>
<%@ page import="webProject.service.*" %>
<!--Final project-->

<!DOCTYPE html>

<html lang="en">

    <head>

    <meta charset="utf-8">
    
    <title>Homeless Final Project</title>
    
    <!--[if lt IE 9]>
		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
        <!--[if lte IE 9]> 
	    <script src="http://css3-mediaqueries-	js.googlecode.com/svn/trunk/css3-	mediaqueries.js"></script> 
        <![endif]-->
         
    <link rel ="stylesheet" href="CSS/homeless.css" type="text/css">
    <link rel ="stylesheet" href="CSS/servicesStyle.css" type="text/css">
    <meta name="keywords" content="homeless, welfare, charity, volunteer, homelessness">
     <script>
   
    function preventBack(){window.history.forward();}
   	setTimeout("preventBack()", 0);
    window.onunload=function(){null};
 
    function access(){ 
        	<% 
        		
        	
              if(request.getSession().getAttribute("msg")!=null){
      
            String str=request.getSession().getAttribute("msg").toString();%>           
            alert('notice'+" : "+"<%=str%>");
            <%  
             request.getSession().setAttribute("msg", null); }else {%>

            <%}%>
            } 
        </script>
    </head>
    
   <body onload="access()" background="images/Homeless.jpg" >
  <%  try{
	   StartVolunteeringBean user = (StartVolunteeringBean)request.getSession().getAttribute("user");
        AbstractDao abd=new AbstractDao();
        String name=user.getFname();
       System.out.println("user"+user);
       if(user!=null)
       {
       
       %>
       <header>
        <nav>
            <a href="home.jsp">Home</a>
			<a href="aboutus.jsp">About Us</a>
            <a href="volunteers.jsp">Volunteers</a>
            <a href="organisations.jsp">Organisations</a>
            <a href="resources.jsp">Resources</a>
            <a href="contactus.jsp">Contact us</a>
            <a href="logoutServlet">LogOut</a>
        </nav>   
       </header>    
        
        
        <br/><br/>
       
        
           		<br/><br/><br/><br/><br/><br/><br/>
				 <%
       }
      
}catch(Exception e){
	String ipAddress = request.getHeader("X-FORWARDED-FOR");
	if (ipAddress == null) {
		   ipAddress = request.getRemoteAddr();
	}
	new controller().addLog("URLInjection", ipAddress);
	session.setAttribute("msg", "URLInjection detected");
	response.sendRedirect("login.jsp");
}
%>
		<section id="footer">
           <h3>footer of the website </h3>
       </section>
            </body>

</html>
