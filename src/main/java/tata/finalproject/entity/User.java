package tata.finalproject.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String adhar;
	private String panno;
	private String mailid;
	private Date dob;
	private String mobileNo;
	@OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
	@OneToOne
	private Role role;
	
	public User() {
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User(int id, String name, String adhar, String panno, String mailid, Date dob, String mobileNo,
			Address address, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.adhar = adhar;
		this.panno = panno;
		this.mailid = mailid;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.address = address;
		this.role = role;
	}

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", adhar=" + adhar + ", panno=" + panno + ", mailid=" + mailid
				+ ", dob=" + dob + ", mobileNo=" + mobileNo + ", address=" + address + ", role=" + role + "]";
	}
	
	

}
