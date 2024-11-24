import java.util.Scanner;
class three4{

    static boolean sum28(int[]arr,int n){
        int temp=0;
        
        for(int i=0;i<n;i++){
            if (arr[i]==2){
                temp=temp+2;
            } 
        }
        if (temp==8){
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

        System.out.print(sum28(arr,n));


    }

};