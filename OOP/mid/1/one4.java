import java.util.Scanner;

class one4{

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int[]arr= new int[10];

        arr[0]=scan.nextInt();
        arr[1]=scan.nextInt();
        arr[2]=scan.nextInt();
        arr[3]=scan.nextInt();
        arr[4]=scan.nextInt();
        

        int max=arr[0];
        if(arr[1]>max){
            max=arr[1];
        }

        if(arr[2]>max){
            max=arr[2];
        }

        if(arr[3]>max){
            max=arr[3];
        }


        if(arr[4]>max){
            max=arr[4];
        }


        System.out.print(max);
    }





};
