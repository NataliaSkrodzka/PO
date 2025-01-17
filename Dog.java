public class Dog extends Animal {
    private int age;
    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "pies: "+getName()+", age: "+age;
    }

    public static <T extends Dog> void findMinMaxAge(T[] array,Pair<?super Dog>result) {
        if (array == null || array.length == 0||result==null) {
            throw new IllegalArgumentException("tablica nie może być nullem ani pusta, result nie moze byc nullem");
        }
        T minDog = array[0];
        T maxDog= array[0];
        for (T dog : array) {
            if (dog.getAge() < minDog.getAge()) {
                minDog=dog;
            }
            if(dog.getAge()>maxDog.getAge()) {
                maxDog=dog;
            }
        }
        result.setFirst(minDog);
        result.setSecond(maxDog);
    }
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Dog dog1 = new Dog("Dog1", 1);
        Dog dog2 = new Dog("Dog2", 2);
        Dog dog3 = new Dog("Dog3", 3);
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;
        Pair<Dog>result=new Pair<>();
        findMinMaxAge(dogs, result);
        System.out.println(result.getFirst());
        System.out.println(result.getSecond());
    }
}
