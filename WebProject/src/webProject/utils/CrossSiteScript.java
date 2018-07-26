package webProject.utils;



import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;

/**
 * This class is use for Cross Site Scripting Attack.
 * @author Swapnil
 *
 */

@SuppressWarnings("unchecked")
public class CrossSiteScript {
 	@SuppressWarnings("rawtypes")
	public static final HashMap m = new HashMap();
	static {
		m.put(34, "&quot;"); // < - less-than
		m.put(60, "&lt;");   // < - less-than
		m.put(62, "&gt;");   // > - greater-than
							//User needs to map all html entities with their corresponding decimal values. 							
           }

	public static boolean escapeHtml(String str) {
		try {
			StringWriter writer = new StringWriter((int)(str.length() * 1.5));
			escape(writer, str);
			System.out.println("encoded string is " + writer.toString());
			System.out.println("Before encoded string is " + str);
			return !writer.toString().equals(str);
		   } catch (IOException ioe) {
			ioe.printStackTrace();
			return false;
		        }
	     }

	public static void escape(Writer writer, String str) throws IOException {
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			int ascii = (int) c;
			String entityName = (String) m.get(ascii);
			if (entityName == null) {
				if (c > 0x7F) {
					writer.write("&#");
					writer.write(Integer.toString(c, 10));
					writer.write(';');
				} else {
					writer.write(c);
				}
			} else {
                     writer.write(entityName);
			}
		}
	}

	public static void main(String args[])
	{
 		boolean a =CrossSiteScript.escapeHtml("shital");	
	  System.out.println("result: "+a);	
	}
	}