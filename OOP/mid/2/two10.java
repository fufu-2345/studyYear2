import java.util.Scanner;

class two10{

    static double convert(double time){
        Scanner scan=new Scanner(System.in);
        double Time=(int)time;
        time=time-Time;
    
        System.out.printf("%f %f\n",Time,time);
        return (Time*5)+(time*100/12);
    }

    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
    
        System.out.print("time : ");
        double time=scan.nextDouble();

        System.out.print(convert(time));


    }




};
