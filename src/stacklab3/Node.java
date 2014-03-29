/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklab3;

/**
 *
 * @author Hallberg
 */
public class Node<E> {

    int top;
    Node next;
    E item;

    public Node(E item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }
}
