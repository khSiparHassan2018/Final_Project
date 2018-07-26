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
 * Servlet implementation class advertiseRoleServlet
 */
@WebServlet("/advertiseRoleServlet")
public class advertiseRoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public advertiseRoleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In  AdvertiseRole servlet");
		String  organisationName=request.getParameter("organisationName");
		String location=request.getParameter("location");
		int key=Integer.parseInt(request.getParameter("key"));
		String role=request.getParameter("role");
		String NoOfVolunteer=request.getParameter("NoOfVolunteer");
		String skill=request.getParameter("skill");
		
		System.out.println("organisationName"+organisationName+" "+"key"+key+" "+"role"+role+" "+"Location"+location+" "+"NoOfVolunteer"+NoOfVolunteer+" "+"skill"+skill);
		
		controller co=new controller();
		
		String result=co.AddRole(organisationName, key, location, role, NoOfVolunteer, skill);
		
		if(result.equalsIgnoreCase("Added"))
		{
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('Role Added')");
			out.println("window.location = 'login.jsp'");
			out.println("</script>");
			
		}
		else if(result.equalsIgnoreCase("Already Exist"))
		{
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('Account Already Exist...')");
			out.println("window.location = 'AdvertiseRole.jsp'");
			out.println("</script>");
		

		}
		else
		{
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('Error...')");
			out.println("window.location = 'AdvertiseRole.jsp'");
			out.println("</script>");
			
		}
	}

}
