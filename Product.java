public class Product {

    private String name;
    private int price;
    private String category;
    private boolean available;

    public Product(String name, int price, String category, boolean available) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.available = available;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public String getCategory() { return category; }
    public boolean isAvailable() { return available; }

    public void setName(String name) { this.name = name; }
    public void setPrice(int price) { this.price = price; }
    public void setCategory(String category) { this.category = category; }
    public void setAvailable(boolean available) { this.available = available; }

    public void applyDiscount(int percent) {
        price = price - (price * percent / 100);
    }

    public boolean isExpensive() {
        return price > 1000;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - " + price + " KZT, Available: " + available;
    }
}

