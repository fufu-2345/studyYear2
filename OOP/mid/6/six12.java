import java.util.Scanner;

class obj12{

    void biggerTwo(int[] a,int[] b){

        for(int i=0;i<2;i++){
            if(b[i]>a[i]){
                a[i]=b[i];
            }
        }

        for(int i=0;i<2;i++){
            System.out.printf("%d ",a[i]);
        }
    }

}

class six12{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        obj12 x=new obj12();
        int[] a=new int[2];
        int[] b=new int[2];

        for(int i=0;i<2;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<2;i++){
            b[i]=scan.nextInt();
        }

        x.biggerTwo(a,b);


    }
}