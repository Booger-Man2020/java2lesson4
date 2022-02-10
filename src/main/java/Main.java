import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        NewLinkedList<Integer> integerNewLinkedList = new NewLinkedList<>();
        integerNewLinkedList.addNode(1);
        integerNewLinkedList.addNode(2);
        integerNewLinkedList.addNode(3);
        integerNewLinkedList.addNode(4);
        integerNewLinkedList.addNode(5);
        integerNewLinkedList.addNode(6);
        integerNewLinkedList.addNode(7);
        integerNewLinkedList.addNode(8);
        integerNewLinkedList.addNode(9);
        integerNewLinkedList.addNode(10);
      //  integerNewLinkedList.addNode(5);

        integerNewLinkedList.addByIndex(4,15);
        integerNewLinkedList.delete(7);






        integerNewLinkedList.display();
        System.out.println();
        integerNewLinkedList.display(5);
    }
}
