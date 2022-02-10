public class Node<T> {
    public Object value;
    T data;
    Node next;


    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
