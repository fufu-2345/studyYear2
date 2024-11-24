import java.util.Scanner;

class three7{

    static int check(int a,int b){
        int x=a;
        for(int i=1;i<b;i++){
            x=x*a;
        }
        return x;
    }



    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        if(a<0||a>200||b<0||b>200){
            System.out.print("Out of range");
        }
        else{
            System.out.print(check(a,b));
        }

    }


};