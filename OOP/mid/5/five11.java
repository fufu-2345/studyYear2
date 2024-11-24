import java.util.Date;
import java.util.Scanner;

class Ob511 {
    Scanner scan = new Scanner(System.in);
    int id;
    double balance;
    double annualInterestRate;
    Date dateCreated;

    public Ob511() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = null;
    }

    public Ob511(int ID, double BAL, double an) {
        id = ID;
        balance = BAL;
        annualInterestRate = an;
        dateCreated = new Date();
    }

    public void set() {
        System.out.printf("id = ");
        int ID = scan.nextInt();

        System.out.printf("balance = ");
        double BAL = scan.nextDouble();

        System.out.printf("annualInterestRate = ");
        double an = scan.nextDouble();

        Ob511 updatedObject = new Ob511(ID, BAL, an);

        this.id = updatedObject.id;
        this.balance = updatedObject.balance;
        this.annualInterestRate = updatedObject.annualInterestRate;
        this.dateCreated = updatedObject.dateCreated;

        System.out.print("\n");
    }

    public void get() {
        dateCreated = new Date(); 
        System.out.print("\n");
    }

    public void show() {
        System.out.printf("\nid = %d\nbalance = %f\nannualInterestRate = %f\n", id, balance, annualInterestRate);
        System.out.println("Date Created: " + dateCreated + "\n");
    }

    public void getMonthlyInterestRate(){
        System.out.printf("annualInterestRate = %f%%\n\n", annualInterestRate);
    }

    public void getMonthlyInterest(){
        System.out.printf("Monthly Interest = %f\n\n", annualInterestRate * balance / 100);
    }

    public void withdraw(){
        System.out.print("withdraw = ");
        double temp = scan.nextDouble();
        balance -= temp;
        System.out.printf("balance = %f\n\n", balance);
    }

    public void deposit(){
        System.out.print("deposit = ");
        double temp = scan.nextDouble();
        balance += temp;
        System.out.printf("balance = %f\n\n", balance);
    }
}

public class five11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ob511 a = new Ob511();

        while (true) {
            System.out.print("1=set 2=get 3=getMonthlyInterestRate 4=getMonthlyInterest 5=withdraw 6=deposit 7=show 8=break\n");
            char n = scan.next().charAt(0);

            if (n == '8') {
                System.out.print("\n");
                break;
            } 
            else if (n == '1') {
                a.set();
            }
            else if (n == '2') {
                a.get();
            }
            else if (n == '3') {
                a.getMonthlyInterestRate();
            }
            else if (n == '4') {
                a.getMonthlyInterest();
            }
            else if (n == '5') {
                a.withdraw();
            }
            else if (n == '6') {
                a.deposit();
            }
            else if (n == '7') {
                a.show();
            } 
        }

    }
}