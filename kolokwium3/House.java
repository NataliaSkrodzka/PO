public class House extends Building{
    int numberOfRooms;
    public House(double height, String color,int numberOfRooms) {
        super(height, color);
        this.numberOfRooms=numberOfRooms;
    }
    @Override
    public String toString() {
        return "dom: wysokość: "+getHeight()+", kolor: "+getColor()+ ", liczba pokoi: " + numberOfRooms;
    }
}
