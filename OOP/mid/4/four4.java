import java.util.Scanner;


class ob4{
    static int re(int n,int sum){
        if(n/10<=0){
            return n; 
        }
        else{
            sum=re(n/10,sum) + n%10;         
            return sum;
        }
    }
}

class four4{

    public static void main(String args[]){
        ob4 a=new ob4();
        System.out.printf("Enter the number : ");
        Scanner scan =new Scanner(System.in);
        int sum=0;
        int n=scan.nextInt();
        System.out.printf("Sum of digits in %d is %d",n,a.re(n,sum));
    }
};