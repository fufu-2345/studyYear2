import java.util.Scanner;

class three1{

    static boolean make10(int x,int y){
        if(x==10){
            return true;
        }
        else if (y==10){
            return true;
        }
        else if ((x+y)==10){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        System.out.print(make10(x,y));
        
    }
   
};