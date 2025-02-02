import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List with numbers y text strings
        List<String> elements = Arrays.asList("chair","42", "table","3.14", "door", "a", "television","25");

        // Filter the chains and sort them by length
        List<String> sortedString = elements.stream()
                .sorted(Comparator.comparingInt(String::length).reversed()) // Sort by length from longest to shortest
                .toList();


        System.out.println("String sorted by length: " + sortedString);
        }
    }
