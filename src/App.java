import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public  class App {
    public static int mainMenu(BankAccount bankAccount){
        System.out.println("Hello " + bankAccount.name );
        System.out.println("Welcome to the main menu, what would you like to do today ?");
        System.out.println("1 To check account balance");
        System.out.println("2 To make withdraw");
        System.out.println("3 To make Deposit");
        System.out.println("4 To make a Transfer to another account");
        System.out.println("0 exit ");


        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());
        return input;
    }




    public static void main(String[] args) throws Exception {

        ArrayList<BankAccount> myList = new ArrayList<>();
        System.out.println("Hello world! Welcome to the Bank of CFH");
        System.out.println("Are you existing customer ?(-1 to exit)");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());
        double balance = 0.0;
        String name = "";
      
        switch(input){
            case 1: // TODO
            break;
            case 2: 
            System.out.println("Lets make a new account");
            System.out.println("What's the name of account");
            name = scan.next();
            System.out.println("What's the beginning balance for the account");
            balance = scan.nextDouble();
            break;
            // case 3:
            //     System.out.println("Exit");
            //     break;
            default: 
            System.out.println("Invalid entry");
            break;
        }
        Random rand = new Random();
        int account = rand.nextInt();
        BankAccount bankAccount = new BankAccount(balance, name,account);
        BankAccount bankAccount2 = new BankAccount();
        int choice = mainMenu(bankAccount);
        do {
        switch(choice){
            case 1: 
                System.out.println("your balance is " + bankAccount.balance);
                break;
            case 2: 
                System.out.println("enter your withdrawl amount: ");
                double withdrwalAmount = scan.nextDouble();
                bankAccount.withdrawal(withdrwalAmount);
                System.out.println("your balance is now " + bankAccount.balance);
                break;
            case 3: 
                System.out.println("enter your deposit amount: ");
                double depositAmount = scan.nextDouble();
                bankAccount.deposit(depositAmount);
                System.out.println("your balance is now " + bankAccount.balance);
                break;
            case 4: 
                while (true) {
                    System.out.println("Please enter the account number to transfer to: ");
                   int acc = scan.nextInt();
                    int accountNumber = Integer.parseInt(String.valueOf(acc))-1;
                    if(accountNumber>myList.size()){
                        System.out.println("Account doesn't exist");
                        break;
                    }
                    System.out.println("Please enter the amount to transfer");
                    double transferAmount = scan.nextDouble();
                    bankAccount.transfer(bankAccount2, transferAmount);
                    System.out.println("Your balance is now " + bankAccount.balance);
                    System.out.println(" Transferred account balance is now " + bankAccount2.balance);
                }
                break;
            default:
            System.out.println("Account doesn't exist");
        }
        choice = mainMenu(bankAccount);
    } while (choice != 0);

        // account1.deposit(100.0);
        // account1.print();
        // BankAccount account2 = new BankAccount(5000.00, "Mahlet");
        // account2.withdrawal(100.0);
        // account2.print();
        // BankAccount account3 = new BankAccount(300.00, "Robel");
        // account3.deposit(100);
        // account3.print();

    }
}
