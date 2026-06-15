package tata.finalproject.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String adhar;
	private String panno;
	private String mailid;
	private Date dob;
	private String experience;
	private String mobileNo;
	private Date doj;
	@OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	@ManyToOne
	@JoinColumn(name="manager_id")
	private Manager manager;
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Dept dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Employee(int id, String name, String adhar, String panno, String mailid, Date dob, String experience,
			String mobileNo, Date doj, Address address, Company company, Manager manager, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.adhar = adhar;
		this.panno = panno;
		this.mailid = mailid;
		this.dob = dob;
		this.experience = experience;
		this.mobileNo = mobileNo;
		this.doj = doj;
		this.address = address;
		this.company = company;
		this.manager = manager;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adhar=" + adhar + ", panno=" + panno + ", mailid=" + mailid
				+ ", dob=" + dob + ", experience=" + experience + ", mobileNo=" + mobileNo + ", doj=" + doj
				+ ", address=" + address + ", company=" + company + ", manager=" + manager + ", dept=" + dept + "]";
	}
	
	
	

}
