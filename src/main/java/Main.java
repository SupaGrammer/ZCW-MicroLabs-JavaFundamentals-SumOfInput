import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String userInput = scanner.nextLine();
            int n = Integer.parseInt(userInput);
            int sum = 0;
            if (n >= 1) {
            for (int i = 1; i <= n; i++)
            sum += i;
        }
        System.out.println("The sum of your input is " + sum);
    }
}

