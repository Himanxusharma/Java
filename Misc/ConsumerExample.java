package Misc;
import java.util.function.Consumer;


public class ConsumerExample {
    public static void main(String[] args) {
        
    
    Consumer <String> c1 = s-> System.out.println("yes, " + s);
    c1.accept("Himanshu");

    Consumer <String> c2 = s->System.out.println(s.toUpperCase());
    c1.andThen(c2).accept("Himanshu");
    
}
}