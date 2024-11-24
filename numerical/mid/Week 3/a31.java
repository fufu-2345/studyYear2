import java .util.Scanner;
////////   Newton Rapson

class ob31{

    double fxx(double x){
        return x*2;
    }

    double fx(double x){
        return (x*x)-7;
    }

};

class a31{

    public static void main(String args[]){
        ob31 a=new ob31();
        Scanner scan=new Scanner(System.in);
        double x =scan.nextDouble();

        double xold=(x-(a.fx(x)/a.fxx(x)));
        System.out.println(xold);

        double xnew=(xold-(a.fx(xold)/a.fxx(xold)));
        System.out.println(xnew);

        if((xnew>0||xnew<0) && (xold>0||xold<0)){
            while(xnew>0||xnew<0||xold>0||xold<0){
                double temp =xnew-xold;
                if (temp>0){
                    if(temp<0.0000001){
                        break;
                    }
                }
                else if(temp<0){
                    if(temp>-0.0000001){
                        break;
                    }
                }
                xold=xnew;
                xnew=(xold-(a.fx(xold)/a.fxx(xold)));
                System.out.println(xnew);
                
            }
        }

        else{
            System.out.printf("ERROR\n");
        }
    }
};
