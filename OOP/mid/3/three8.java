import java.util.Scanner;

class three8{

    static int check(int in){
        int temp=0;
        if(in<0 || in>1000){
            System.out.print("Out of range");
            return 0;
        }


        while(true){
            temp=temp+(in%10);
            in=in/10;
            if(in<10){
                temp=temp+in;
                System.out.print(temp);
                return 0;
            }
  
        
        }
    }



    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);



        
        int in= scan.nextInt();
        check(in);

        



    }
};