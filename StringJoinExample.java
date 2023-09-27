import java.util.*;

public class StringJoinExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = Arrays.asList("Hello", "World", "Java");

        // Join the elements of the list into a single string with a comma delimiter
        String result = String.join(", ", words);

        // Print the result
        System.out.println(result);
    }
}
