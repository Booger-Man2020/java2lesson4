import java.util.Iterator;

public class NewLinkedList<T> {

    private long size;
    private Node head;
    private Node end;
    private Object data;

    public NewLinkedList() {
        this.size = 0;
        this.head = null;
        this.end = null;
    }


    public void addNode(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            end = newNode;
        } else {
            end.next = newNode;
        }
        end = newNode;
        size++;
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Пусто");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void display(int index) {
        if (index > size) {
            System.out.println("Размер больше заданного");
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;

        }
        System.out.println(current.data);
    }

    public void addByIndex(int index, T data) {
        this.data = data;
        Object value;
        this.end = end;

        Node current = head;

        if (index == size) {
            end.data = data;
            size++;
        } else {
            for (int i = 1; i < size; i++) {
                if (index == i) {
                    //   value = current.data;
                    current.data = data;
//                    value1 = current.next.data;
//                    current.next.data = value;
//
                    size++;
                }
                current = current.next;

            }
        }
    }

    public void delete(int index) {
        this.data = data;
        Object value;
        this.end = end;

        Node current = head;

        if (index == size) {
            end.data = data;
            size++;
        } else {
            for (int i = 1; i < size; i++) {
                if (index == i) {
                    current.data = null;


                }
                current = current.next;
            }
        }
    }
}


// value1 = current.next.data;









