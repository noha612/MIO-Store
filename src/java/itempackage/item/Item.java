package itempackage.item;

import java.util.*;
import cart.Cart;
import itempackage.rating.*;
import itempackage.comment.*;

public class Item {

	Cart cart;
	Collection<Promotion> promotions;
	private int ID;
	private String name;
	private Long salePrice;
	private String description;
	private String date;
	private List<Rate> rate;
	private List<Comment> comment;

	public Item() {
		// TODO - implement Item.Item
		throw new UnsupportedOperationException();
	}

	public int getID() {
		// TODO - implement Item.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement Item.setID
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}

	/**
	 * 
	 * @param salePrice
	 */
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	public List<Rate> getRate() {
		return this.rate;
	}

	/**
	 * 
	 * @param rate
	 */
	public void setRate(List<Rate> rate) {
		this.rate = rate;
	}

	public List<Comment> getComment() {
		return this.comment;
	}

	/**
	 * 
	 * @param comment
	 */
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

}