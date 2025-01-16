public class Vehicle implements Comparable<Vehicle>{
    private String model;
    private int speed;
    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model=" + model + ", speed=" + speed + '}';
    }
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle("Opel",200);
        Vehicle vehicle2=new Vehicle("Opel",300);
        Vehicle vehicle4=new Vehicle("Benz",300);
        Vehicle vehicle3=new Vehicle("Benz",400);
        Vehicle[] vehicles = {vehicle1,vehicle2,vehicle3};
        System.out.println(maxValue(vehicles));
    }

    @Override
    public int compareTo(Vehicle o) {
        if(model.compareTo(o.model) == 0){
            return speed - o.speed;
        }
        else{
            return model.compareTo(o.model);
        }
    }
    public static <T extends Comparable<T>> T maxValue(T[] t){
        if(t.length < 1){
            return null;
        }
        T max = t[0];
        for(int i = 1; i < t.length; i++){
            if(t[i].compareTo(max) > 0){
                max = t[i];
            }
        }
        return max;
    }

}
