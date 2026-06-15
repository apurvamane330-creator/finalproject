package tata.finalproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Taluka {
	@Id
	private int tid;
	private String name;

	public Taluka() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Taluka [tid=" + tid + ", name=" + name + "]";
	}
	
	
	

}
