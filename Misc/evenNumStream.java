package Misc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class evenNumStream {
    
    public static void main(String[] args) {
        
    
    //Arrays.asList(1,2,3,4,5,6,7,8,9);
    // create a list of integers
    List<Integer> number = Arrays.asList(2,3,4,5);
  
    // demonstration of map method
    List<Integer> square = number.stream().map(x -> x*x).
                           collect(Collectors.toList());
    System.out.println(square);
}
}