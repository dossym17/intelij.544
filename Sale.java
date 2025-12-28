public class Sale {

    private int saleId;
    private int total;
    private int productCount;
    private boolean completed;

    public Sale(int saleId, int total, int productCount, boolean completed) {
        this.saleId = saleId;
        this.total = total;
        this.productCount = productCount;
        this.completed = completed;
    }

    public int getSaleId() { return saleId; }
    public int getTotal() { return total; }
    public int getProductCount() { return productCount; }
    public boolean isCompleted() { return completed; }

    public void setSaleId(int saleId) { this.saleId = saleId; }
    public void setTotal(int total) { this.total = total; }
    public void setProductCount(int productCount) { this.productCount = productCount; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    public void addProduct(Product product) {
        total += product.getPrice();
        productCount++;
    }

    public double calculateAveragePrice() {
        if (productCount == 0) return 0;
        return (double) total / productCount;
    }

    public void completeSale() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Sale #" + saleId + ": " + total + " KZT, Products: " + productCount + ", Completed: " + completed;
    }
}
