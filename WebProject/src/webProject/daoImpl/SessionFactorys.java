package webProject.daoImpl;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionFactorys {
private static SessionFactory session=null;
public static SessionFactory getSessionFactory()
{
	   try{
		   session = new AnnotationConfiguration().
				   configure().
				   buildSessionFactory();
	   }catch (Throwable ex){
		   throw new ExceptionInInitializerError(ex);
	   }
	   return session;
}

 public static void main(String args[])
 {
	 if(SessionFactorys.getSessionFactory() != null)
		 System.out.println("success");
	 else
		 System.out.println("fail");
 }
 
}
