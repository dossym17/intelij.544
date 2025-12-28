public class Customer {

    private String name;
    private int totalSpent;
    private boolean vip;
    private int customerId;

    public Customer(String name, int totalSpent, boolean vip, int customerId) {
        this.name = name;
        this.totalSpent = totalSpent;
        this.vip = vip;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public int getTotalSpent() {
        return totalSpent;
    }

    public boolean isVip() {
        return vip;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalSpent(int totalSpent) {
        this.totalSpent = totalSpent;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void addPurchase(int amount) {
        totalSpent += amount;
        updateVipStatus();
    }

    public void updateVipStatus() {
        vip = totalSpent >= 1000;
    }

    @Override
    public String toString() {
        return "Customer #" + customerId + ": " + name +
                ", Spent: " + totalSpent + " KZT, VIP: " + vip;
    }
}
