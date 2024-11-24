import java.util.Scanner;

class one1{
 
    static double fx(int n){
        return (3*Math.pow(n,4)+2*Math.pow(n,3)-n+10);
    }

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.print(fx(n));
    }


};
