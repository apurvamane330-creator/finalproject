package tata.finalproject.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Invoice {
	@Id
  	private int iid;
	@ManyToMany
	@JoinTable(
	    name="invoice_product",
	    joinColumns=@JoinColumn(name="invoice_id"),
	    inverseJoinColumns=@JoinColumn(name="product_id")
	)
	private List<Product> products;
	@ManyToOne
	private PaymentMode paymentmode;
	@ManyToMany(targetEntity=ShippingDetails.class)
	private Set<ShippingDetails> shippingDetails;
	@OneToOne
	@JoinColumn(name="tracking_id")
	private Tracking tracking;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int iid, List<Product> products, PaymentMode paymentmode, Set<ShippingDetails> shippingDetails, Tracking tracking) {
		super();
		this.iid = iid;
		this.products = products;
		this.paymentmode = paymentmode;
		this.shippingDetails = shippingDetails;
		this.tracking = tracking;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public PaymentMode getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(PaymentMode paymentmode) {
		this.paymentmode = paymentmode;
	}
	public Set<ShippingDetails> getShippingDetails() {
		return shippingDetails;
	}
	public void setShippingDetails(Set<ShippingDetails> shippingDetails) {
		this.shippingDetails = shippingDetails;
	}
	public Tracking getTracking() {
		return tracking;
	}
	public void setTracking(Tracking tracking) {
		this.tracking = tracking;
	}
	@Override
	public String toString() {
		return "Invoice [iid=" + iid + ", products=" + products + ", paymentmode=" + paymentmode + ", shippingDetails="
				+ shippingDetails + ", tracking=" + tracking + "]";
	}
	
	

}
