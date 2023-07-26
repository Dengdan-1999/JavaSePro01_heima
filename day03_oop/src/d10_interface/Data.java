package d10_interface;

public interface Data<T> {
    //泛型接口
    boolean add(T t);
    boolean delete(T t);
    boolean update(T t);
    T get(int id);
}
