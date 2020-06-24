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

    public Book(Collection<Wishlist> wishlists, Collection<Category> categories, int ID, String name, String publishYear, Integer quantity, Long purchasePrice, Author author, Publisher publisher) {
        this.wishlists = wishlists;
        this.categories = categories;
        this.ID = ID;
        this.name = name;
        this.publishYear = publishYear;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.author = author;
        this.publisher = publisher;
    }

}
