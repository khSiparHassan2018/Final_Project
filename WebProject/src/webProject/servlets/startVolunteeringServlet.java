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
 * Servlet implementation class startVolunteeringServlet
 */
@WebServlet("/startVolunteeringServlet")
public class startVolunteeringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public startVolunteeringServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("in startVolunteeringServlet");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String adddress=request.getParameter("adddress");
		String city=request.getParameter("city");
		String country=request.getParameter("country");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mobile=request.getParameter("mobile");
		String role=request.getParameter("role");
		
		System.out.println("fname"+fname+" "+"lname"+lname+" "+"adddress"+adddress+" "+"city"+city+" "+"country"+country+" "+"email"+email+" "+"password"+password+" "+"mobile"+mobile+" "+"role"+role);
		
		controller co=new controller();
		String result=co.AddVolunteer(fname, lname, adddress, city, country, email, password, mobile, role);
		
		System.out.println("result"+result);
		
		if(result.equalsIgnoreCase("Added"))
		{
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('Account Created')");
			out.println("window.location = 'login.jsp'");
			out.println("</script>");
			
		}
		else if(result.equalsIgnoreCase("Already Exist"))
		{
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('Account Already Exist...')");
			out.println("window.location = 'startVolunteering.jsp'");
			out.println("</script>");
		

		}
		else
		{
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('Error...')");
			out.println("window.location = 'startVolunteering.jsp'");
			out.println("</script>");
			
		}

		
		
	}

}
