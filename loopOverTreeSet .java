// Java program to loop over TreeSet 
  
import java.util.Iterator; 
import java.util.TreeSet; 
  
public class TreeSetExample { 
    public static void main(String[] args) 
    { 
        TreeSet<Integer> 
            ts = new TreeSet<Integer>(); 
        ts.add(10); 
        ts.add(61); 
        ts.add(87); 
        ts.add(39); 
  
        // Loop over the TreeSet values 
        // and print the values 
        System.out.print("TreeSet: "); 
        for (Integer value : ts) 
            System.out.print(value 
                             + ", "); 
        System.out.println(); 
    } 
} 