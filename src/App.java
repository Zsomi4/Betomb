import java.util.Scanner;

public class App {
    static int[] korok = new int[100];
    static int darab; 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        beker();
        atlag();
    }

    static void beker() {
        try (Scanner scan = new Scanner(System.in)) {
            int index = 0;
            int eletkor = 0;
            do {
                System.out.print("Életkor: ");
                eletkor = scan.nextInt();
                korok[index] = eletkor;
                index++;
            }while(eletkor != 0);
            //System.out.println(index - 1);
            darab = index - 1;
        }
    }

    static void atlag() {
        //System.out.println(darab);
        System.out.println(korok[0]);
        int osszeg = 0;
        for(int i = 0; i < darab; i++) {
            osszeg += korok[i]; 
        }
        double atlag = osszeg / darab;
        System.out.println("Átlag: " + atlag);

    }
}
