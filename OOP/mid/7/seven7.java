import java.util.Scanner;

class obj7{

    void check(int[] ar){
        int most=1;
        int n=ar.length;

        for(int i=1;i<ar[0]+1;i++){
            int check=1;
            if(ar[0]%i==0){
                System.out.printf("%d ",i);

                for(int j=0;j<n;j++){
                    if(ar[j]%i!=0){
                        check=0;
                    }
                }
                if(check==1){
                    most=i;
                }
                
            }
            
            
        }
    
        System.out.printf("\n\n%d",most);
    }


}

class seven7{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        obj7 x=new obj7();
        int n=scan.nextInt();
        int[] ar=new int[n];

        for(int i=0;i<n;i++){
            ar[i]=scan.nextInt();
        }

        x.check(ar);

    }
}