package tata.finalproject.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Orders {
	@Id
	private int oId;
	private String name;
	@ManyToMany
	@JoinTable(
	name="order_product",
	joinColumns=@JoinColumn(name="order_id"),
	inverseJoinColumns=@JoinColumn(name="product_id")
	)
	private List<Product> products;
	@OneToOne
	@JoinColumn(name="payment_mode_id")
	private PaymentMode paymentmode;
	@ManyToOne
	@JoinColumn(name="shipping_id")
	private ShippingDetails shippingDetails;
	@OneToOne
	@JoinColumn(name="invoice_id")
	private Invoice invoice;
	@OneToOne
	@JoinColumn(name="tracking_id")
	private Tracking tracking;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int oId, String name, List<Product> products, PaymentMode paymentmode, ShippingDetails shippingDetails,
			Invoice invoice, Tracking tracking) {
		super();
		this.oId = oId;
		this.name = name;
		this.products = products;
		this.paymentmode = paymentmode;
		this.shippingDetails = shippingDetails;
		this.invoice = invoice;
		this.tracking = tracking;
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
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
	public PaymentMode getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(PaymentMode paymentmode) {
		this.paymentmode = paymentmode;
	}
	public ShippingDetails getShippingDetails() {
		return shippingDetails;
	}
	public void setShippingDetails(ShippingDetails shippingDetails) {
		this.shippingDetails = shippingDetails;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Tracking getTracking() {
		return tracking;
	}
	public void setTracking(Tracking tracking) {
		this.tracking = tracking;
	}
	@Override
	public String toString() {
		return "Orders [oId=" + oId + ", name=" + name + ", products=" + products + ", paymentmode=" + paymentmode
				+ ", shippingDetails=" + shippingDetails + ", invoice=" + invoice + ", tracking=" + tracking + "]";
	}
	


}
