package tata.finalproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Brand {
	@Id
	private int bid;
	private String name;
	@OneToMany(mappedBy = "brand")
	private List<Product> products;
	@ManyToOne
	private Category category;
	@ManyToOne
	private SubCategory subCategory;
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int bid, String name, List<Product> products, Category category,
			SubCategory subCategory) {
		super();
		this.bid = bid;
		this.name = name;
		this.products = products;
		this.category = category;
		this.subCategory = subCategory;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public SubCategory getSubCategories() {
		return subCategory;
	}
	public void setSubCategories(SubCategory subCategory) {
		this.subCategory = subCategory;
	}
	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", name=" + name + ", products=" + products + ", category=" + category
				+ ", subCategory=" + subCategory + "]";
	}
	
	

}
