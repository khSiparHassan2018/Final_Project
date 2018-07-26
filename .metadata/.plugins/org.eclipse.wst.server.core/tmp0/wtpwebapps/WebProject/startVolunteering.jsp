<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="webProject.bean.*" %>
<%@ page import="webProject.daoImpl.*" %>
<%@ page import="webProject.service.*" %>
<%@ page import="java.util.*" %>
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
  
  
    function access(){ 
        	<%         	
              if(request.getSession().getAttribute("msg")!=null){
      
            String str=request.getSession().getAttribute("msg").toString();%>           
            alert('notice'+" : "+"<%=str%>");
            <%  
             request.getSession().setAttribute("msg", null); }else {%>
          
            <%}%>
            }
    
    function changeVal() 
    { 
 	  
 	  var organisationName=document.forms["form"]["organisationName"].value;
 	  window.location.replace("AdvertiseRole.jsp?organisationName="+organisationName);
 	     
 	   
    } 
    </script>
 </head>
<body onload="access()">
    
       <header class="mainpic">
          
           <div class = "welcome">
               <h1>Register</h1><br/>
              <font color="white"><h2>I-VOL is the national searchable database of volunteering opportunities in Ireland and is owned, managed and administered by Volunteer Ireland and the network of Volunteer Centres and Volunteer Information Services in Ireland. 
              Completing this form allows you to register your interest in volunteering opportunities that are listed online. When you have completed the form, and provided us with a valid e-mail address, you will receive a confirmation email, and instructions on how to begin your search for opportunities.
               You only need to fill in this form once.</h2></font>
            
               </div>
         </header>
                <div class="box" style="background:#808080; color:black; text-color:black;padding-left:15px;margin-left:300px;float:left;width:50% ; height:1000px;margin-right:25px;margin-top:25px;margin-bottom:100px;"> 
               	<form action="startVolunteeringServlet" method="post" id="form">
               	
      				<h1>Register Now</h1>
      				<table>
      				<tr>
      					<td>First Name:</td>
      					<td><input type="text" name="fname" placeholder="Enter First Name" required/></td>
      				</tr>
      				<tr>
      					<td>Last Name:</td>
      					<td><input type="text" name="lname" placeholder="Enter Last Name" required/></td>
      				</tr>
      				<tr>
      					<td>Street Address:</td>
      					<td><textarea name="adddress" placeholder="Enter Address.." style="margin-left:80px;width:300px;"></textarea></td>
      				</tr>
      				<tr>
      					<td>Town/City:</td>
      					<td><input type="text" name="city" placeholder="Enter City" required/></td>
      				</tr>
      				<tr>
      					<td>Country:</td>
      					<td><input type="text" name="country"  placeholder="Enter Country" required/></td>
      				</tr>
      				<tr>
      					<td>Email:</td>
      					<td><input type="text" name="email" placeholder="Enter Email" required/></td>
      				</tr>
      				<tr>
      					<td>Password:</td>
      					<td><input type="password" name="password" placeholder="Enter Password" required/></td>
      				</tr>
      				<tr>
      					<td>Phone:</td>
      					<td><input type="text" name="mobile" placeholder="Enter Mobile No" required/></td>
      				</tr>
      				
      				<tr>
      					<td>Select Role:</td>
      					<td>
      					<select name="role" style="margin-left:80px;width:340px;">
      					<option value="--Select Volunteer Role--">--Select Volunteer Role--</option>
      					<%
      					List<DataInterface> ls=new AbstractDao().listByQuery("from AdvertiseRoleBean");
      					Iterator<DataInterface>it=ls.iterator();
      					while(it.hasNext())
      					{
      						AdvertiseRoleBean roleBean=(AdvertiseRoleBean)it.next();
      					
      					%>
      						<option value="<%=roleBean.getRole() %>"><%=roleBean.getRole() %></option>
      					<%} %>
      					</select>
      			
      				</tr>
      					<tr>
        					<td><button type="submit" style="width:200px;">Submit</button></td>
        					<td><button type="reset" style="width:200px;">Cancel</button></td>
        				</tr>
      					
  				    </table> 
  				    <p style="font-size:20px;">You already have a membership?<a href="login.jsp">Login</a></p>          	
               	</form><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
               
                </div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>        <section id="footer">
           <h3>footer of the website </h3>
       </section>
       
   </body>
  </html>