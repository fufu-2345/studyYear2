import java.util.Scanner;

class obj13{
    void makeMiddle(int[] ar){
        int n=(ar.length)/2;
        System.out.print(n);
        //System.out.printf("%d %d",ar[n-1],ar[n]);
    }
}

class six13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        obj13 x=new obj13();
        int n=scan.nextInt();
        int[] ar=new int[n];

        for(int i=0;i<n;i++){
            ar[i]=scan.nextInt();
        }

        x.makeMiddle(ar);

    }
}
