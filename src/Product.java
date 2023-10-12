public class Product {
    private double price;
    private String type;
    private boolean stock;

    public Product(double price, String type, boolean stock){
        this.price = price;
        this.type = type;
        this.stock = stock;
    }

    public Product(){
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", type='" + type + '\'' +
                ", stock=" + stock +
                '}';
    }
}
