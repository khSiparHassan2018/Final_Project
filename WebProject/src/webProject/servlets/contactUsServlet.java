package webProject.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webProject.service.controller;

/**
 * Servlet implementation class contactUsServlet
 */
@WebServlet("/contactUsServlet")
public class contactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactUsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	System.out.println("in contactUsServlet");
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String email=request.getParameter("email");
	String dob=request.getParameter("dob");
	String gender=request.getParameter("gender");
	String intrest=request.getParameter("intrest");
	String comment=request.getParameter("comment");
	
	System.out.println("name"+name+" "+"address"+address+" "+"email"+email+" "+"dob"+dob+" "+"gender"+gender+" "+"intrest"+intrest+" "+"comment"+comment);
	
	controller co=new controller();
	String result=co.AddForm(name, address, email, dob, gender, intrest, comment);
	
	System.out.println("result"+result);
	if(result.equalsIgnoreCase("Added"))
	{
		PrintWriter out=response.getWriter();
		out.println("<script>");
		out.println("alert('Submitted')");
		out.println("window.location = 'contactus.jsp'");
		out.println("</script>");
		
	}
	else if(result.equalsIgnoreCase("Already Exist"))
	{
		PrintWriter out=response.getWriter();
		out.println("<script>");
		out.println("alert('Already Submitted...')");
		out.println("window.location = 'contactus.jsp'");
		out.println("</script>");
	

	}
	else
	{
		PrintWriter out=response.getWriter();
		out.println("<script>");
		out.println("alert('Error...')");
		out.println("window.location = 'contactus.jsp'");
		out.println("</script>");
		
	}
	
			
	}

}
