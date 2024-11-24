import java.util.Scanner;
class two8 {
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        boolean a=true;
        int x0=scan.nextInt();
        int y0=scan.nextInt();

        int x1=scan.nextInt();
        int y1=scan.nextInt();

        int x=scan.nextInt();
        int y=scan.nextInt();

        if (x<x0){
            a=false;
        }
        if(x>x1){
            a=false;
        }
        if (y<y0){
            a=false;
        }
        if(y>y1){
            a=false;
        }

        //System.out.println(a);

        if (a==true){
            System.out.print("Yes");
        }
        if (a==false){
            System.out.print("No");
        }
    }
}