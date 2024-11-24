import java.util.Scanner;

class ob58{
    void middleWay(int a[],int b[]){
        System.out.printf("%d %d",a[1],b[1]);
    }
};

class five8 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        ob58 x=new ob58();
        int[] a=new int[3];
        int[] b=new int[3];
        for(int i=0;i<3;i++){
            a[i]=scan.nextInt();
        }

        for(int i=0;i<3;i++){
            b[i]=scan.nextInt();
        }

        x.middleWay(a,b);

    }
    
};
