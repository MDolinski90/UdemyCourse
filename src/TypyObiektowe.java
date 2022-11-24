public class TypyObiektowe {

    public static void main(String[] args) {
        // liczby stałoprzecinkowe
        Byte firstNumber = 127;          // 1 bajt
        Short secondNumber = 32689;      // 2 bajty
        Integer thirdNumber = 32768999;      // 4 bajty
        Long fourthNumber = 2148000L;    // 8 bajtów

        // liczby zmiennoprzecinkowe
        Float fifthNumber = 4.54362F;   // 4 bajty - 6,7 cyfr po przecinku
        Double sixthNumber = 2.435535443D;  // 8 bajtów - 15 po przecinku

        // wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        // pojedynczy znak
        Character letter = 'A';              // pojedynczy cudzysłów ''

        // ciągi znaków
        String hello = "Hello Bartek";

        hello.contains("Hel");
        // po kropce wyświetla się co możemy zrobić ze zmienną hello (ciąg znaków)
        // contains czy zawiera ciąg znaków (w nawiasie) - jest to boolean -> zwraca true/false

        thirdNumber.doubleValue();
        // zmiana na double - przekonwertowanie z int na double - daje nam liczbe zmiennoprzecinkową

    }
}
