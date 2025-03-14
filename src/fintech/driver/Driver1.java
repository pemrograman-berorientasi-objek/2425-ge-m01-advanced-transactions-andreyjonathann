package fintech.driver;
/**
 * @author 12S23017_Andrey Jonathan
 * @author 12S23050_Yolanda Saragih
 */
import java.util.Scanner;
import fintech.model.Account;
import fintech.model.Transaction;

public static void main(String[] _args){

public class Driver1 {
    Scanner input = new Scanner(System.in);
        String accountName = input.nextLine();
        String owner = input.nextLine();
        String balance = input.nextLine();
        String perintah = input.nextLine();

        Account accountS = new Account(accountName, owner);
        
        String perintah2 = input.nextLine();
        accountName = input.nextLine();
        
        double amount = input.nextDouble();
        input.nextLine(); 

        String posted_at = input.nextLine();
        String note = input.nextLine();

        Account account = new Account(accountName, owner);
        System.out.println(accounts.toString());
        Transaction transaction = new Transaction(accountName, owner, amount, balance, postedAt, note);
        System.out.println(transaction.toString2());


        System.out.println(accounts.toString());

        input.close();
    }
}