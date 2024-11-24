import java.util.Scanner;

class obj10{
    double sum;

    void sum(double x,double n){
        this.sum=x;
        for(int i=2;i<=n;i++){
            sum+=(  (Math.pow(x,i))   /i);
        }
        System.out.print(sum);
    }


}

class seven10 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        obj10 x=new obj10();
        double a=scan.nextDouble();
        double b=scan.nextDouble();

        x.sum(a,b);

    }    
}
