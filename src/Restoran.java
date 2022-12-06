import java.util.ArrayList;

public interface Restoran {


   void create(ArrayList<Menu> menies);
   void remove(ArrayList<Menu> menies);
   void getAll(ArrayList<Menu> menies);
   void sortBypRce(ArrayList<Menu> menies);
   void gerByName(ArrayList<Menu> menies);
}
