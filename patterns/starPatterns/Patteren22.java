import java.util.Scanner;

public class DiamondPortalPattern {

    public static void printDiamondPortal(int n) {
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for symmetrical design.");
            return;
        }

        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                // 1. Primary Diagonals (\ and /)
                // Prints stars along the two main diagonals (i=j and i+j=n-1)
                if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                }
                
                // 2. Central Row and Column
                // Prints stars along the middle row (i=mid) and middle column (j=mid)
                else if (i == mid || j == mid) {
                    System.out.print("* ");
                }
                
                // 3. Spacing Condition (Hollow Center)
                // Prints a space everywhere else.
                else {
                    System.out.print("  "); // Use two spaces for proper alignment
                }
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number for the pattern size (e.g., 9): ");
        int size = scanner.nextInt();
        scanner.close();
        
        printDiamondPortal(size);
    }
}
