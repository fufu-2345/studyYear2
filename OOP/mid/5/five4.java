import java.util.Scanner;


class ob54{
    void rotateLeft3(int a,int b,int c){
        System.out.printf("%d %d %d\n",b,c,a);
    }

};


class five4 {

    public static void main(String args[]){
        ob54 x =new ob54();
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        x.rotateLeft3(a,b,c);
    }

};