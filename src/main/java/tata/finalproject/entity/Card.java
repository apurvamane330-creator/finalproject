package tata.finalproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Card {
	@Id
	private int cid;
	private float amount;
	@OneToOne
	private User user;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(int cid, float amount, User user) {
		super();
		this.cid = cid;
		this.amount = amount;
		this.user = user;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
		return "Card [cid=" + cid + ", amount=" + amount + ", user=" + user + "]";
	}
	


}
