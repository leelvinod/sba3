package com.telecom.tel.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@NotNull(message="Id cannot be Null")
	private int Id;
	
	@NotNull(message="customer name cannot be Null")
	private String custName;
	
	@NotNull(message="Telecom Circle cannot be Null")
	private String DateOj;
	
	private String vas;
	private int contactno;
	
	@NotNull(message="Customer Type cannot be Null")
	private String City;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getDateOj() {
		return DateOj;
	}

	public void setDateOj(String dateOj) {
		DateOj = dateOj;
	}

	public String getVas() {
		return vas;
	}

	public void setVas(String vas) {
		this.vas = vas;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	
	
	
	
	
}
