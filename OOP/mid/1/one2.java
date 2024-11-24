import java.util.Scanner;


class one2{


    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>40){
            System.out.print (((n-40)*20)+4800);
        } 
        else{
            System.out.print(n*140);
        }

    } 


};
