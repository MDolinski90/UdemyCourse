import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę.");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę.");
        int secondNumber = scanner.nextInt();

        int resultAddition = firstNumber + secondNumber;
        int resultSubtraction = firstNumber - secondNumber;
        int resultMultiplication = firstNumber * secondNumber;
        int resultDivision = firstNumber / secondNumber;
        int resultMod = secondNumber % firstNumber;

        System.out.println("Dodawanie dwóch wcześniej wybranych liczb wynosi: " + resultAddition);
        System.out.println("Odejmowanie dwóch wcześniej wybranych liczb wynosi: " + resultSubtraction);
        System.out.println("Mnożenie dwóch wcześniej wybranych liczb wynosi: " + resultMultiplication);
        System.out.println("Dzielenie dwóch wcześniej wybranych liczb wynosi: " + resultDivision);
        System.out.println("Różnica z dzielenia dwóch wcześniej wybranych liczb wynosi (druga/pierwszą): " + resultMod);

    }
}