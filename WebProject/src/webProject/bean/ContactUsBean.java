package webProject.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import webProject.daoImpl.DataInterface;

@Entity
@Table(name="ContactUs")
public class ContactUsBean implements DataInterface {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Intrest")
	private String intrest;
	
	@Column(name="Comment")
	private String comment;

	public ContactUsBean()
	{
		
	}
	public ContactUsBean(String name, String address, String email, String dob, String gender, String intrest,
			String comment) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.intrest = intrest;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIntrest() {
		return intrest;
	}

	public void setIntrest(String intrest) {
		this.intrest = intrest;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
