package tata.finalproject.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Distric {
	@Id
	private int did;
	private String name;

	public Distric() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Distric [did=" + did + ", name=" + name + "]";
	}
	

}
