package tata.finalproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Product {
	@Id
	private int pid;
	private String name;
	private float price;
	@ManyToOne
	@JoinColumn(name="brand_id")
	private Brand brand;
	@ManyToOne
	@JoinColumn(name="sub_category_id")
	private SubCategory subCategory;
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	@OneToMany(mappedBy = "product")
	private List<ProductReview> productReviews;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public Product(int pid, String name, float price, Brand brand, SubCategory subCategory, Category category,
			List<ProductReview> productReviews) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.subCategory = subCategory;
		this.category = category;
		this.productReviews = productReviews;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Brand getBrands() {
		return brand;
	}
	public void setBrands(Brand brand) {
		this.brand = brand;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<ProductReview> getProductReviews() {
		return productReviews;
	}
	public void setProductReviews(List<ProductReview> productReviews) {
		this.productReviews = productReviews;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", brand=" + brand + ", subCategory="
				+ subCategory + ", category=" + category + ", productReviews=" + productReviews + "]";
	}
	
	

}
