//Q2)WAP to create OneToMany relationship between Employee and Project table
package com.example.LabEx1Hibernate1ToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "project_table")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pId;
	private String pName;
	private int pmembers;
	@OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
	private List<Employee> employees=new ArrayList<Employee>();

public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
public Project(int pId, String pName, int pmembers, List<Employee> employees) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pmembers = pmembers;
		this.employees = employees;
	}
public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPmembers() {
		return pmembers;
	}
	public void setPmembers(int pmembers) {
		this.pmembers = pmembers;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", pmembers=" + pmembers + ", employees=" + employees
				+ "]";
	}
}