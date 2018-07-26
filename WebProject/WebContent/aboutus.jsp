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
       
        
            <div class="box" style="background:#808080;margin:25px;padding:20px;"> 
                
               <center> <h1>ABOUT US</h1></center><br/>
                
                <h2>We would like to encourage YOU to help the homeless in Dublin</h2>
                
                <h3>Why?</h3>
                
                <p>Most of the families becoming homeless have never experienced homelessness before and never thought this could happen to them. Thousands more families are struggling on very low incomes or social welfare and many are falling into serious housing difficulties as rents continue to rise.</p><br>
                
                <h3>WHO?</h3>
                
                <p>Vulnerable young people are among the first victims of the housing crisis, with private landlords, social housing bodies and local authorities reluctant to rent to them.</p><br>
                
                <h3>How can you help?</h3>
                
                <p>Get registered with us! Give us an idea of when you may be available to help. What days of the week? Weekdays / Weekends? Evenings / Day / Nighttime. Homeless People need to know we care. It is our responsibility as a community to step up and DEMAND they are treated with respect. Lets come together and help the people of our lovely city</p><br>
                
                <h3>Community:</h3>
                
                <p>We have a number of charity partners who we work with. St Vincent de Paul, The Simon Community, Focus Ireland, Inner City Helping Homelessness. They are doing some great work. We really need to come together as a cummunity and do more. What can you do to help?</p><br>
                
                
                <!--video-->
                <iframe id = "aboutUsVideo" src="https://www.youtube.com/watch?v=OJYZbciMwls" allowfullscreen></iframe>
            
            </div>
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
