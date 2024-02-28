public class Movie extends Product {
private String director;


public Movie(){}
    public Movie(String director) {
        this.director = director;
    }

    public Movie(String productName, double price, String director) {
        super(productName, price);
        this.director = director;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String getType() {
        return "Electronic";
    }



    @Override
    public double priceAfterDiscount() {
        double afterDiscount = this.getPrice() * (10.0 / 100);
        return this.getPrice() - afterDiscount;
    }


}
