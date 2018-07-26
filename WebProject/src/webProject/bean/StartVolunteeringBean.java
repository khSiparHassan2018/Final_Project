package webProject.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import webProject.daoImpl.DataInterface;

@Entity
@Table(name="VolunteersDetails")
public class StartVolunteeringBean implements DataInterface{
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="Fname")
	private String fname;
	
	@Column(name="Lname")
	private String lname;
	
	@Column(name="Adddress")
	private String adddress;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Country")
	private String country;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Role")
	private String role;
	
	public StartVolunteeringBean(){
		
	}

	public StartVolunteeringBean(String fname, String lname, String adddress, String city, String country, String email,
			String password, String role) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.adddress = adddress;
		this.city = city;
		this.country = country;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAdddress() {
		return adddress;
	}

	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}
