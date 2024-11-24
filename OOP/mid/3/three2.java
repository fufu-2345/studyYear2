import java.util.Scanner;

class three2{

    static int sumDouble(int x,int y){
        if(x==y){
            return (x*2)+(y*2);
        }
        return (x+y);
    }

    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        System.out.print(sumDouble(x,y));
    }
};