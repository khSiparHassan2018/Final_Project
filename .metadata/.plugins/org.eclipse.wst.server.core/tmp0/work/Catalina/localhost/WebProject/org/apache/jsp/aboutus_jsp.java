/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-07-22 18:23:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import webProject.bean.*;
import webProject.daoImpl.*;
import webProject.service.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("webProject.service");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("webProject.bean");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("webProject.daoImpl");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Final project-->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    \n");
      out.write("    <title>Homeless Final Project</title>\n");
      out.write("    \n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("\t\t<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("        <!--[if lte IE 9]> \n");
      out.write("\t    <script src=\"http://css3-mediaqueries-\tjs.googlecode.com/svn/trunk/css3-\tmediaqueries.js\"></script> \n");
      out.write("        <![endif]-->\n");
      out.write("         \n");
      out.write("    <link rel =\"stylesheet\" href=\"CSS/homeless.css\" type=\"text/css\">\n");
      out.write("    <link rel =\"stylesheet\" href=\"CSS/servicesStyle.css\" type=\"text/css\">\n");
      out.write("    <meta name=\"keywords\" content=\"homeless, welfare, charity, volunteer, homelessness\">\n");
      out.write("     <script>\n");
      out.write("   \n");
      out.write("    function preventBack(){window.history.forward();}\n");
      out.write("   \tsetTimeout(\"preventBack()\", 0);\n");
      out.write("    window.onunload=function(){null};\n");
      out.write(" \n");
      out.write("    function access(){ \n");
      out.write("        \t");
 
        		
        	
              if(request.getSession().getAttribute("msg")!=null){
      
            String str=request.getSession().getAttribute("msg").toString();
      out.write("           \n");
      out.write("            alert('notice'+\" : \"+\"");
      out.print(str);
      out.write("\");\n");
      out.write("            ");
  
             request.getSession().setAttribute("msg", null); }else {
      out.write("\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            } \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("   <body onload=\"access()\" background=\"images/Homeless.jpg\" >\n");
      out.write("   ");
  try{
	   StartVolunteeringBean user = (StartVolunteeringBean)request.getSession().getAttribute("user");
        AbstractDao abd=new AbstractDao();
        String name=user.getFname();
       System.out.println("user"+user);
       if(user!=null)
       {
       
       
      out.write("\n");
      out.write("   <header>\n");
      out.write("        <nav>\n");
      out.write("            <a href=\"home.jsp\">Home</a>\n");
      out.write("\t\t\t<a href=\"aboutus.jsp\">About Us</a>\n");
      out.write("            <a href=\"volunteers.jsp\">Volunteers</a>\n");
      out.write("            <a href=\"organisations.jsp\">Organisations</a>\n");
      out.write("            <a href=\"resources.jsp\">Resources</a>\n");
      out.write("            <a href=\"contactus.jsp\">Contact us</a>\n");
      out.write("            <a href=\"logoutServlet\">LogOut</a>\n");
      out.write("        </nav>   \n");
      out.write("       </header>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <br/><br/>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("            <div class=\"box\" style=\"background:#808080;margin:25px;padding:20px;\"> \n");
      out.write("                \n");
      out.write("               <center> <h1>ABOUT US</h1></center><br/>\n");
      out.write("                \n");
      out.write("                <h2>We would like to encourage YOU to help the homeless in Dublin</h2>\n");
      out.write("                \n");
      out.write("                <h3>Why?</h3>\n");
      out.write("                \n");
      out.write("                <p>Most of the families becoming homeless have never experienced homelessness before and never thought this could happen to them. Thousands more families are struggling on very low incomes or social welfare and many are falling into serious housing difficulties as rents continue to rise.</p><br>\n");
      out.write("                \n");
      out.write("                <h3>WHO?</h3>\n");
      out.write("                \n");
      out.write("                <p>Vulnerable young people are among the first victims of the housing crisis, with private landlords, social housing bodies and local authorities reluctant to rent to them.</p><br>\n");
      out.write("                \n");
      out.write("                <h3>How can you help?</h3>\n");
      out.write("                \n");
      out.write("                <p>Get registered with us! Give us an idea of when you may be available to help. What days of the week? Weekdays / Weekends? Evenings / Day / Nighttime. Homeless People need to know we care. It is our responsibility as a community to step up and DEMAND they are treated with respect. Lets come together and help the people of our lovely city</p><br>\n");
      out.write("                \n");
      out.write("                <h3>Community:</h3>\n");
      out.write("                \n");
      out.write("                <p>We have a number of charity partners who we work with. St Vincent de Paul, The Simon Community, Focus Ireland, Inner City Helping Homelessness. They are doing some great work. We really need to come together as a cummunity and do more. What can you do to help?</p><br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!--video-->\n");
      out.write("                <iframe id = \"aboutUsVideo\" src=\"https://www.youtube.com/watch?v=OJYZbciMwls\" allowfullscreen></iframe>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("\t\t<br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("\t\t\t\t ");

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

      out.write("\n");
      out.write("\t\t<section id=\"footer\">\n");
      out.write("           <h3>footer of the website </h3>\n");
      out.write("       </section>\n");
      out.write("            </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
