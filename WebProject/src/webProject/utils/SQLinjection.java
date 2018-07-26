package webProject.utils;


public class SQLinjection {

	public static boolean check(String input) {
 
		 if(input.contains("&") || input.contains("||")){
			 return true;
		 }
		 else if(input.contains("where") || input.contains("update"))
			 return true;
 	     	return false;
	}
	
  public static void main(String args[]){
	  System.out.println(check("asd abc"));
  }
	
}
