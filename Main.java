import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define un Comparator para comparar prioridades
        Comparator<String> priorityComparator = Comparator.naturalOrder();

        // Crea una instancia de HeapUsingIterativeBinaryTree con los tipos de datos especificados
        HeapUsingIterativeBinaryTree<String, String> tree = new HeapUsingIterativeBinaryTree<>(priorityComparator);

       

        // Define un BufferedReader para leer el archivo diccionario.txt
        try (BufferedReader br = new BufferedReader(new FileReader("diccionario.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Dividir la línea en palabras usando la coma como delimitador
                String[] parts = line.split(",");
                // Insertar la asociación en el árbol
                tree.Insert(parts[0], parts[1]); // Usar parts[0] como prioridad y parts[1] como valor
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Define un Scanner para leer la entrada del usuario
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el texto a traducir:");
            String inputText = scanner.nextLine();

            // Dividir el texto en palabras
            String[] words = inputText.split(" ");

            // Iterar sobre cada palabra y buscar su traducción en el árbol
            for (String word : words) {
                String translation = tree.Find(word); // Utilizar la palabra como clave para buscar la traducción
                System.out.print(translation != null ? translation : "*" + word + "* ");
            }
        }
    }
}
