package customer;

import itempackage.item.Item;
import product.book.Book;
import java.util.*;

public class Wishlist {

    Collection<Book> books;
    private int ID;
    private List<Item> items;

    public List<Item> getItems() {
        return this.items;
    }

    /**
     *
     * @param items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
