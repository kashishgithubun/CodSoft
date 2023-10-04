import java.util.Scanner;

 class Atm {
    float Balance;
    int PIN = 2160;

    public void atm() {
        System.out.println("Enter you pin:");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if (PIN == pin) {
            menu();

        } else {
            System.out.println("Enter valid pin");
           atm();
        }
    }

    public void menu() {
        System.out.println("Enter'1'for Check Balance");
        System.out.println("Enter'2'for Withdraw Money");
        System.out.println("Enter'3'for Deposit Money");
        System.out.println("Enter'4'for Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                System.exit(1);
            default:
                System.out.println("Enter valid chocie");

        }
    }

    public void checkBalance() {
        System.out.println("Available Balance is :" + Balance);
        menu();
    }

    public void withdraw() {
          System.out.println("Enter withdraw amount..");
        Scanner sc = new Scanner(System.in);
        int withdraw = sc.nextInt();
        if (Balance<withdraw) {
            System.out.println("Insufficient Balance");

            
        } else {
            Balance=Balance-withdraw;
            System.out.println("Amount Withdraw Sucessfully....");
        }
        menu();

    }

    public void deposit() {
        System.out.println("Enter deposit amount");
        Scanner sc = new Scanner(System.in);
        int deposit = sc.nextInt();
        Balance = Balance + deposit;
        System.out.println("Amount Deposit succesfully....");
        menu();
    }

}

public class AtmMachine {
    public static void main(String args[]) {

        Atm obj=new Atm();
        obj.atm();
    }
}
