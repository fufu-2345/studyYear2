import java.util.Scanner;

class ob10{
    boolean has23(int arr[]){
        if(arr[0]==2||arr[0]==3||arr[1]==2||arr[1]==3){
            return true;
        }

        else{
            return false;
        }
    }

};


class five10 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        ob10 x=new ob10();
        int[] arr=new int[2];
        arr[0]=scan.nextInt();
        arr[1]=scan.nextInt();
        System.out.print(x.has23(arr));
    }   

}
