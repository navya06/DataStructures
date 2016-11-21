package DoubleLinkedList;

/**
 * Created by NavyaKaree on 11/20/16.
 */
public class DLLNode {
    DLLNode previous;
    DLLNode next;
    int data;

    public DLLNode(){
        previous = null;
        data= Integer.parseInt(null);
        next= null;
    }
    public DLLNode(int datavalue){
        previous = null;
        data= datavalue;
        next= null;
    }
    public DLLNode(DLLNode previous, int datavalue){
        this.previous = previous;
        data = datavalue;
        next = null;
    }

    public DLLNode(DLLNode previous, int datavalue, DLLNode next){
        this.previous = previous;
        data = datavalue;
        this.next = next;
    }

    public DLLNode getPrevious() {
        return previous;
    }

    public void setPrevious(DLLNode previous) {
        this.previous = previous;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
