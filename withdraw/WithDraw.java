package withdraw;
import bankdetail.*;
import java.util.Scanner;
public class WithDraw extends BankDetails {

    public void withdrawal(BankDetails account) {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        Scanner sc = new Scanner(System.in);
        amt = sc.nextLong();
        if (account.getbalance() >= amt) {
            account.balance = account.balance - amt;
            System.out.println("Balance after withdrawal: " + account.balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

}





