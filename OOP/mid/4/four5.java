import java.util.Scanner;


class ob5{
    static int re(int i,int arr[]){
        if(i==0){
            return arr[0];
        }
        else{
            if(arr[i]>re(i-1,arr)){
                return arr[i];
            }
            return re(i-1,arr);
        }
    }

}

class four5{
    public static void main(String args[]){
        ob5 a=new ob5();
        System.out.printf("Enter size of the list : ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[9];

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        
        int i=n;
        System.out.printf("The largest number in the list is : %d",a.re(i,arr));

    }

};