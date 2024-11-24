import java.util.Scanner;

class Conju{
    double[][] a;
    int n;
    double[] b;
    double[] x;

    double r[];
    double d[];
    double lam;
    double al=0;

    void setmat(double a[][],double b[],double x[],int n){
        this.a=a;
        this.n=n;
        this.b=b;
        this.x=x;
        
        this.r=new double[this.n];
        for(int i=0;i<this.n;i++){
            this.r[i]=0;
        }

        this.d=new double[this.n];
        for(int i=0;i<this.n;i++){
            this.d[i]=0;
        }
    
    }

    void R(){
        for(int i=0;i<this.n;i++){
            double sum=0;
            for(int j=0;j<this.n;j++){
                sum+=(this.a[i][j]*this.x[j]);
            }
            this.r[i]=sum-this.b[i];
        }

        System.out.printf("R: ");
        for(int i=0;i<n;i++){
            System.out.printf("%.6f ",r[i]);
        }
        System.out.printf("\n");
    }

    void D(){
        for(int i=0;i<this.n;i++){
            this.d[i]=(-1*this.r[i])+(this.al*d[i]);
        }
        
        System.out.printf("D: ");
        for(int i=0;i<this.n;i++){
            System.out.printf("%.6f ",d[i]);
        }
        System.out.printf("\n");
    }

    void lam(){
        double a=0,c=0;
        double[] b=new double[this.n];

        for(int i=0;i<this.n;i++){
            b[i]=0;
        }

        for(int i=0;i<this.n;i++){
            a+=this.d[i]*this.r[i];
        }

        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                b[i]+=this.a[i][j]*this.d[j];
            }
        }

        for(int i=0;i<this.n;i++){
            c+=this.d[i]*b[i];
        }

        this.lam= (a/c)*-1;
        System.out.printf("lam: %.6f\n",this.lam);
        
    }

    void x(){
        for(int i=0;i<this.n;i++){
            this.x[i]=this.x[i]+(lam*this.d[i]);
        }

        System.out.printf("x: ");
        for(int i=0;i<this.n;i++){
            System.out.printf("%.6f ",x[i]);
        }
        System.out.printf("\n");
    }

    double err(){
        double sum=0;
        for(int i=0;i<this.n;i++){
            sum+=r[i]*r[i];
        }
        sum= Math.sqrt(sum);
        System.out.printf("error: %.6f\n\n",sum);
        return sum;
    }

    void alpha(){
        double[] a=new double[this.n];
        double[] c=new double[this.n];
        double b=0,d=0;
        

        for(int i=0;i<this.n;i++){
            a[i]=0;
        }
        for(int i=0;i<this.n;i++){
            c[i]=0;
        }


        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                a[i]+=this.a[i][j]*this.d[j];
            }
        }

        for(int i=0;i<this.n;i++){
            b+=this.r[i]*a[i];
        }

        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                c[i]+=this.a[i][j]*this.d[j];
            }
        }

        for(int i=0;i<this.n;i++){
            d+=this.d[i]*c[i];
        }
        this.al=b/d;
        System.out.printf("alpha: %.6f\n",this.al);
    }

}


class Conjugate  {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Conju c=new Conju();
        System.out.printf("Size: ");
        int n=scan.nextInt();

        double[][] A=new double[n][n];
        System.out.printf("mat:\n");
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=scan.nextInt();
            }
        }

        double[] B=new double[n];
        System.out.printf("B: ");
        for(int i=0;i<n;i++){
            B[i]=scan.nextInt();
        }

        double[] X=new double[n];
        System.out.printf("X: ");
        for(int i=0;i<n;i++){
            X[i]=scan.nextInt();
        }

        c.setmat(A,B,X,n);
        System.out.printf("\n\n");

        System.out.printf("Iteration: 1\n");

        c.R();
        c.D();
        c.lam();
        c.x();
        c.R();

        double err=0;
        err=c.err();

        

        
        for(int i=1;err>0.000001;i++){
            System.out.printf("Iteration: %d\n",i+1);
            c.alpha();
            c.D();
            c.lam();
            c.x();
            c.R();
            err=c.err();
        }
    }

    
}
