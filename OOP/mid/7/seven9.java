import java.util.Scanner;

class obj9{
    double[][] ar;

    void getPlayer(double[][] ar){
        this.ar=ar;
    }

    void print(){
        list();
        int now=0;

        for(int i=0;i<10;i++){
            double n=ar[i][1];
            if(n<20){
                System.out.printf("ID: %.2f\tTime:%.2f\n",ar[i][0],n);
                now=i;
            }
            else {
                break;
            }
        }
        now++;

        System.out.printf("not finished\n");
            for(int i=now;i<10;i++){
                System.out.printf("ID: %.2f\tTime:%.2f\n",ar[i][0],ar[i][1]);
            }
        

    }

    void list(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9-i;j++){
                if(this.ar[j][1]>this.ar[j+1][1]){
                    swap(j,j+1);
                }
            }
        }
    }

    void swap(int a,int b){
        double temp=this.ar[a][0];
        double temp2=this.ar[a][1];

        this.ar[a][0]=this.ar[b][0];
        this.ar[a][1]=this.ar[b][1];

        this.ar[b][0]=temp;
        this.ar[b][1]=temp2;
    }


}

class seven9 {
    public static void main(String[] args) {
        obj9 x=new obj9();
        Scanner scan=new Scanner(System.in);
        double[][] ar=new double[10][10];

        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                ar[i][j]=scan.nextDouble();
            }
        }

        x.getPlayer(ar);
        x.print();

    }  
}
