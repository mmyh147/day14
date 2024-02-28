//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Movie e = new Movie("Phone", 99.99, "Ahmed");
        System.out.println("Product name: " + e.getProductName());
        System.out.println("Director name: " + e.getDirector());
        System.out.println("Product type: " + e.getType());
        System.out.println("Product price: " + e.getPrice());
        System.out.println("Product price after 10% discount : " + e.priceAfterDiscount());

        Movie e1 = new Movie("laptop", 79.99, "Mohammed");
        System.out.println("\nProduct name: " + e1.getProductName());
        System.out.println("Director name: " + e1.getDirector());
        System.out.println("Product type: " + e1.getType());
        System.out.println("Product price: " + e1.getPrice());
        System.out.println("Product price after 10% discount : " + e1.priceAfterDiscount());

        System.out.println("=================================================================");

        Book b = new Book("Math", 49.99, "Sami");
        System.out.println("Product name: " + b.getProductName());
        System.out.println("Author name: " + b.getAuthor());
        System.out.println("Product type: " + b.getType());
        System.out.println("Product price: " + b.getPrice());
        System.out.println("Product price after 20% discount : " + b.priceAfterDiscount());

        Book b1 = new Book("Health", 39.99, "Abdullah");
        System.out.println("\nProduct name: " + b1.getProductName());
        System.out.println("Author name: " + b1.getAuthor());
        System.out.println("Product type: " + b1.getType());
        System.out.println("Product price: " + b1.getPrice());
        System.out.println("Product price after 20% discount : " + b1.priceAfterDiscount());

        System.out.println("\n======================================================================");

        MovablePoint m1 = new MovablePoint(2,2,5,6);
        m1.moveUp();
        System.out.println("The object point X: " + m1.getX() + " Y: " + m1.getY());
        m1.moveDown();
        System.out.println("The object point X: " + m1.getX() + " Y: " + m1.getY());
        m1.moveLeft();
        System.out.println("The object point X: " + m1.getX() + " Y: " + m1.getY());
        m1.moveDown();
        System.out.println("The object point X: " + m1.getX() + " Y: " + m1.getY());
        m1.moveDown();
        System.out.println("The object point X: " + m1.getX() + " Y: " + m1.getY());
        m1.moveRight();
        System.out.println("The object point X: " + m1.getX() + " Y: " + m1.getY());
        m1.moveUp();
        System.out.println("The object point X: " + m1.getX() + " Y: " + m1.getY());


    }
}