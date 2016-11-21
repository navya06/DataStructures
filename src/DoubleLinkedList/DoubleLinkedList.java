package DoubleLinkedList;

import LinkedList.Node;

/**
 * Created by NavyaKaree on 11/20/16.
 */
public class DoubleLinkedList {
    static int counter;
    DLLNode head;

    public void addLast(int data) {
        if(head==null) {
            head = new DLLNode(null, data, null);
        }
        else {
            DLLNode currentNode = head;
            DLLNode tempNode = new DLLNode(data);
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(tempNode);
            tempNode.setPrevious(currentNode);
        }
        counter++;
    }

    public void addFront(int data){
        if(head == null){
            head= new DLLNode(null, data, null);
        }
        else {
            DLLNode tempNode= new DLLNode(null, data, head);
            head.previous = tempNode;
            head = tempNode;
        }
        counter++;
    }

    public void add(int index, int data){
       if(index<0&& index>size()){
           return;
       }
        else {

           DLLNode currentNode = head;
           for(int i=0;i<index;i++){
               if(currentNode.getNext() != null) {
                   currentNode = currentNode.getNext();
               }
           }
           DLLNode tempNode= new DLLNode(currentNode, data, currentNode.getNext());
           currentNode.setNext(tempNode);
        }

    }

    public int size(){
        return counter;
    }

    public void display(){
        DLLNode currentNode=head;
        while(currentNode!=null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    public void delete(int index){
        if(index<0&& index>size()){
            return;
        }
        else {
            DLLNode currentNode = head;
            for(int i=0;i<index;i++){
                if(currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                }
            }
            DLLNode lastNode= currentNode.getPrevious();
            lastNode.next= currentNode.next;
        }
    }
    public int search(int index){
        DLLNode currentNode = head;
        if(index<0&& index>size()){
            return Integer.parseInt(null);
        }
        else {

            for(int i=0;i<index;i++){
                if(currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                }
            }
        }
        return currentNode.getData();
    }
}
