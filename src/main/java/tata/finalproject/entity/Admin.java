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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Admin {
	@Id
	private int id;
	private String name;
	private String adhar;
	private String panno;
	private String mailid;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private String mobileNo;
	@Temporal(TemporalType.DATE)
	private Date doj;
	private String experience;
	@OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Dept dept;
	@OneToOne
	private Role role;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int id, String name, String adhar, String panno, String mailid, Date dob, String mobileNo, Date doj,
			String experience, Address address, Company company, Dept dept, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.adhar = adhar;
		this.panno = panno;
		this.mailid = mailid;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.doj = doj;
		this.experience = experience;
		this.address = address;
		this.company = company;
		this.dept = dept;
		this.role = role;
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
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
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
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", adhar=" + adhar + ", panno=" + panno + ", mailid=" + mailid
				+ ", dob=" + dob + ", mobileNo=" + mobileNo + ", doj=" + doj + ", experience=" + experience
				+ ", address=" + address + ", company=" + company + ", dept=" + dept + ", role=" + role + "]";
	}
	

}
