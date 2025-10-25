package behavioral.strategy;

/**
 * Represents a single item in the shopping cart.
 * Each item has a unique product code (UPC) and a price.
 */
public class Item {
    private String upcCode;
    private int price;

    /**
     * Constructs a new Item object.
     *
     * @param price   Price of the item
     * @param upcCode Unique product code
     */
    public Item(int price, String upcCode) {
        this.price = price;
        this.upcCode = upcCode;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

