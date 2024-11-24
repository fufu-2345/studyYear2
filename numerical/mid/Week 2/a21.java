import java.util.Scanner;
////// One Point Iteration
class ob21{
    double fx(double x){
        return (((x*x)+7)/x)/2;
    }


};

class a21{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        ob21 a=new ob21();
        double x=scan.nextDouble();

        double xold=a.fx(x);
        System.out.println(xold);

        double xnew=a.fx(xold);
        System.out.println(xnew);

        double temp=xnew-xold;

        if ((xold<0||xold>0) && (xnew<0||xnew>0)) {
            while (true) { 
                if(temp>0){
                    if(temp<0.0000001){
                        System.out.println(xnew);
                        break;
                    }
                }
                else if(temp<0){
                    if(temp>-0.0000001){
                        System.out.println(xnew);
                        break;
                    }
                }
                xold=xnew;
                xnew=a.fx(xold);
                System.out.println(xnew);
                temp=xnew-xold;
            }

            
        }
        else{
            System.out.println("ERROR");
        }
    }
    
};
