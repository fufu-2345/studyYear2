import java.util.Scanner;
class three3{

    static int diff21(int x){

        if(x>21){
            return (x-21)*2;
        }
        return 21-x;
        
    }

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        System.out.print(diff21(x));
    }
};