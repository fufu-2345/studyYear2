import java.util.Scanner;

class obj8{
    void check(int[] ar){
        int n=ar.length;
        int find=1;
        for(int i=2;i<1000000;i++){
            int check=0;
            for(int j=0;j<n;j++){
                if(i%ar[j]!=0){
                    check=1;
                    break;
                }
            }
            if(check==0){
                find=i;
                break;
            }
        }
        System.out.printf("%d",find);

    }
}

class seven8 {
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        obj8 x=new obj8();
        int n=scan.nextInt();
        int[] ar=new int[n];


        for(int i=0;i<n;i++){
            ar[i]=scan.nextInt();
        }

        x.check(ar);
        

    }
    

}
