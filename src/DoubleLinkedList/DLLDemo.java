package DoubleLinkedList;

/**
 * Created by NavyaKaree on 11/20/16.
 */
public class DLLDemo {
    public static void main(String[] args){
        DoubleLinkedList doubleLinkedList= new DoubleLinkedList();
        doubleLinkedList.addFront(1);
        System.out.println("After adding element 1:");
        doubleLinkedList.display();
        doubleLinkedList.addFront(2);
        System.out.println("After adding element 2:");
        doubleLinkedList.display();
        doubleLinkedList.addLast(3);
        System.out.println("After adding element 3:");
        doubleLinkedList.display();
        System.out.println("element in the index 1:"+doubleLinkedList.search(1));
        doubleLinkedList.add(1, 5);
        System.out.println("After adding element 5:");
        doubleLinkedList.display();
        doubleLinkedList.delete(1);
        System.out.println("After deleting element in index 1:");
        doubleLinkedList.display();
    }

}
