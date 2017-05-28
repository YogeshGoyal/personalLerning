/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class BookShop {
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){
        for(int i =0; i<10;i++){
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book " + i);
            getBooks().add(b);
        }
    }
    
    @Override
    public String toString() {
        return "BookShop{" + "shopName=" + shopName + ", books=" + books + '}';
    }
    
    public BookShop clone(){
        BookShop bs = new BookShop();
        for(Book s: this.getBooks()){
            bs.getBooks().add(s);
        }
        return bs;
    }
    
}
