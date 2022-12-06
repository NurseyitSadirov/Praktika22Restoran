import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Menu implements Restoran {
  private static final Scanner scanner = new Scanner(System.in);
  private String name;
  private int price;
  private double volume;
  private String speed;

  public Menu(String name, int price, double volume, String speed) {
    this.name = name;
    this.price = price;
    this.volume = volume;
    this.speed = speed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }

  public String getSpeed() {
    return speed;
  }

  public void setSpeed(String speed) {
    this.speed = speed;
  }

  @Override
  public String toString() {
    return "Menu{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", volume=" + volume +
            ", speed='" + speed + '\'' +
            '}';
  }

  @Override
    public void create(ArrayList<Menu> menies) {

    System.out.println("choose name food: ");
    String name = scanner.nextLine();
    for (Menu m : menies) {
      if (name.equals(m.name)){
        System.out.println(m);
        double summa = scanner.nextDouble();
        if (summa > m.price){
          double result = summa-m.price;
          System.out.println("change: "+result);
        }else {
          System.out.println("Akchan jetpeyt");
        }
      }
    }
  }

    @Override
    public void remove(ArrayList<Menu> menies) {

    }

    @Override public void getAll(ArrayList<Menu> menies) {


    }

    @Override
    public void sortBypRce(ArrayList<Menu> menies) {

    }

    @Override
    public void gerByName(ArrayList<Menu> menies) {

    }
    public static Comparator<Menu> menuComparator = new Comparator<Menu>() {
      @Override
      public int compare(Menu o1, Menu o2) {
        return o1.price- o2.price;
      }
    };
}
