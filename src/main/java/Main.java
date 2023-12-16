import shoppingCart.Product;
import shoppingCart.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Product prod = new Product(1, "cards", "card game to play with family and friends", 10.00);
        Product prod2 = new Product(2, "shoes", "fancy model to wear casual", 20.00);
        Product prod3 = new Product(3, "dress", "dress to wear on special occasions", 5.00);

        ShoppingCart.addProduct(prod);
        ShoppingCart.addProduct(prod2);
        ShoppingCart.addProduct(prod3);
        System.out.println(ShoppingCart.cart);

        ShoppingCart.viewCart();

        //ShoppingCart.removeProduct(prod);
        System.out.println("Product removed " + ShoppingCart.cart);

        System.out.println(ShoppingCart.totalPrice());
    }
}