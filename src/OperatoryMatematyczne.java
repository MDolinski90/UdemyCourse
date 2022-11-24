// umożliwiają wykonanie podstawowych operacji matematycznych

public class OperatoryMatematyczne {

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        double thirdNumber = 4.0F;


        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmowania " + subtraction);
        System.out.println("Wynik mnożenia " + multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik modulo " + mod);

        // --------------------------------------------

        firstNumber+=secondNumber;          // => firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu " + firstNumber);

        firstNumber-=secondNumber;          // => firstNumber = firstNumber - secondNumber
        System.out.println("Po odejmowaniu " + firstNumber);

        firstNumber*=secondNumber;          // => firstNumber = firstNumber * secondNumber
        System.out.println("Po mnożeniu " + firstNumber);

        firstNumber/=secondNumber;          // => firstNumber = firstNumber / secondNumber
        System.out.println("Po dzieleniu " + firstNumber);

        firstNumber%=secondNumber;          // => firstNumber = firstNumber % secondNumber
        System.out.println("Po modulo " + firstNumber);

        // po każdym nadpisywaniu wartość firstNumber się zmienia; w odejmowaniu firstNumber to nie 4 a wynik z pierwszego (dodawania) czyli 10.



    }
}
