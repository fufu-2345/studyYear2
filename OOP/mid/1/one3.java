import java.util.Scanner;


class one3{


    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int[]arr= new int[5];

        arr[0]=scan.nextInt();
        arr[1]=scan.nextInt();
        arr[2]=scan.nextInt();

        int max=arr[0];
        if(arr[1]>max){
            max=arr[1];
        }

        if(arr[2]>max){
            max=arr[2];
        }

        System.out.print(max);

    }




};