package tata.finalproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Upi {
	@Id
	private int uid;
	private float amount;
	@OneToOne
	private User user;
	public Upi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Upi(int uid, float amount, User user) {
		super();
		this.uid = uid;
		this.amount = amount;
		this.user = user;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Upi [uid=" + uid + ", amount=" + amount + ", user=" + user + "]";
	}
	
	
	
	


}
