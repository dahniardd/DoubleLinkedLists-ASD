package doublelinkedlists;

public class Node06 {
    int data;
    Node06 prev, next;

    Node06(Node06 prev, int data, Node06 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
