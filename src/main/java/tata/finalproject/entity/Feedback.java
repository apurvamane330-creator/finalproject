package tata.finalproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Feedback {
	@Id
	private int id;
	@OneToMany(targetEntity = CustomerQuery.class)
	private List<CustomerQuery> cquery;
	@OneToMany(targetEntity = CompanyResponse.class)
	private List<CompanyResponse> cResponse;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(int id, List<CustomerQuery> cquery, List<CompanyResponse> cResponse) {
		super();
		this.id = id;
		this.cquery = cquery;
		this.cResponse = cResponse;
	}
	@Override
	public String toString() {
		return "FeedBack [id=" + id + ", cquery=" + cquery + ", cResponse=" + cResponse + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<CustomerQuery> getCquery() {
		return cquery;
	}
	public void setCquery(List<CustomerQuery> cquery) {
		this.cquery = cquery;
	}
	public List<CompanyResponse> getcResponse() {
		return cResponse;
	}
	public void setcResponse(List<CompanyResponse> cResponse) {
		this.cResponse = cResponse;
	}
	
	
	
	


}
