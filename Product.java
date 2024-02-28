public abstract class Product {


    private String productName;
    private double price;

    Product(){

    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getType();

    public abstract double priceAfterDiscount();

}
