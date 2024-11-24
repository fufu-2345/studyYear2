import java.util.Scanner;

class Inter{
    double[] ar=new double[100];
    double[] x;
    int n;
    

    void set(int n){
        this.n=n;
        ar[1]=9.81;
        ar[2]=9.7487;
        ar[3]=9.6879;
        ar[4]=9.6879;
        ar[5]=9.5682;
        x=new double[this.n];
        x[1]=0;
        x[2]=20000;
        x[3]=40000;
        x[4]=60000;
        x[5]=80000;

        for(int i=6;i<100;i++){
            ar[i]=0;
        }
    }

    double c1(int a,int b,int n){
        if(a-b==1){
            if(this.ar[countfloor(n)+a]!=0){
                System.out.printf("knowed\n");
                return this.ar[countfloor(n)+a];
            }
            else {
                this.ar[countfloor(n)+a]=(this.ar[b]-this.ar[a]) / (x[b]-x[a]);
                return (this.ar[countfloor(n)+a]);
            }
        }
        else{
            return ((this.ar[b]-this.ar[a]) / (x[b]-x[a]));
        }
        
    }

    double c2(int a,int b,int c,int n){
        if(this.ar[countfloor(n)+a]!=0){
            System.out.printf("knowed2\n");
            return this.ar[countfloor(n)+a];
        }
        else {
            this.ar[countfloor(n)+a]=(c1(b,c,n-1)-c1(a,b,n-1)) / (this.x[c]-this.x[a]);
            return (this.ar[countfloor(n)+a]);
        }
    }
    
    

    double linear(double x,int a,int b,int n){
        return this.ar[1]+c1(a,b,n)*(x-this.x[1]);
    }

    double quad(double x,int a,int b,int c,int n){
        return this.ar[1]+c1(a,c,n-1)*(x-this.x[1])+c2(a,b,c,n)*(x-this.x[1])*(x-this.x[2]);
    }

    double pol(int a,int b,int x,int n){

        double sum = this.ar[1];
        double xx = 1;

        System.out.printf("0: %.20f\n", sum);

        for (int i = 1; i <= n+1; i++) {
            xx *= (x - this.x[i]);
            sum += poly(1, i + 1, i - 1) * xx;
        }

        return sum;
    }

    double poly(int a,int b,int n){
        if(n==0){
            return c1(b,a,n);
        }
        
        else {
            double t=(poly(a+1,b,n-1)-poly(a,b-1,n-1))/(x[b]-x[a]);
            return t; 
        }
    }
    
    int countfloor(int n){
        int sum=5,init=4;
        for(int i=0;i<n;i++){
            sum+=init--;
        }
        return sum;
    }

}



class Interpolation{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        Inter s=new Inter();
        int a=0,b=0,c=0,x=0;
        char e=' ';
        s.set(6);

        while(e!='e'){
            System.out.printf("l: Linear\tq: quadratic\tp: polynomial\n");
            e=scan.next().charAt(0);
            if(e=='l'){
                System.out.printf("enter a b x\n");
                a=scan.nextInt();
                b=scan.nextInt();
                x=scan.nextInt();
                System.out.printf("linear: %.6f\n\n",s.linear(x,a,b,0));
            }
            else if(e=='q'){
                System.out.printf("enter a b c x\n");
                a=scan.nextInt();
                b=scan.nextInt();
                c=scan.nextInt();
                x=scan.nextInt();
                System.out.printf("quadratic: %.6f\n\n",s.quad(x,a,b,c,1));
            }
            else if(e=='p'){
                System.out.printf("enter a b x\n");
                a=scan.nextInt();
                b=scan.nextInt();
                x=scan.nextInt();
                System.out.printf("Polynomai: %.30f\n\n",s.pol(a,b,x,b-a-1));
            }
        }

    }
}