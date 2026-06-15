package tata.finalproject.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Address {
	@Id
	private Integer flatno;
	private String area;
	private int pincode;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "town_id")
	private Town town;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "taluka_id")
	private Taluka taluka;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "district_id")
	private Distric distric;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "state_id")
	private State state;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "country_id")
	private Country country;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getFlatno() {
		return flatno;
	}
	public void setFlatno(Integer flatno) {
		this.flatno = flatno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Town getTown() {
		return town;
	}
	public void setTown(Town town) {
		this.town = town;
	}
	public Taluka getTaluka() {
		return taluka;
	}
	public void setTaluka(Taluka taluka) {
		this.taluka = taluka;
	}
	public Distric getDistric() {
		return distric;
	}
	public void setDistric(Distric distric) {
		this.distric = distric;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", area=" + area + ", town=" + town + ", taluka=" + taluka + ", distric="
				+ distric + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}



}
