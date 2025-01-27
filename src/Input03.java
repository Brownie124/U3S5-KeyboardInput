import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scanner = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
       System.out.print("Enter the integers");
        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        int sum3 = scanner.nextInt();

        int sum = sum1 + sum2 + sum3;
        System.out.println("Sum of the integers"+sum);
        
        
        //Remember to close the Scanner
        scanner.close();
    }
}
