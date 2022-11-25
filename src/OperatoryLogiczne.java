// działają na wartościach logiczny zwracając również wartość logiczną

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        System.out.println(firstValue && secondValue);       // operator && - i (true dwa wyrażenia składowe są równe true)
        System.out.println(firstValue && thirdValue);
        System.out.println(firstValue || secondValue);      // operator || - lub (true gdy jedno wyrażenie składowe jest równy true)
        System.out.println(secondValue || fourthValue);
        System.out.println(!firstValue);                    // operator ! - negacja (zwraca wartość przeciwną => jeżeli true to false)
        System.out.println(!secondValue);
        System.out.println(!(firstValue && secondValue));
    }
}
