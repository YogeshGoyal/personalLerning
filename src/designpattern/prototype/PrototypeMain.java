/*
 * Adpater design pattern do copy of clone instead of creation of new object 
 * Which some time can save time like initilising object from database evertime 
 * can be costly
 */
package designpattern.prototype;

/**
 *
 * @author yokukuma
 */
public class PrototypeMain {
    public static void main(String[] args) {
        
        // in first BookShop object we are loading books may be from data base
        BookShop bs = new BookShop();
        bs.setShopName("Yogesh book store");
        bs.loadData();
        System.err.println(bs);
        
        // for second obect there is no need to load books from database to save time
        // with help of shallow and deep cloning we can acchive this
        BookShop bs2 = bs.clone();
        bs2.setShopName("Kumar book store");
        System.err.println(bs2);
    }
}
