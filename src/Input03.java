import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scanner = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
       System.out.print("Enter the integers");
        int u = scanner.nextInt();
        int a = scanner.nextInt();
        int r = scanner.nextInt();

        int sum = u + a + r;
        System.out.println("Sum of the integers"+sum);
        
        
        //Remember to close the Scanner
        scanner.close();
    }
}
