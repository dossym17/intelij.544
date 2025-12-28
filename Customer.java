public class Customer {

    private int customerId;
    private String name;
    private int totalSpent;
    private boolean vip;

    public Customer(int customerId, String name, int totalSpent, boolean vip) {
        this.customerId = customerId;
        this.name = name;
        this.totalSpent = totalSpent;
        this.vip = vip;
    }

    public int getCustomerId() { return customerId; }
    public String getName() { return name; }
    public int getTotalSpent() { return totalSpent; }
    public boolean isVip() { return vip; }

    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public void setName(String name) { this.name = name; }
    public void setTotalSpent(int totalSpent) { this.totalSpent = totalSpent; }
    public void setVip(boolean vip) { this.vip = vip; }

    public void addPurchase(int amount) {
        totalSpent += amount;
    }

    public void updateVipStatus() {
        vip = totalSpent >= 1000;
    }

    public void resetPurchases() {
        totalSpent = 0;
        vip = false;
    }

    @Override
    public String toString() {
        return "Customer #" + customerId + ": " + name + ", Spent: " + totalSpent + " KZT, VIP: " + vip;
    }
}


