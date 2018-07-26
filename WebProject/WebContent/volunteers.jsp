<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="webProject.bean.*" %>
<%@ page import="webProject.daoImpl.*" %>
<%@ page import="webProject.service.*" %>
<!--Web design Group-->

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
         
    <link rel ="stylesheet" href="CSS/doggy.css" type="text/css">
    <link rel ="stylesheet" href="CSS/servicesStyle.css" type="text/css">
    <meta name="keywords" content="dog, groom, daycare, dublin, doggie, puppy">
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
       <h1><br/><br/><br/></h1>
       
        <div class ="mainSection">	</div>
          <div class="box" style="background:#808080;margin:25px;padding:20px;">
<table>
   <tr>
    <th>Everyone can volunteer</th>
    <th>Contact us to book in!</th>
    
  </tr>
  <tr>
    <td>Socialisation Classes</td>
    <td>Hugely beneficial if you have a shy or temperamental dog</td>
  </tr>
  <tr>
    <td>Dog Walking</td>
    <td>Let us take care of running the legs off them!</td>
  </tr>
  <tr>
    <td>Free Trial and Assesment</td>
    <td>We know it may not suit everyone so a trial may be of some benefit and its FREE!</td>
  </tr>
  <tr>
    <td>Sleepover Services</td>
    <td>Similar to normal Kennels only way more cosy!</td>
  </tr>
  <tr>
    <td>Dog Chauffeur</td>
    <td>Drop off and collection Services in the local area</td>
  </tr>
  <tr>
    <td>Ball Games</td>
    <td>interactive ball and obstable courses</td>
  </tr>
   <td>Paddling Pools to play on those warm days</td>
   <td></td>
   <tr>
    <td>Ball Games</td>
    <td>interactive ball and obstable courses</td>
  </tr>
  <tr>
    <td>Ball Games</td>
    <td>interactive ball and obstable courses</td>
  </tr>
  <tr>
    <td>Ball Games</td>
    <td>interactive ball and obstable courses</td>
  </tr>
  <tr>
    <td>Ball Games</td>
    <td>interactive ball and obstable courses</td>
  </tr>
</table>
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