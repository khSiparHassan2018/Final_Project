package webProject.bean;



import javax.persistence.*;

import webProject.daoImpl.DataInterface;




@Entity
@Table(name="Log")
public class Log implements DataInterface{
 
	@Id
	@GeneratedValue
	private int logid;
	private String attackType;
	private String ipaddress;
	private String timestamp;
	private String date;
	
    public Log(){}

	public Log( String attackType, String ipaddress, String timestamp) {
		super();
		this.date = timestamp.substring(0,timestamp.indexOf(" "));
		this.attackType = attackType;
		this.ipaddress = ipaddress;
		this.timestamp = timestamp;
	}

	public int getLogid() {
		return logid;
	}

	public void setLogid(int logid) {
		this.logid = logid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAttackType() {
		return attackType;
	}

	public void setAttackType(String attackType) {
		this.attackType = attackType;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
    
    
}
