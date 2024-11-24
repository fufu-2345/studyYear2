import java.util.Scanner;

class one5{

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n<100||n>999){
            System.out.print("Wrong input");
        }
        else{
            System.out.print(n%10);
            n=n/10;

            System.out.print(n%10);
            n=n/10;

            System.out.print(n%10);
        }
    }





};