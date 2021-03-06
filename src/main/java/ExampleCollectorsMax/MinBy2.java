package ExampleCollectorsMax;
// Programa 2: Para demostrar minBy() usando reverseOrder()
// Java code to show the implementation of
// Collectors minBy(Comparator comparator) function

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinBy2 {

    // Driver code
    public static void main(String[] args)
    {
        // creating a Stream of strings
        Stream<String> s = Stream.of("2", "3", "4", "5");

        // using Collectors minBy(Comparator comparator)
        // and finding the minimum element
        // in reverse order
        Optional<String> obj = s
                .collect(Collectors
                        .minBy(Comparator
                                .reverseOrder()));

        // if present, print the element
        // else print the message
        if (obj.isPresent()) {
            System.out.println(obj.get());
        }
        else {
            System.out.println("no value");
        }
    }

}
