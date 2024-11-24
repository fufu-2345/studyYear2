import java.util.Scanner;

class obj8{

    void makeLast(int[] ar){
        int n=ar.length;
        int[] newar=new int[n*2];
        
        for(int i=0;i<(n*2);i++){
            newar[i]=0;
        }
        newar[n*2-1]=ar[n-1];
        
        for(int i=0;i<(n*2);i++){
            System.out.printf("%d ",newar[i]);
        }
    }

}


class six8 {
    public static void main(String[] args) {
        obj8 x=new obj8();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];

        for(int i=0;i<n;i++){
            ar[i]=scan.nextInt();
        }

        x.makeLast(ar);


    }
}



