/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastarters;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlists {
    
    //Use Arraylists when you are just adding/removing stuff from the end of the list but 
    //it is easier to do in the middle or start of Linkedlists
    
    public static void main(String[]args){
     /*
         * ArrayLists manage arrays internally.
         * [0][1][2][3][4][5] ....
         */
        List<Integer> arrayList = new ArrayList<Integer>(); 
        
        /*
         * LinkedLists consists of elements where each element
         * has a reference to the previous and next element
         * [0]->[1]->[2] ....
         *    <-   <-
         */
        List<Integer> linkedList = new LinkedList<Integer>();
        
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList" , linkedList);
    }
    
    private static void doTimings(String type, List<Integer> list) {
        
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
        
        long start = System.currentTimeMillis();
        
        /*
        // Add items at end of list
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
        */
        
        // Add items elsewhere in list
        for(int i=0; i<1E5; i++) {
            list.add(0, i);
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
    
}
    
