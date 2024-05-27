//Q1)Create one to one relation between entityPerson and PassportDetails
package com.example.LabEx2HibernateOneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
   @Entity
   @Table(name = "personDetails")
   public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="p_id")
    private int pid;
    private String pName;
    private String pcity;
    
    @OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
    private Passport passport;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String pName, String pcity, Passport passport) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pcity = pcity;
		this.passport = passport;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getPcity() {
		return pcity;
	}

	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pName=" + pName + ", pcity=" + pcity + ", passport=" + passport + "]";
	}
    
    
}
