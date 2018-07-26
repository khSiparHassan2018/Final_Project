package webProject.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import webProject.daoImpl.DataInterface;

@Entity
@Table(name="OrganisationAndKey")
public class AddOrganisationBean implements DataInterface{
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="OrgName")
	private String organisationName;
	
	@Column(name="AccessKey")
	private int key;

	
	public AddOrganisationBean()
	{
		
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
	
	

}
