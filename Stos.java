import java.util.ArrayList;

public class Stos<T> implements Stack<T>{
    ArrayList<T> list;

    public Stos(){
        list = new ArrayList<T>();
    }

    @Override
    public void push(T item){
        list.add(item);
    }

    @Override
    public T pop() {
        return list.removeLast();
    }

    @Override
    public T peek() {
        return list.getLast();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
