import java.util.Scanner;

class two6{



    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;

        if(n<0 || n>1000){
            System.out.print("Out of range");
        }
        else{
            while(n>10){
                sum=sum+n%10;
                n=n/10;
            }
            sum=sum+n;
            System.out.print(sum);
        }
        

    }




};