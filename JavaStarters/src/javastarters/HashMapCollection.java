
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastarters;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ali
 */
public class HashMapCollection {
    
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        
        
        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");
        
        String text = map.get(6);
        
        System.out.println(text);
        
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println(key + ": " + value);
        }
        
    }
    
}
