import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double balance = 1000.0; 

            while (true) {
                
                System.out.println("ATM Options Menu");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

              
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                
                switch (choice) {
                    case 1:
                        System.out.println("Your balance: $" + balance);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: $");
                        double depositAmount = sc.nextDouble();
                        balance += depositAmount;
                        System.out.println("Deposit successful. New balance: $" + balance);
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: $");
                        double withdrawAmount = sc.nextDouble();

                        if (withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println("Withdrawal successful. New balance: $" + balance);
                        } else {
                            System.out.println("Withdrawal failed.");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }

        
} 
       