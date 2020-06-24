package shipping;

import java.util.*;

public class Shipping {

	private int ID;
	private String region;
	private String cost;
	private Integer delayDate;

	public String getRegion() {
		return this.region;
	}

	/**
	 * 
	 * @param region
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	public String getCost() {
		return this.cost;
	}

	/**
	 * 
	 * @param cost
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

	public Integer getDelayDate() {
		return this.delayDate;
	}

	/**
	 * 
	 * @param delayDate
	 */
	public void setDelayDate(Integer delayDate) {
		this.delayDate = delayDate;
	}

	public Shipping() {
		// TODO - implement Shipping.Shipping
		throw new UnsupportedOperationException();
	}

	public void setShipType() {
		// TODO - implement Shipping.setShipType
		throw new UnsupportedOperationException();
	}

}