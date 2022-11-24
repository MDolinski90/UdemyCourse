import java.io.InputStream;
import java.util.Scanner;

public class CustomScanner {

    public CustomScanner(InputStream in) {
    }

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cześć, witaj w programie. Podaj prosze swoje imię.");
        String name = scanner.nextLine();        // metoda, która pobierz e to co wpisuje użytkownik - metoda zwróci nam Stringa
        System.out.println("Cześć " + name + " !");

    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę.");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + result);
    }
}
