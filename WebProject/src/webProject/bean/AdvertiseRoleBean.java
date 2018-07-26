package webProject.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import webProject.daoImpl.DataInterface;

@Entity
@Table(name="AdvertiseRole")
public class AdvertiseRoleBean implements DataInterface {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="OrgName")
	private String organisationName;
	
	@Column(name="AccessCode")
	private int key;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="Role")
	private String role;
	
	@Column(name="NoOfVolunteer")
	private String NoOfVolunteer;
	
	@Column(name="Skill")
	private String skill;
	
	public AdvertiseRoleBean()
	{
		
	}
	
	public AdvertiseRoleBean(String organisationName, int key, 
			String location,String role,
			String noOfVolunteer, String skill) {
		super();
		this.organisationName = organisationName;
		this.key = key;
		this.location=location;
		this.role = role;
		this.NoOfVolunteer = noOfVolunteer;
		this.skill = skill;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNoOfVolunteer() {
		return NoOfVolunteer;
	}

	public void setNoOfVolunteer(String noOfVolunteer) {
		NoOfVolunteer = noOfVolunteer;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
}
