import java.util.Scanner;

public class gyak {
    static double szum=1;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kérem a hatványozandó számot: ");
        int a = scan.nextInt();
        System.out.print("Kérem a hatványt: ");
        int b = scan.nextInt();
        double eredmeny = powing(a, b);
        System.out.println("Az eredmény: " + eredmeny);
        scan.close();
    }

    public static double powing(int a, int b) {

        if (b>0) {
            b--;
            szum = szum * a;
            powing(a, b);
        }
        return szum;

    }
}
