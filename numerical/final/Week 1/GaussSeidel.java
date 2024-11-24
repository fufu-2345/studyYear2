import java.util.Scanner;

class Seidel{
    int n;
    double[][] mat;
    double[] b;
    double[] x;
    double[] err;
    int count=0;


    void set(int n){
        this.n=n;
        this.mat=new double[n][n];
        this.b=new double[n];
        this.x=new double[n];
        this.err=new double[n];

    }

    void setmat(double mat[][]){
        this.mat=mat;
    }

    void setx(double x[]){
        this.x=x;
    }

    void setb(double b[]){
        this.b=b;
    }

    double er(double a,double b){
        return Math.abs((a-b)/a);
    }

    void cal(){
        double temp=0;
        for(int i=0;i<this.n;i++){
            double sum=0;
            for(int j=0;j<this.n;j++){
                if(i!=j){
                    sum+=this.mat[i][j]*this.x[j];
                }
            }
            temp=(this.b[i]-sum)/this.mat[i][i];
            this.err[i]=er(temp,this.x[i]);
            this.x[i]=temp;
        }

        this.count++;
        System.out.printf("%d | ",this.count);
        for(int i=0;i<this.n;i++){
            System.out.printf("%.6f ",this.x[i]);
        }
        System.out.printf("\n");
    }

    
    void loop(){
        int c=0;
        cal();
        while(c!=1){
            c=1;
            for(int i=0;i<this.n;i++){
                if(this.err[i]>0.000001){
                    c=0;
                    break;
                }
            }
            cal();
        }

        System.out.printf("\n\n%d | ",this.count);
        for(int i=0;i<this.n;i++){
            System.out.printf("%.6f ",this.x[i]);
        }
        
    }

}

class GaussSeidel{

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Seidel a=new Seidel();

        System.out.printf("Size: ");
        int n=scan.nextInt();
        a.set(n);

        double mat[][]=new double[n][n];
        System.out.printf("matrix\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=scan.nextDouble();
            } 
        }
        a.setmat(mat);

        System.out.printf("b: ");
        double[] b=new double[n];
        for(int i=0;i<n;i++){
            b[i]=scan.nextDouble();
        } 
        a.setb(b);

        System.out.printf("intitial x: ");
        double[] x=new double[n];
        for(int i=0;i<n;i++){
            x[i]=scan.nextDouble();
        } 
        a.setx(x);

        a.loop();

    }
}