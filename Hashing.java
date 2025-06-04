import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert;
        map.put("India", 150);
        map.put("USA", 300);
        map.put("China", 200);
        System.out.println(map);

        // Search;
        if(map.containsKey("China")){
            System.out.println("present in the map");

        } else {
            System.out.println("not present in the map"); 
        }
        System.out.println(map.get("China")); // key exists
        System.out.println();
        int arr[] = {12, 13, 15};
        for(int val: arr){
            System.out.println(val + " ");

        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue()); 
        }

        for (item : arr){
            System.out.println(item);
        }
        Set<String> keys = map.keySet();
        for(String key: keys){

        }
    }
    
}
