package LinkedList;

/**
 * Created by NavyaKaree on 11/19/16.
 */
public class List {
    static int counter=0;
    Node head;
    public void add(int data){
        if(head==null)
        head = new Node(data);
        else {
            Node currentnode = head;
            Node tempNode = new Node(data);
            while (currentnode.getNext() != null) {
                currentnode = currentnode.getNext();
            }
            currentnode.setNext(tempNode);
        }
        counter++;
    }
    public void add(int data, int index){
        if(head==null)
            head = new Node(data);
        Node currentnode = head;
        Node tempNode = new Node(data);
        if(currentnode!=null){
            for( int i=0;i<index;i++){
                if(currentnode.getNext()!=null) {
                    currentnode = currentnode.getNext();
                }
            }
        }
        tempNode.setNext(currentnode.getNext());
        currentnode.setNext(tempNode);
        counter++;
    }
    public void display(){
        Node currentNode = head;
        while(currentNode.getNext()!=null){
            System.out.println(currentNode.getData());
            currentNode= currentNode.getNext();
        }
        System.out.println(currentNode.getData());
    }
    public boolean deleteNode(int index) {
        Node currentNode = head;
        if (index < 0 || index > size()) {
            return false;
        }
        if (currentNode != null) {
            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                }
            }

            currentNode.setNext(currentNode.getNext().getNext());
        }
        return true;
    }

    private int size(){
        return counter;
    }

    public int search(int index){
        if (index < 0 || index > size()) {
            return Integer.parseInt(null);
        }
        Node currentNode = head;
        for(int i=0;i<index;i++){
            if(currentNode.getNext()!=null)
                currentNode=currentNode.getNext();
        }
        return currentNode.getData();
    }
}
