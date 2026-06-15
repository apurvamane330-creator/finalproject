package tata.finalproject.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class CompanyResponse {
	@Id
	private int id;
	@ManyToMany(targetEntity = CustomerQuery.class)
	private Set<CustomerQuery> cQuery;
	private String msg;
	public CompanyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyResponse(int id, Set<CustomerQuery> cQuery, String msg) {
		super();
		this.id = id;
		this.cQuery = cQuery;
		this.msg = msg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<CustomerQuery> getcQuery() {
		return cQuery;
	}
	public void setcQuery(Set<CustomerQuery> cQuery) {
		this.cQuery = cQuery;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "CompanyResponse [id=" + id + ", cQuery=" + cQuery + ", msg=" + msg + "]";
	}
	
	


}
