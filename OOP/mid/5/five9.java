import java.util.Scanner;

class ob59{
    void makeEnds(int arr[],int n){
        System.out.printf("%d %d",arr[0],arr[n-1]);
    }
};


class five9 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        ob59 x=new ob59();
        int n=scan.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        x.makeEnds(arr,n);

        


    }   

};
