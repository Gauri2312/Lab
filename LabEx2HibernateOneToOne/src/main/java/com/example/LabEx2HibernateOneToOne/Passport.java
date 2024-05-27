//Q1)Create one to one relation between entityPerson and PassportDetails
package com.example.LabEx2HibernateOneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

    @Entity
    @Table(name = "PassportDetails")
    public class Passport {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int passwordId;
      private int passNo;
      @OneToOne
      @JoinColumn(name = "p_id")
      private Person person;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(int passwordId, int passNo, Person person) {
		super();
		this.passwordId = passwordId;
		this.passNo = passNo;
		this.person = person;
	}
	public int getPasswordId() {
		return passwordId;
	}
	public void setPasswordId(int passwordId) {
		this.passwordId = passwordId;
	}
	public int getPassNo() {
		return passNo;
	}
	public void setPassNo(int passNo) {
		this.passNo = passNo;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Passport [passwordId=" + passwordId + ", passNo=" + passNo + ", person=" + person + "]";
	}
      
      

}
