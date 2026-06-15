package tata.finalproject.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
	@Id
	private int cid;
	private String name;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", name=" + name + "]";
	}
	

}
