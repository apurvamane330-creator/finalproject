package tata.finalproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductReview {
	@Id
	private int pid;
	private String review;
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	public ProductReview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductReview(int pid, String review, Product product) {
		super();
		this.pid = pid;
		this.review = review;
		this.product = product;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "ProductReview [pid=" + pid + ", review=" + review + ", product=" + product + "]";
	}
	
	

}
