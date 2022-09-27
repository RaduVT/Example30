import java.util.Scanner;

public class Examole30 {
    public static void main(String[] args){
        int n, i, j;

         Scanner inportValue;
         inportValue = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = inportValue.nextInt();

        for (i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
