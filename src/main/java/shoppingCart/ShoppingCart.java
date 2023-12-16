package shoppingCart;

import java.util.ArrayList;
import java.util.List;

//Class for handle shopping cart
public class ShoppingCart {
  //view cart, add product, remove product, total price
    //HashMap productsGroup = new HashMap();
  public static List<Product> cart = new ArrayList<>();
    public static void addProduct(Product product){
        //add the product to the end of the cart
        cart.add(cart.size(), product);
    }

    public static void removeProduct(Product product){
        cart.remove(product);
    }

    public static void viewCart(){
        //View stream
        for(Product prod : cart){
            System.out.println("Element in the cart " + prod);
        }
    }

    public static double totalPrice(){
        //take all prices in cart and return sum
        int totalPrice = 0;
        for(Product product : cart){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
