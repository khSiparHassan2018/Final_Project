
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
    </script>
 </head>
<body onload="access()">
    
       <header class="mainpic">
          
           <div class = "welcome">
               <h1>Homeless Dublin <br>Do you want to volunteer?</h1>
               <div class="btns" style="float:left;">
              
               <a href="login.jsp" class="btn buttonTwo">Login</a>
               </div>
              
               <div class="box"> 
               	<form action="loginServlet" method="post">
               	
      				<h1>Login</h1>
      				<input type="email" placeholder="Enter Email" name="email" required/>
      				<input type="password" placeholder="Enter Password" name="password" required/>
     				 <button type="submit">Login</button>
     				
     				<p style="font-size:20px;"><a href="forgotPassword.jsp">Forgot Password</a></p>
  				               	
               	</form>
               
               </div>
           </div>     
       </header>
       
       <section class="features">
           <h3 class="text-center">Do you want to help with the homelessness crisis in Dublin? Do you know where you're going to sleep tonight?</h3>
           <p class="copy">
           		A place dedicated to homelessness in Dublin. We know that there are Dubliners who want to help with the homeless Crisis. This is how you can help. Volunteer your time. We can all play a part. We can all help to support those who are on the margins of society. We know that you understand and want to help. Here's where you can offer real support!!
           </p>
           
       </section>

<section class="boxes">
<div>
		<div class="box-left">
<h2 class="volunteer">I want to volunteer</h2>
<ul>
<li>
<a href="startVolunteering.jsp">Start Volunteering</a></li>
<li><a href="">Find your local centre</a></li>
<li><a href="">Learn about volunteering</a></li>
</ul>
</div>
		<div class="box-right">
<h2 class="organisation">I want to recruit volunteers</h2>
<ul>
<li><a href="AdvertiseRole.jsp">Advertise a role</a></li>
<li><a href="">Find your local centre</a></li>
<li><a href="">Employee volunteering</a></li>
</ul>
</div>
</div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
       </section><br/><br/><br/>      
        <section id="footer">
           <h3>footer of the website </h3>
       </section>
       
   </body>
  </html>