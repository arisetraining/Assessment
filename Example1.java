/*
Array is a fixed size data structure while ArrayList is not fixed size.
*/
package arrayandarraylist;

import java.util.ArrayList;

public class Example1 {

    public static void main(String args[]) {
        /* ........... Static Array............. */
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr[0] + " " + arr[1]);
        /*............ArrayList, Dynamic Array..............*/
// Create an arrayList with initial capacity 2
        ArrayList<Integer> arrL = new ArrayList<Integer>(2);
// Add elements to ArrayList
        arrL.add(566461); // converts int data type into an Integer object
        arrL.add(247252);
        arrL.add(45);
// Access elements of ArrayList
        for (int i = 0; i < arrL.size(); i++) {
            System.out.println(arrL.get(i));
        }
        System.out.println(arrL.get(0));
        System.out.println(arrL.get(1));   
        System.out.println(arrL);
    }
}


