public class Book extends Product{

    private String author;

    public Book(){

    }
    public Book(String author) {
        this.author = author;
    }

    public Book(String productName, double price, String author) {
        super(productName, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getType() {
        return "Book";
    }


    @Override
    public double priceAfterDiscount() {
        double afterDiscount = this.getPrice() * (20.0 / 100);
        return this.getPrice() - afterDiscount;
    }
}
