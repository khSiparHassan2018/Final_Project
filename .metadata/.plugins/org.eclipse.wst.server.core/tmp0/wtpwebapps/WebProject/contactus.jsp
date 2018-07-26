<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="webProject.bean.*" %>
<%@ page import="webProject.daoImpl.*" %>
<%@ page import="webProject.service.*" %>
<!--Web design-->

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
    <link rel ="stylesheet" href="CSS/style.css" type="text/css">
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
       
        
            <div style="background:#808080;margin:25px;padding:20px;float:center;font-size:10px;"> 
        <div id="contactUsContent">
            
            
                <h1>CONTACT US</h1><br/>
                
                <p>Click here to enroll in our dog walking services.Click here to enroll in our petsitting or hangout services. Click here to enroll in our Lil Bow Wow Doggy Care training package.</p> 
                    <br/>
                <p>With a list of references and glowing customer reviews we pride ourselves on our quality customer service and the high level of attention and care we give our furry friends.</p>
                <br/>
                <p>Pooch Pals pet care is a fully bonded & insured member of Pet Sitters International.</p>
              </div>
              </div>
              <div class="box" style="background:#808080; color:black; text-color:black;padding-left:15px;margin-left:300px;float:left;width:50% ; height:55%;margin-right:25px;margin-top:25px;margin-bottom:25px;"> 
        <!--table for form on contact us page, what do you think about it??-->
        <h2>Fill in the form Below:</h2>
        <form action="contactUsServlet" method="post">
        <table>
        <tr>
        	<td> Name:</td>
        	<td style="width:200px;"><input type="text" name="name"></td>
        </tr>
        <tr>
        	<td> Address:</td>
        	<td><input type="text" name="address"> </td>
        </tr>
        <tr>
        	<td>E-mail:</td>
        	<td> <input type="email" id="email" name="email"> </td>
        </tr>
        <tr>
        	<td>Date of Birth:</td>
        	<td><input type="text" id="dob" placeholder="DD/MM/YY" name="dob"></td>
        </tr>
        <tr>
        	<td>Gender of Dog:</td>
        	<td>&nbsp;&nbsp;<input type="radio" name="gender" value="Male" style="width:50px;">Male&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="gender" value="Female" style="width:50px;">Female</td>
        </tr>
        <tr>
        	<td>Choose your service</td>
        	<td><select name="intrest">
        				<option value="--Select Service--">--Select Service--</option>
                        <option value="Computer Course">Dog Walking</option>
                        <option value="Business Course">Dog Grooming</option>
                        <option value="Art Course">Over Night Stay</option>
                        <option value="Language Course">Dog Obedience Training Course</option>
            </select></td>
         </tr>
         <tr>
         	<td>Further Comment:</td>
         	<td><textarea rows="4" cols="50" name="comment" placeholder="Enter Text here..."></textarea></td>
         </tr>
        <tr>
        	<td><button type="submit" style="width:200px;">Submit</button></td>
        	<td><button type="reset" style="width:200px;">Cancel</button></td>
        </tr>
        
        </table>
         </form>
        <!--embedded google map-->
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2375.3656511564795!2d-6.204923048758653!3d53.46192497990524!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4867109152ecb1c3%3A0x2cf219f681eacf62!2sDublin+Dog+Training!5e0!3m2!1sen!2suk!4v1490696174731" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe><br/><br/><br/><br/>
   
        </div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
        		 <%
       }
       else
       {
    	   response.sendRedirect("login.jsp");
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