import java.util.Scanner;
/////////   Secant Method

class ob2{

    double fx(double x){
        return (x*x)-7;
    }

    double x2(double x0,double x1){
        return x0-(fx(x0)/( (fx(x1)-fx(x0) )/(x1-x0)));
    }
};


class a32{

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        ob2 a=new ob2();


        double x1,x0=scan.nextDouble();
        if(x0<0){
            x1=x0-(x0*0.1);
        }
        else if (x0>3) {
            x1=x0-(x0/10);
        } 
        else if(x0==0){
            x1=1;
        }
        else {
            x1=x0+(x0/20);
        }


        double xold=a.x2(x0,x1);
        System.out.println(xold);


        x0=x1;
        x1=xold;
        double xnew=a.x2(x0,x1);
        System.out.println(xnew);
        
        if((xold>0||xold<0)&&(xnew>0||xnew<0)){
            while (true){
                double check=xnew-xold;
                if(check>0){
                    if(check<0.0000001){
                        break;
                    }
                }
                else if(check<0){
                    if(check>-0.0000001){
                        break;
                    }
                }
                x0=x1;
                x1=xnew;
                xold=xnew;
                xnew=a.x2(x0,x1);
                System.out.println(xnew);
            }
        }
        else{
            System.out.printf("ERROR\n");
        }

    }
        
};
