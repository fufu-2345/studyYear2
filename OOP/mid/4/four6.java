import java.util.Scanner;

class ob6{
    void re(int i,int arr[],int x){
        if(i==0){
            if(arr[i]==x)
            System.out.printf("Key found at position : %d ",i);
            return;
        }

        else{
            if(arr[i]==x){
                System.out.printf("Key found at position : %d ",i+1);
            }
            re(i-1,arr,x);
        }
    }
};


public class four6 {
    public static void main(String args[]){
        ob6 a= new ob6();
        System.out.printf("Enter the size of the list : ");
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int[]arr=new int[15];

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        System.out.printf("Enter the key to search : ");
        int x=scan.nextInt();
        System.out.print("\n");
        
        a.re(n,arr,x);


    }

    
};
