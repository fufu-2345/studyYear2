import java.util.Scanner;


class three6{


    static boolean compare(int[]x,int[]y){
        boolean check=true;
        int n=x.length;

        if(n!=y.length){
            System.out.printf("Wrong size\n");
            return false;
        }
        for(int i=0;i<n;i++){

            if (check==false){
                System.out.print("\n");
                return false;
            }
            check=false;
            System.out.printf("\n\ncheck %d \n",x[i]);

            for(int j=0;j<n;j++){

                if(y[j]==-9999){
                    System.out.printf("removed ");
                }
                else{
                    System.out.printf("%d ",y[j]);
                }

                if(x[i]==y[j]){
                    y[j]=-9999;
                    check=true;
                    System.out.printf("\nfounded");
                    break;
                }
                
            }
        }
        System.out.print("\n\n");
        return true;
    }



    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        int[]A={18,3,48,2,18,78,9};
        int[]B={9,18,3,18,48,2,78};

        System.out.print(compare(A,B));

    }

    
};