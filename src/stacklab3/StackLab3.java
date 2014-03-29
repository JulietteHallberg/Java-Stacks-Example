/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklab3;

import java.util.Scanner;

/**
 *
 * @author Hallberg
 */
public class StackLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //take in from console
        //take in forward brackets
        //see if matches with backward brackets
        //return if it works or not
        StackInterface arrayStack = new ArrayStack();
        StackInterface listStack = new ListStack();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a test line: ");
        String test = in.nextLine();

        for (int i = 0; i < test.length(); i++) {
            String tSub = test.substring(i, i + 1);
            if ((tSub.equals("(") || tSub.equals("{") || tSub.equals("["))) {
                arrayStack.push(tSub);
                listStack.push(tSub);

            } else if (tSub.equals(")") || tSub.equals("}") || tSub.equals("]")) {

                String lStack = (String) listStack.pop();
                String aStack = (String) arrayStack.pop();
                if ((lStack.equals("(") && aStack.equals("(")) && tSub.equals(")")) {
                    System.out.println("( removed");
                } else if ((lStack.equals("{") && aStack.equals("{")) && tSub.equals("}")) {
                    System.out.println("{ removed");
                } else if ((lStack.equals("[") && aStack.equals("[")) && tSub.equals("]")) {
                    System.out.println("[ removed");
                } else {
                    arrayStack.push(aStack);
                    listStack.push(lStack);
                    break;
                }
            }
        }
            if (arrayStack.isEmpty() == false && listStack.isEmpty() == false) {
                System.out.println("Brackets not balenced!");
            } else {
                System.out.println("Balenced perfectly!");
            }


        
    }
}
