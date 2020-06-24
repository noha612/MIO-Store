package product.book;

import customer.Wishlist;
import product.*;
import java.util.*;

public class Book extends Product {

	Collection<Wishlist> wishlists;
	Collection<Category> categories;
	private int ID;
	private String name;
	private String publishYear;
	private Integer quantity;
	private Long purchasePrice;
	private Author author;
	private Publisher publisher;

}