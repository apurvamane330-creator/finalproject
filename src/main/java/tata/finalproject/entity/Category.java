package tata.finalproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	private int cid;
	private String name;
	@OneToMany(mappedBy = "category")
	private List<SubCategory> subCategories;
	@OneToMany(mappedBy = "category")
	private List<Product> products;
	@OneToMany(mappedBy = "category")
	private List<Brand> brands;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
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
	public List<SubCategory> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
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
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", name=" + name + ", subCategories=" + subCategories + ", products=" + products
				+ ", brands=" + brands + "]";
	}

	
}
