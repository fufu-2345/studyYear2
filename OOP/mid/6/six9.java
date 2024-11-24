import java.util.Scanner;

class obj9{
    void double23(int[] ar){
        int n=ar.length;

        if( n==2 && ar[0]==ar[1] && (ar[0]==2 || ar[0]==3)){
            System.out.printf("true");
        }
        else{
            System.out.printf("false");
        }
        
    }
}

class six9{
    public static void main(String[] args) {
        obj9 x =new obj9();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];

        for(int  i=0;i<n;i++){
            ar[i]=scan.nextInt();
        }

        x.double23(ar);

    }
}