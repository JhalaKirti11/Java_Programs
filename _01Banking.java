import java.util.Scanner;
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

abstract class BankAccount implements Account{
    double balance;     // store current balance
    protected BankAccount(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        balance= balance-amount;
        System.out.println("balance after withdraw is: "+balance);
    }
    public double getBalance(){
        return balance;
    }
}

class SavingAccount extends BankAccount{
    private final double interestRate = 0.2;
    double interest;
    protected SavingAccount(double balance) {
        super(balance);
    }
    void addInterest(){
        //double interestAmount = super.balance; 
        System.out.println("main bal is "+getBalance());
        interest = getBalance()*interestRate/100;
        System.out.println(interest);     
        super.deposit(interest);
    }
}

class CheckingAccount extends BankAccount{
    protected CheckingAccount(double balance){
        super(balance);
    }
    public void withdraw(double withdrawAmount){
        // transaction fee 1$ per withdraw;
        if(withdrawAmount<getBalance()){
            withdrawAmount = withdrawAmount+1;
            super.withdraw(withdrawAmount);
        }else{
            System.out.println("can't withdraw beyond the limit");
        }
       
    }
}

public class _01Banking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter the deposite amount: ");
        double deposit = sc.nextDouble();
        System.out.print("Enter the withdrawal amount: ");
        double withdraw = sc.nextDouble();
        SavingAccount sa = new SavingAccount(balance);
            sa.deposit(deposit);
            sa.addInterest();
        CheckingAccount ca = new CheckingAccount(sa.balance);
            ca.withdraw(withdraw);
            double amount = ca.getBalance();
        System.out.println("Total balance is: "+amount);
        sc.close();
    }
}
