
package javastarters;

import java.util.ArrayList;

public class Generics {

    public static void main (String[] args){
    
    //ArrayList 
    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Pear");
    list.remove(list.size() - 1); //removes last item
    list.remove(0);//removing the first item of an arraylist is slow because it has to move all the items into a new arraylist (i think)
    
    //System.out.println(list.get(1));
    
    // A way to print out an arraylist
    for(String value: list) 
    {   
        System.out.println(value);
    }

    {
     //   System.out.println(value);
    }
    
    
    
    
    /* Needs Work!!!
    //Wildcards - You cant add a subclass arraylist on to a parent arraylist...you can only do it by adding them all to an 'Object' arraylist
    ArrayList<Machine> list1 = new ArrayList<>();

        list1.add(new Machine());

        ArrayList<Car> list2 = new ArrayList<>();

        list2.add(new Car());

    //    showList(list2);
      //  showList2(list1);
        showList3(list1,list2);
    }

    public static void showList(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
        }

    }
    
    public static void showList2(ArrayList<? super Car> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
    
    public static void showList3(ArrayList<?> list, ArrayList<?> list2) { 
        for (Object value : list) {
            System.out.println(value);
        }
    }

    */
    
    
    
    
    }
    
}
