package tutorium;

import java.util.List;

/**
 * The first Stream challenge of the tutorium.
 * This will test {@link java.util.stream.Stream#filter(java.util.function.Predicate)}.
 *
 * @author Ruben Deisenroth
 */
public class Challenge01 {

    /**
     * Executes the challenge.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> list = List.of("Uga", "Buga", "Suga", "Nope");

        // Filter alle Strings aus der Liste, die mit "a" aufhören
        // Nutze dazu Stream.filter()
        // Hinweis: Methode endsWith() von String
        List<String> result = null;
        // <USER CODE>

        // </USER CODE>
        System.out.println(result);
    }

}
