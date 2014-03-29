/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklab3;

/**
 *
 * @author Hallberg
 */
public class ListStack<E> implements StackInterface<E> {
   private int size;
   Node head;
   
   
    public void push(E item){
        head = new Node(item, head);
        size++;
        //add node
    }
    public E pop(){
        E temp;
        temp = (E) head.getItem();
        head=head.getNext();
        size--;
        return temp;
                //remove node and return value of node
    }
    public boolean isEmpty(){
        if(size ==0){
            return true;
        }
        else{
            return false;
        }
        
    }


}
