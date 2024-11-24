import java.util.Scanner;


class three5{


    
    static boolean more14(int[]arr,int n){
        int one=0;
        int four=0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                one++;
            }
            if(arr[i]==4){
                four++;
            }
        }

        if(one>four){
            return true;
        }
        return false;
    }




    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int[]arr=new int[50];
        int n=scan.nextInt();

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        System.out.print((more14(arr,n)));


    }


};