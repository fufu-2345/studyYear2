import java.util.Scanner;

class obj11{

    void start1(int[] a,int[] b){
        int c1=0,c2=0;

        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                c1=1;
            }
        }

        for(int i=0;i<b.length;i++){
            if(b[i]==1){
                c2=1;
            }
        }

        System.out.print(c1+c2);

        
    }
}


class six11 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        obj11 x=new obj11();

        int n1=scan.nextInt();
        int n2=scan.nextInt();

        int[] a=new int[n1];
        int[] b=new int[n2];

        for(int i=0;i<n1;i++){
            a[i]=scan.nextInt();
        }

        for(int i=0;i<n2;i++){
            b[i]=scan.nextInt();
        }

        x.start1(a,b);

    }    
}
