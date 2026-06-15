package tata.finalproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class SubCategory {
	@Id
	private int sid;
	private String name;
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	@OneToMany(mappedBy = "subCategory")
	private List<Product> products;
	@OneToMany(mappedBy = "subCategory")
	private List<Brand> brands;
	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SubCategory(int sid, String name, Category category, List<Product> products, List<Brand> brands) {
		super();
		this.sid = sid;
		this.name = name;
		this.category = category;
		this.products = products;
		this.brands = brands;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public List<Brand> getBrands() {
		return brands;
	}
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "SubCategory [sid=" + sid + ", name=" + name + ", category=" + category + ", products=" + products
				+ ", brands=" + brands + "]";
	}

	
}
