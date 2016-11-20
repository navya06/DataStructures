package LinkedList;

/**
 * Created by NavyaKaree on 11/19/16.
 */
public class Node {
    int data;
    Node next;

    public Node(int datavalue) {
        data = datavalue;
        next = null;
    }

    public Node(int dataValue, Node dataLink){
        data =dataValue;
        next= dataLink;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
