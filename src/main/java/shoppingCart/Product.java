package shoppingCart;


public class Product {
    int id;
    String name;
    String description;
    double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", id: " + id + ", description: " + description + ", price: " + price;
    }
    /*Object productInfo[] = {product.name, product.description, product.price};

        productsGroup.put(product.id, productInfo);*/
    public Product(int id, String name, String description, double price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
