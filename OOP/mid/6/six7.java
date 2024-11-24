import java.util.Scanner;

class obj{
    boolean has23(int arr[]){
        if(arr[0]==2||arr[0]==3||arr[1]==2||arr[1]==3){
            return false;
        }

        else{
            return true;
        }
    }

};


class six7 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        obj x=new obj();
        int[] arr=new int[2];
        arr[0]=scan.nextInt();
        arr[1]=scan.nextInt();
        System.out.print(x.has23(arr));
    }   

}
