import java.util.Arrays;

public class Test {
    public static <T extends Comparable<T>> void sortDescending(T[] t){
        Arrays.sort(t);
    }
    public static void main(String[] args) {
        Building building=new Building(3.5,"niebieski");
        House house=new House(2.5,"czerwony",5);
        System.out.printf(building.toString());
    }
}
