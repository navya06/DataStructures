package LinkedList;

/**
 * Created by NavyaKaree on 11/19/16.
 */
public class LinkedListDemo {
public static void main(String[] args){
    List ll = new List();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    System.out.println("List after adding");
    ll.display();
    ll.add(5,2);
    System.out.println("List after deleting");
    ll.deleteNode(1);
    ll.display();
    System.out.println("element in index 1:"+ll.search(1));
}
}
