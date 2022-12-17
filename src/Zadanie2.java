import java.util.Scanner;

public class Zadanie2 {
    public static void ciagFibonacciego(int liczbaWyrazow){
        int wyraz1 = 0, wyraz2 = 1;

        int i = 0;
        while(i<=liczbaWyrazow)
        {
            System.out.print(wyraz1 + " ");
            int sumaPoprzednich = wyraz1 + wyraz2;
            wyraz1 = wyraz2;
            wyraz2 = sumaPoprzednich;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = skanuj.nextInt();
        System.out.print("Ciag Fibonacciego dla " + n + " wyrazow to:");
        ciagFibonacciego(n);

    }
}