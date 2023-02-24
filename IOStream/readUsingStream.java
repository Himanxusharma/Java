package IOStream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class readUsingStream {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        
        String fileName = "/Users/hisharma/Desktop/Java-Learning/IOStream/read.txt";
        System.out.println("\nreading file using bufferreader+whileLoop :");
        BufferedReader br2 = new BufferedReader(new FileReader(fileName));
        String line1;
        while ((line1 = br2.readLine()) != null) {
            System.out.println(line1);
        }

        System.out.println("\nreading file using stream. :  ");
        List<String> list1 = new ArrayList<>();
        Stream<String> stream = Files.lines(Paths.get(fileName));
        list1 = stream
                .filter(line -> !line.startsWith("line"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        list1.forEach(System.out::println);

        System.out.println("\nreading file using bufferreader + stream :");
        List<String> list = new ArrayList<>();
        BufferedReader br = Files.newBufferedReader(Paths.get(fileName));
        list = br.lines().collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
