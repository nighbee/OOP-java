package lab3;

public interface MyCollection<E> {
    boolean add(E element);
    boolean remove(E element);
    boolean contains(E element);
    void clear();
    int size();
    boolean isEmpty();
}