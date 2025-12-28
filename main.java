public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("Milk", 500, "Dairy", true);
        Product p2 = new Product("Bread", 200, "Bakery", false);

        Sale sale = new Sale(1, 0, 0, false);
        sale.addProduct(p1);
        sale.addProduct(p2);

        Customer customer = new Customer("Dias", 0, false, 1);
        customer.addPurchase(sale.getTotal());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(sale);
        System.out.println(customer);
    }
}

