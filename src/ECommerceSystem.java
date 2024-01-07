public class ECommerceSystem {
    public static void main(String[] args) {
        // Створення продуктів
        Product laptop = new Product(1, "Laptop", 1000.0);
        Product phone = new Product(2, "Phone", 500.0);

        // Створення кошика
        Cart cart = new Cart();
        cart.addProduct(laptop);
        cart.addProduct(phone);

        // Створення замовлення
        Order order = new Order(101, cart.getProducts(), "Processing");

        // Вивід статусу замовлення
        System.out.println("Order Status: " + order.getStatus());

        // Видалення продукту з кошика
        cart.removeProduct(laptop);

        // Перевірка, чи продукт був видалений з кошика
        System.out.println("Products in Cart: " + cart.getProducts().size());

        // Тестові випадки JUnit
        testAddProductToCart();
        testRemoveProductFromCart();
        testPlaceOrder();
        testGetOrderStatus();
    }

    public static void testAddProductToCart() {
        Cart cart = new Cart();
        Product laptop = new Product(1, "Laptop", 1000.0);

        cart.addProduct(laptop);

        assert cart.getProducts().size() == 1;
    }




    public static void testRemoveProductFromCart() {
        Cart cart = new Cart();
        Product laptop = new Product(1, "Laptop", 1000.0);

        cart.addProduct(laptop);
        cart.removeProduct(laptop);

        assert cart.getProducts().size() == 0;
    }


    public static void testPlaceOrder() {
        Cart cart = new Cart();
        Product laptop = new Product(1, "Laptop", 1000.0);
        cart.addProduct(laptop);

        Order order = new Order(101, cart.getProducts(), "Processing");

        assert order.getProducts().size() == 1;
    }
    public static void testGetOrderStatus() {
        Cart cart = new Cart();
        Product laptop = new Product(1, "Laptop", 1000.0);
        cart.addProduct(laptop);

        Order order = new Order(101, cart.getProducts(), "Processing");

        assert order.getStatus().equals("Processing");
    }
}
