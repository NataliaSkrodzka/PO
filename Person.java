public class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public static <T extends Comparable<T>> T minValue(T[] t){
        T min = t[0];
        for(int i = 1; i < t.length; i++){
            if(t[i].compareTo(min) < 0){
                min = t[i];
            }
        }
        return min;
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
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("John", 20);
        people[1] = new Person("Jane", 25);
        people[2] = new Person("Bob", 30);
        if (maxValue(people) != null) {
            System.out.println(maxValue(people).toString());
        }
    }

    @Override
    public int compareTo(Person o) {
        if(name.compareTo(o.name) == 0){
            return age - o.age;
        }
        else{
            return name.compareTo(o.name);
        }
    }
}
