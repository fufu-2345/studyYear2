import java.util.Scanner;



class two12{


    static int main2(){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        if(n<1 || n>1000){
            System.out.printf("Wrong input");
            return -1;
        }

        short[] x=new short[1001];
        short[] y=new short[1001];
        short[] r=new short[1001];

        System.out.printf("\n");
        for(int i=0;i<n;i++){
            System.out.printf("i = %d\n",i+1);
            x[i]=scan.nextShort();
            y[i]=scan.nextShort();
            r[i]=scan.nextShort();
            System.out.printf("\n");
            if(x[i]<-2000 || x[i]>2000 || y[i]<-2000 || y[i]>2000 || r[i]<1 || r[i]>10){
                System.out.printf("Wrong input");
                return -2;
            }
        }

        int stack=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            
                if(r[i]>r[j]){
                    if(  (x[j] <= (x[i]+r[i]))   &&   (x[j] >= (x[i]-r[i]))   &&   (y[j] <= (y[i]+r[i]))   &&   (y[j] >= (y[i]-r[i]))  && i!=j){
                        stack++;
                    }
                }
            }
        }
        
        return stack;
    }


    public static void main(String args[]){
        System.out.print(main2());
    }


};
