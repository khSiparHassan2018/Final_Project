<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="webProject.bean.*" %>
<%@ page import="webProject.daoImpl.*" %>
<%@ page import="webProject.service.*" %>

<!--Web design Group project-->

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
    
   <body onload="access()" >
   <%  try{
	   StartVolunteeringBean user = (StartVolunteeringBean)request.getSession().getAttribute("user");
        AbstractDao abd=new AbstractDao();
        String name=user.getFname();
       System.out.println("user"+user);
       if(user!=null)
       {
       
       %>
       <header class="mainpic">
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
       
      <div class="box" style="background:#808080;margin:25px;padding:20px;">
        <div class="subSectionTwo"></div>
        <!--images for the photo gallery page-->  
           <h1><br/><br/><br/>Photo Gallery</h1>  
            <table>
            <tr>
                <th></th>
            </tr>
            
            <tr>
                <td><img src="images/img1.jpg"></td>
                <td><img src="images/img2.jpg"></td>
                <td><img src="images/img3.jpg"></td>
            </tr>    
                
            <tr>
                <td><img src="images/img4.jpg"></td>
                <td><img src="images/img5.jpg"></td>
                <td><img src="images/img6.jpg"></td>
                    
            </tr>    
            
            </table>
            
            <!--youtube video-->
            <iframe width="560" height="315" src="https://www.youtube.com/embed/Ro0KH6hAnHA" frameborder="0" allowfullscreen></iframe>
            <br/><br/>
            <!--this was an attempt at getting a twitter button to work from w3 school, didnt work!!-->
            <p>Unicode:</p> 
            <i style="font-size:24px" class="fa">&#xf099;</i>
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
