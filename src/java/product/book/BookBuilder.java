package product.book;

import customer.Wishlist;
import product.*;
import java.util.*;
import product.computer.*;

public class BookBuilder extends ProductBuilder {

    Collection<Wishlist> wishlists;
    Collection<Category> categories;
    private int ID;
    private String name;
    private String publishYear;
    private Integer quantity;
    private Long purchasePrice;
    private Author author;
    private Publisher publisher;

    public BookBuilder buildId(int ID) {
        this.ID = ID;
        return this;
    }

    public BookBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder buildPubYear(String publishYear) {
        this.publishYear = publishYear;
        return this;
    }

    public BookBuilder buildQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public BookBuilder buildPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }

    public BookBuilder buildCategory(Author author) {
       this.author = author;
        return this;
    }

    public BookBuilder buildAuthor(Author author) {
       this.author = author;
        return this;
    }

    public BookBuilder buildPublisher(Publisher publisher) {
        this.publisher = publisher;
        return this;
    }

    @Override
    public Product build() {
        return new Book(wishlists, categories, ID, name, publishYear, quantity, purchasePrice, author, publisher);
    }

}
