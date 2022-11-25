import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podaj swój wiek");
        int wiek = scanner.nextInt();

        if(wiek >= 18) {
            System.out.println("Dziękuje za wykonanie zakupów w naszym sklepie");}
        else if(wiek <= 0) {
            System.out.println("Proszę o podanie prawdziwego wieku");
        }
        else {
            System.out.println("Wiek " + wiek + " lat nie pozwala na zakup alkoholu");
        }
    }
}
