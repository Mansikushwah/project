package deposit;
import bankdetail.*;
import java.util.Scanner;
public class Deposit{
    public void deposit(BankDetails account) {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        Scanner sc=new Scanner(System.in);
        amt = sc.nextLong();
        account.balance = account.balance + amt;
    }
}