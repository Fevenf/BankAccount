public class BankAccount {

    public double balance;
    public String name ;


    public BankAccount(Double balance, String name){
        this.balance = balance;
        this.name = name;

    }
    public void deposit(double amount){
      balance = balance + amount;
       
        //an amount of money to deposit as the parameter. Add that amount to the account balance.
    }
    public void withdrawal(double amount){
        balance = balance - amount;
         
          //method that has an amount of money to withdraw as the parameter. Subtract that amount from the account balance.
}

    public void print() {
    System.out.println("The account holder name is " + this.name + " and account balance is " + this.balance);
    // A method that can print the account details to the console (name whatever you want or attempt to override the toString()
    // method if you'd like to learn something new) - account holder's name and balance.
}



}