/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklab3;

/**
 *
 * @author Hallberg
 */
public interface StackInterface<E> {
    public void push(E item);
    public E pop();
    public boolean isEmpty();
}
