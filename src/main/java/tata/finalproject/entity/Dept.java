package tata.finalproject.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Dept {
	@Id
	private int did;
	private String name;
	@OneToOne(mappedBy = "dept")
	private Manager manager;
	@OneToMany(mappedBy = "dept")
	private List<Employee> employee;
	@OneToOne(mappedBy = "dept")
	private Admin admin;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="company_id")
	@JsonBackReference("company-dept")
	private Company company;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Dept(int did, String name, Manager manager, List<Employee> employee, Admin admin, Company company) {
		super();
		this.did = did;
		this.name = name;
		this.manager = manager;
		this.employee = employee;
		this.admin = admin;
		this.company = company;
	}

	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public List<Employee> getEmploye() {
		return employee;
	}
	public void setEmploye(List<Employee> employee) {
		this.employee = employee;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", name=" + name + ", manager=" + manager + ", employee=" + employee + ", admin="
				+ admin + ", company=" + company + "]";
	}
	
	

}
