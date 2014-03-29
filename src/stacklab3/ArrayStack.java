/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklab3;

import java.util.ArrayList;

/**
 *
 * @author Hallberg
 */
public class ArrayStack<E> implements StackInterface<E>{
    ArrayList<E> array = new ArrayList();
    private int size;
    Node head;

    public E pop() {
        E temp = array.get(size-1);
        array.remove(size-1);
        size--;
        return temp;
    }

    public void push(E item) {
       array.add(item);
        size++;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

   
}
