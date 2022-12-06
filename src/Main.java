import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Dishes> dishes = new ArrayList<>(Arrays.asList(
                new Dishes("Plov",1500,1000,"30 minuts"),
                new Dishes("Samsa",150,100,"20 minuts"),
                new Dishes("Skewers",75,100,"10 minuts")
        ));


        ArrayList<Beverages> beverages = new ArrayList<>(Arrays.asList(
           new Beverages("Coca-cola",80,1,"1 minuts"),
           new Beverages("Pepsi",85,1,"1 minuts"),
           new Beverages("Fanta",80,1,"1 minuts")
        ));

        ArrayList<Salad> salads = new ArrayList<>(Arrays.asList(
                new Salad("Dollar",220,150,"3 minuts"),
                new Salad("Maria",200,150,"3 minuts"),
                new Salad("Olivie",150,100,"3 minuts")
        ));



        ArrayList<Dessert> desserts = new ArrayList<>(Arrays.asList(
                new Dessert("Cake",120,100,"2 minuts"),
                new Dessert("Cookies",80,100,"2 minuts"),
                new Dessert("Bread",20,20,"2 minuts")
        ));


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

    }
}