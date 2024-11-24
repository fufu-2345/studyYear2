import java.util.Scanner;




class two11{


    static double average(int[]arr,int n){

        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum=sum/n;
    }

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int[]list=new int[50];

        for(int i=0;i<n;i++){
            list[i]=scan.nextInt();
        }

        System.out.print(average(list, n));

        
        


    }


};