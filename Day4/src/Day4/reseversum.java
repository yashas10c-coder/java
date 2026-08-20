package Day4;
import java.util.Scanner;
public class reseversum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
        int choice = sc.nextInt();

        int sum = 0;

        System.out.println("Numbers in reverse order:");
        // Loop from choice down to 1
        for (int i = choice; i >= 1; i--) {
            System.out.print(i + " ");
            sum += i;  // add each number to sum
        }

        // Display result
        System.out.println("\nSummation of numbers from " + choice + " down to 1 = " + sum);

        sc.close();
	}

	

}
