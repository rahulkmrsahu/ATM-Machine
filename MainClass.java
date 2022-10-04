
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        AtmOperationImpl op=new AtmOperationImpl();
        int atmNumber=12345;
        int atmPin=123;
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter ATM number:: ");
        int atmNo=sc.nextInt();
        System.out.print("Enter ATM Pin:: ");
        int pin=sc.nextInt();
        

        if((atmNo==atmNumber)&&(pin==atmPin)){
            while(true){
                System.out.println("1. View Available Blance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Ministatement\n5. Exit");
                System.out.print("Enter the choice ::");
                int ch=sc.nextInt();
                if(ch==1){
                    op.viewBalance();

                }
                else if(ch==2){
                    System.out.println("Enter the Amount to Withdraw::");
                    double withdrawAmount=sc.nextInt();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter the Amount to Deposit::");
                    double depositAmount=sc.nextInt();
                    op.depositAmount(depositAmount);

                }
                else if(ch==4){
                    op.viewMiniStatement();

                }
                else if(ch==5){
                    System.out.println("Collect your Card\nThank you for using ATM machine!!!!");
                    System.exit(0);
                }
                else{
                    System.out.println("Plese Enter correct choice!!!");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM number or Pin!!!!!");
            System.exit(0);
        }
    }
}
