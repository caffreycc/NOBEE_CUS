/**
 * Created by chenshengju on 2017/8/22 0022.
 */
public class Plate<T> {
    private T item;
    public Plate(T t){item=t;}
    public void set(T t){item=t;}
    public T get(){return item;}
}
