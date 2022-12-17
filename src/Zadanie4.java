import java.util.Scanner;

public class Zadanie4 {
    public static void printStarsVertically(int firstColumn, int secondColumn, int thirdColumn) {
        //znajdź najwyższą wartość
        int highestValue = Math.max(firstColumn, secondColumn);
        highestValue = Math.max(highestValue, thirdColumn);
        for (int i = 0; i < highestValue; i++) {
            if (firstColumn > secondColumn && firstColumn > thirdColumn) {
                System.out.println("*  ");
                firstColumn--;
            } else if (secondColumn > firstColumn && secondColumn > thirdColumn){
                System.out.println(" * ");
                secondColumn--;
            } else if(thirdColumn > firstColumn && thirdColumn > secondColumn){
                System.out.println("  *");
                thirdColumn--;
            } else if(firstColumn == secondColumn && firstColumn > thirdColumn){
                System.out.println("** ");
                firstColumn--;
                secondColumn--;
            } else if(secondColumn == thirdColumn && secondColumn > firstColumn){
                System.out.println(" **");
                secondColumn--;
                thirdColumn--;
            } else if (firstColumn > secondColumn){
                System.out.println("* *");
                firstColumn--;
                thirdColumn--;
            } else System.out.println("***");
        }
    }
    public static void main(String[] args) {
        int x,y,z;
        x = y = z = -1;
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj 3 liczby całkowite: ");
        while(x<0){
            System.out.println("x: ");
            x = skanuj.nextInt();
        }
        while(y<0){
            System.out.println("y: ");
            y = skanuj.nextInt();
        }
        while(z<0){
            System.out.println("z: ");
            z = skanuj.nextInt();
        }
        printStarsVertically(x, y, z);
    }
}