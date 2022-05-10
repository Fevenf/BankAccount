public class App {
    
    public static void main(String[] args) throws Exception {
        //Create a class with a main method where you instantiate a BankAccount object with 500 dollars. 
        //Deposit 100 dollars into the account and then print the account details to the console.


        BankAccount account1 = new BankAccount(500.00, "Feven");
        account1.deposit(100.0);
        account1.print();
        BankAccount account2 = new BankAccount(5000.00, "Mahlet");
        account2.withdrawal(100.0);
        account2.print();
        BankAccount account3 = new BankAccount(300.00, "Robel");
        account3.deposit(100);
        account3.print();


       



    }
}
