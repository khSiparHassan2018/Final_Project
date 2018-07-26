package webProject.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import webProject.bean.StartVolunteeringBean;
import webProject.service.controller;
import webProject.utils.CrossSiteScript;
import webProject.utils.SQLinjection;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in login servlet");
		
		controller co = new controller();
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null) {
			
			   ipAddress = request.getRemoteAddr();
		}
		  boolean ban = co.checkBan(ipAddress);
		  
		  if(ban){
			  
		 		request.getSession().setAttribute("msg", "Your Ip is Banned for today");
		 		response.sendRedirect("login.jsp");
		 		
		  } else{
			  
		 String email = request.getParameter("email");
		 String password = request.getParameter("password");
		 	boolean em = CrossSiteScript.escapeHtml(email);
		 	boolean pa = CrossSiteScript.escapeHtml(password);
		 	boolean em1 = SQLinjection.check(email);
		 	boolean pa1 = SQLinjection.check(password);
		 	
		 	if(em1 || pa1){
		 		
		 		co.addLog("SQLInjection", ipAddress);	
				request.getSession().setAttribute("msg", "Login Failed :SQL injection Detected");
				response.sendRedirect("login.jsp");
		 		return ;
		 		
		 	}else
		 	if(em || pa){
		 		
		 		request.getSession().setAttribute("msg", "Illegal Attempt");
		 		response.sendRedirect("login.jsp");
		 		co.addLog("crosssitescript", ipAddress);	
				request.getSession().setAttribute("msg", "Login Failed :Cross site attack Detected");
		 		return ;
		 		
		 	}else {

			int result = co.search(email, password);
			System.out.println("RESULT"+result);
			System.out.println(ipAddress);
			  if (result == 0) {
				  
				  if(request.getSession().getAttribute("attempt")!=null){
					  
				    int attempt = Integer.parseInt(request.getSession().getAttribute("attempt").toString());
				    if(attempt<10) {
				    	
				  request.getSession().setAttribute("attempt", attempt+1);
				  
				    }
				    else {
				    	
				    	co.banIp(ipAddress);
				    	request.getSession().setAttribute("msg","You are banned");
				    }
				  }
				  else
				  {
					  request.getSession().setAttribute("attempt", 1);
			
				  }
				  
			   request.getSession().setAttribute("msg", "Wrong username or Password");
				System.out.println("result<0");
				response.sendRedirect("login.jsp");
			} else if (result > 0) {
				StartVolunteeringBean vBean = co.getUser(result);
				request.getSession().setAttribute("user", vBean);
				request.getSession().setAttribute("uid", vBean.getId());
				System.out.println("result>0 id: " + result);
				response.sendRedirect("home.jsp");
				
			}
		}
	}
		
	}

}
