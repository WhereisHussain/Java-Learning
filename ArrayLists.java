import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Adding elements to the ArrayList
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println("Initial ArrayList: " + list);    

        // Get element:
        int element = list.get(0);
        System.out.println(element);

        // To add element in between:
        list.add(1, 1);
        System.out.println("After adding 1 at index 1: " + list);

        // Set element:
        list.set(0, 5);
        System.out.println("After setting index 0 to 5: " + list); 

        // Delete element:
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);

        // Get size of ArrayList:
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);
        
        // loops:
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        // Sorting the ArrayList:
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

         
    
    }

}