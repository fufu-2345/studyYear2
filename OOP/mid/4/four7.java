import java.util.Scanner;

class ob7{
    static void re(int i,int arr[],double sum,int n){
        if(i==0){
            sum=sum+arr[i];
            System.out.print(sum/n);
        }
        else{
            sum=sum+arr[i];
            re(i-1,arr,sum,n);
            }
    }
};
class four7{
    public static void main(String args[]){
        boolean e=true;
        ob7 a= new ob7();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n<1 || n>1000000){
            System.out.print("ERROR");
            e=false;
        }
        else{
            int[] arr=new int[15]; 
            double sum=0;
            
            for(int i =0;i<n;i++){
                arr[i]=scan.nextInt();
                if(arr[i]<1 || arr[i]>1000){
                    System.out.print("ERROR");
                    e=false;
                    break;
                }
            }
            if(e==true){
                int i=n;
                a.re(i,arr,sum,n);
            }
        }
    }
};