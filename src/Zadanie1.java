import java.util.Scanner;

public class Zadanie1 {
    public static void pokazLiczby(int liczbaCalkowita){

        if (liczbaCalkowita >= 0){
            for (int i = 0; i <= liczbaCalkowita; i++){
                System.out.println(i);
            }
        } else if (liczbaCalkowita < 0){
            for (int i = 0; i >= liczbaCalkowita; i--){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = skanuj.nextInt();
        pokazLiczby(n);


    }
}