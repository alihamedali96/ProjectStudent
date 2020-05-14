/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastarters;

 import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapCollection1 {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // will sort sometimes but not always so dont trust if you need to sort
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //keeps the hashmap in the SAME order it was put in
        Map<Integer, String> treeMap = new TreeMap<>(); // will sort hashmap in order of the KEYS
        
        testMap(linkedHashMap);
    }
    
    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");
        
        for(Integer key: map.keySet()) {
            String value = map.get(key);
            
            System.out.println(key + ": " + value);
        }
    }
    
}