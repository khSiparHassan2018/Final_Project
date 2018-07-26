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
               <h1>Post a Volunteering Opportunity</h1><br/>
               <font color="white"><h2>I-VOL is the national searchable database of volunteering opportunities in Ireland and is owned, managed and administered by Volunteer Ireland, the network of Volunteer Centres and Volunteer Information Services in Ireland .
			In order to register your volunteering opportunity/ies with us, your organisation must be already registered on I-VOL. Click here if you are not already registered. In order to proceed, you will need your key/password that was provided to you on your initial registration. If you do not know this, you can use the retrieve key function.</h2></font>
              
               </div>
         </header>
                <div class="box" style="background:#808080; color:black; text-color:black;padding-left:15px;margin-left:300px;float:left;width:50% ; height:50%;margin-right:25px;margin-top:25px;margin-bottom:100px;"> 
               	<form action="advertiseRoleServlet" method="post" id="form">
               	
      				<h1>Advertise a role</h1>
      				<table>
      				<tr>
      					<td>Organization Name:</td>
      					<td>
      					<select name="organisationName" style="margin-left:40px;width:340px;" id="organisationName" onchange="changeVal()">
      					<%
      					AbstractDao abd=new AbstractDao();
      					List<DataInterface> ls=abd.listByQuery("from AddOrganisationBean");
      					Iterator<DataInterface> it=ls.iterator();
      					while(it.hasNext())
      					{
      						AddOrganisationBean org=(AddOrganisationBean)it.next();
      					
      					
      					%>
      					<option value="<%=org.getOrganisationName() %>"><%=org.getOrganisationName() %></option>
      					<%} %>
      					</select>
      					</td>
      				</tr>
      				<%
      				String organisationName=request.getParameter("organisationName");
      				System.out.println("organnn"+organisationName);
      				if(organisationName==null)
      					{%>
      					<tr>
      					<td>Organization Key/Access Code:</td>
      					<td>
      					
      					<input type="text"  name="key" placeholder="Enter Key" required/></td>
      					
      				</tr>
      				<%}else{ %>
      				<tr>
      					<td>Organization Key/Access Code:</td>
      					<td>
      					<%
      					
      					List<DataInterface> lst=new AbstractDao().listByQuery("from AddOrganisationBean where organisationName="+"'"+organisationName+"'");
      					Iterator<DataInterface>itr=lst.iterator();
      					while(itr.hasNext())
      					{
      						AddOrganisationBean org=(AddOrganisationBean)itr.next();
      					
      					%>
      					<input type="text"  name="key" value="<%=org.getKey() %>" readonly required/></td>
      					<%}} %>
      				</tr>
      				<tr>
      					<td>Enter Location:</td>
      					<td><input type="text" placeholder="Enter Location" name="location" required/></td>
      				</tr>	
      				<tr>
      					<td>Enter Role:</td>
      					<td><input type="text" placeholder="Enter Role" name="role" required/></td>
      				</tr>	
      				<tr>
      					<td>Select Number of volunteers Required:</td>
      					<td>
      						<select name="NoOfVolunteer" style="margin-left:40px;width:340px;">
      							<option value="1">1</option>
      							<option value="2">2</option>
      							<option value="3">3</option>
      							<option value="4">4</option>
      							<option value="5">5</option>
      							<option value="6">6</option>
      							<option value="7">7</option>
      							<option value="8">8</option>
      							<option value="9">9</option>
      							<option value="10">10</option>
      							<option value="15">15</option>
      							<option value="20">20</option>
      							<option value="50">50</option>
      							<option value="100">100</option>
      							<option value="200">200</option>
      							<option value="500">500</option>
      							<option value="1000">1000</option>
      						</select>
      						</td>
      						<td></td>
      					</tr>
      					<tr>
      						<td>Select Skill required for this role:</td>
      						<td><textarea name="skill" placeholder="Enter text here.." style="margin-left:40px;width:320px;"></textarea></td>
      						<td></td>
      					</tr>
      					<tr>
        					<td><button type="submit" style="width:200px;">Submit</button></td>
        					<td><button type="reset" style="width:200px;">Cancel</button></td>
        				</tr>
      					
  				    </table>   
  				    
  				    <center><a href="login.jsp" class="btn buttonTwo">Login</a></center>       	
               	</form><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
               
                </div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>        <section id="footer">
           <h3>footer of the website </h3>
       </section>
       
   </body>
  </html>