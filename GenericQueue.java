import java.util.Arrays;
import java.util.Queue;

public class GenericQueue <E>{
    private Queue<E> queue;

    public Queue<E> getQueue() {
        return queue;
    }

    public void enQueue(E element){
        queue.add(element);
    }
    public E deQueue(){
        return queue.remove();
    }
    public static <T>void reverseArray(T[] array){
        if (array == null || array.length == 0) {
            System.out.println("Empty array");
        }
        else {
            for (int i = 0; i < array.length/2; i++) {
                T temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h"};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
        Character[] array1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        reverseArray(array1);
        System.out.println(Arrays.toString(array1));
        Boolean[] array2 = {true, false, true, false, true, false};
        reverseArray(array2);
        System.out.println(Arrays.toString(array2));

    }
}
