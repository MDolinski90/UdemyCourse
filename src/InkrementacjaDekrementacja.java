public class InkrementacjaDekrementacja {

    public static void main(String[] args) {
        // inkrementacja - zwiększanie wartości o jeden (post i pre)

        int a = 0;
        System.out.println("Wartość a: " + a);
        int b = a++;                                // a++ => zwiększanie o jeden (POSTinkrementacja)
        System.out.println("Wartość b: " + b);      // najpierw przypisujemy wartość pierwotną czyli a=0, a dopiero poniej zwiększamy o jeden (w kolejnej linijce) => 0
        System.out.println("Wartość a: " + a);      // inkrementacja czyli zwiększa się o jeden - z 0 na 1

        int c = ++a;                                // ++a => zwiększanie o jeden (PREinkrementacja)
        System.out.println("Wartość c: " + c);      // najpierw zwiększamy wartość zmiennej a pożniej przypisujemy tą wartość do zmiennej c => 2
        System.out.println("Wartość a: " + a);      // inkrementacja czyli zwiększa się o jeden - z 1 na 2



        // dekrementacja - zmnijszanie wartości o jeden (post i pre)

        int d = 0;
        System.out.println("Wartość d: " + d);
        int e = d--;                                // d-- => zmniejszanie o jeden (POSTdekrementacja)
        System.out.println("Wartość e: " + e);      // najpierw przypisujemy wartość pierwotną czyli d=0, a dopiero poniej zmniejszamy o jeden (w kolejnej linijce) => 0
        System.out.println("Wartość d: " + d);      // dekrementacja czyli zmniejsza się o jeden - z 0 na -1

        int f = --d;                                // --d => zmniejszanie o jeden (PREdekrementacja)
        System.out.println("Wartość f: " + f);      // najpierw zmniejszamy wartość zmiennej d pożniej przypisujemy tą wartość do zmiennej f => -2
        System.out.println("Wartość d: " + d);      // dekrementacja czyli zmniejsza się o jeden - z -1 na -2
    }
}
