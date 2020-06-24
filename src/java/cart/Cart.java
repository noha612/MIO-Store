package cart;

import customer.Customer;
import itempackage.item.Item;
import java.util.*;

public class Cart {

	Collection<Item> itemss;
	private int ID;
	private Map<Item, Integer> items;
	private Customer customer;
	private CartDAO cartDAO;

	public List<Item> getItems() {
		// TODO - implement Cart.getItems
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param items
	 */
	public void setItems(List<Item> items) {
		// TODO - implement Cart.setItems
		throw new UnsupportedOperationException();
	}

	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void deleteAlltem() {
		// TODO - implement Cart.deleteAlltem
		throw new UnsupportedOperationException();
	}

	public void deleteItemById() {
		// TODO - implement Cart.deleteItemById
		throw new UnsupportedOperationException();
	}

	public void insertItem() {
		// TODO - implement Cart.insertItem
		throw new UnsupportedOperationException();
	}

	public CartDAO getCartDAO() {
		return this.cartDAO;
	}

	/**
	 * 
	 * @param cartDAO
	 */
	public void setCartDAO(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}

}