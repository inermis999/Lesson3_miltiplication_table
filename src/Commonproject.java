import java.util.Scanner;

public class Commonproject {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the random number");
       int number = scanner.nextInt();

// 2 x 1 = 2


       for ( int i=1 ; i<=10; i++){
         int multiplied = number * i;
           System.out.printf("%d x %d = %d%n", number, i, multiplied);
       }

    }
}
