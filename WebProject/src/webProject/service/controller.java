package webProject.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import webProject.bean.AdvertiseRoleBean;
import webProject.bean.ContactUsBean;
import webProject.bean.Log;
import webProject.bean.StartVolunteeringBean;
import webProject.daoImpl.AbstractDao;
import webProject.daoImpl.DataInterface;

public class controller {
	
	AbstractDao abd;


	public String UpdatePassword(String email, String password){
		abd = new AbstractDao();
		StartVolunteeringBean vbean=(StartVolunteeringBean)abd.getById("email", email, StartVolunteeringBean.class);
		
		vbean.setEmail(email);
		vbean.setPassword(password);
		
		String result=abd.update(vbean);
		System.out.println("Update Password result :"+result);
		return result;
	}

	public int search(String email, String password) {
	       abd= new AbstractDao();
	       StartVolunteeringBean vbean = (StartVolunteeringBean) abd.getById("email", email, StartVolunteeringBean.class);
	       if(vbean!=null &&vbean.getPassword().equals(password)) return vbean.getId();
	       else
			return 0;
		}
	
	public String AddForm(String name,String address,String email,String dob,String gender,String intrest,String comment)
	{
		abd=new AbstractDao();
		ContactUsBean cbean=new ContactUsBean(name,address,email,dob,gender,intrest,comment);
		HashMap<String,String>map=new HashMap<>();
		map.put("email", email);
		
		String result=abd.addByCriteria(map, cbean, ContactUsBean.class);
		return result;
	}
	public void addLog(String attackType, String ipaddress){
 		abd = new AbstractDao();
 		Date date = new Date();
 		SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");
 		 String TimeStamp=ft.format(date);
 		Log log =new Log(attackType, ipaddress, TimeStamp);
 		abd.add(log);
 	}
	
	public boolean checkBan(String ipAddress) {
		abd = new AbstractDao();
		String hSql = "From Log where ipaddress="+"'"+ipAddress+"'";
	    List<DataInterface> list = abd.listByQuery(hSql);
	    Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
		 String Today=ft.format(date);
		
		System.out.println("List Size"+list.size());
	    for(Object o:list){
	    	Log l = (Log) o;
	     if(l.getDate().equals(Today)){
	    	 	System.out.println("Ban");return true;}
	    }
	    return false;
	}
	
	public void banIp(String ipAddress) {
 		
 		abd = new AbstractDao(); 	
   		 addLog("Brute Force",ipAddress);
 		 
 	}
	
	public StartVolunteeringBean getUser(int id) {
		abd = new AbstractDao();
		StartVolunteeringBean vbean = (StartVolunteeringBean) abd.getById("id", id, StartVolunteeringBean.class);
		
		return vbean;
		}
	
	public String AddRole(String organisationName,int key,String location ,String role,String noOfVolunteer,String skill ) {
		abd = new AbstractDao();
		
		AdvertiseRoleBean advertiseBean=new AdvertiseRoleBean( organisationName,  key,  location,role, noOfVolunteer,skill);
		
		HashMap<String,String> map=new HashMap<>();
		map.put("role", role);
		
		String result=abd.addByCriteria(map, advertiseBean, AdvertiseRoleBean.class);
		return result;
		}
	
	public String AddVolunteer(String fname,String lname,String adddress ,String city,String country,String email,String password,String mobile,String role ) {
		abd = new AbstractDao();
		
		StartVolunteeringBean vBean=new StartVolunteeringBean(fname,lname,adddress,city,country,email,password,role);		
		
		HashMap<String,String> map=new HashMap<>();
		map.put("email", email);
		
		String result=abd.addByCriteria(map, vBean, StartVolunteeringBean.class);
		return result;
		}
}
