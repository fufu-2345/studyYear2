import java.util.Scanner;

class obj10{

    void fix23(int[] ar){
        for(int i=0;i<3;i++){
            if(ar[i]==2 && ar[i+1]==3){
                ar[i+1]=0;
            }
        }

        for(int i=0;i<3;i++){
            System.out.printf("%d ",ar[i]);
        }

    }

}

class six10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        obj10 x= new obj10();
        int[] ar=new int[3];

        for(int i=0;i<3;i++){
            ar[i]=scan.nextInt();
        }

        x.fix23(ar);

    }
}
