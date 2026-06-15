package tata.finalproject.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Company {
	@Id
	private Integer regNo;
	private String name;
	@OneToOne
    @JoinColumn(name = "flatno")
    private Address address;
	@OneToOne(mappedBy = "company")
	@JsonManagedReference("company-owner")
	private Owner owner;
	@OneToMany(mappedBy = "company")
	private List<Manager> managers;
	@OneToMany(mappedBy = "company")
	private List<Admin> admins;
	@OneToMany(mappedBy = "company")
	private List<Employee> employees;
    @OneToMany(mappedBy = "company")
    @JsonManagedReference("company-dept")
	private List<Dept> depts;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="company_id")
    private List<Type> types;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getRegNo() {
		return regNo;
	}
	public void setRegNo(Integer regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	public List<Admin> getAdmins() {
		return admins;
	}
	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	@Override
	public String toString() {
		return "Company [regNo=" + regNo + ", name=" + name + ", address=" + address + ", owner=" + owner
				+ ", managers=" + managers + ", admins=" + admins + ", employees=" + employees + ", depts=" + depts
				+ ", types=" + types + "]";
	}

	
}
