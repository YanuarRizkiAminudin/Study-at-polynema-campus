package Praktikum3;

/**...4 lines */
public class Node{
    int data;
    Node prev, next;

    Node(Node prev, int data, Node next){
        this.prev=prev;
        this.data=data;
        this.next= next;
    }
}