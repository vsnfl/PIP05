import java.util.Scanner;

public class Zadanie3 {
    public static void pokazGwiazdki(int linijki){
        int z = (linijki - 1)/2;
        for(int i = 0; i < linijki; i++){
            if (i % 2 == 0){
                int liczbaGwiazdek = i + 1;
                for(int spacje = 0; spacje < z; spacje++)
                    System.out.print(" ");
                for (int j = 0; j < liczbaGwiazdek; j++){
                    System.out.print("*");
                }
                System.out.println();
                z--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = skanuj.nextInt();
        if (n % 2 == 0){
            n--;
        }
        pokazGwiazdki(n);

    }
}