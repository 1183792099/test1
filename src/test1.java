import java.text.SimpleDateFormat;

public class test1 {

    public static void main(String[] args){
        Account a = new Account(1122,20000);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd" );
        a.setAnnualInterestRate(0.045);
        a.withDraw(1122,2500);
        a.deposit(1122,3000);
        System.out.println("balance:"+a.getBalance()+" MonthlyInterest:"+a.getMonthlyInterest()+" Date:"+ formatter.format(a.getDateCreated()));
    }
}
