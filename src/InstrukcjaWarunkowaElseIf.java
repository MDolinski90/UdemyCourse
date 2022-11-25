public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {
        int number = 12;

        if(number > 0) {
            System.out.println("Liczba większa od zera");}
        else if(number > 10) {
            System.out.println("Numer większy od 10");}
        else if(number < -200) {
            System.out.println("Liczba mniejsza od -200");}
        else if(number == 0) {
            System.out.println("Liczba równa zero");}
        else {
            System.out.println("Liczba z przedziału 0 do -200");
        }

        // dla liczby 12 spełnione 2 warunki (>0 i >10) - w takiej sytuacji wypisany jest pierwszy zapisany

    }
}
