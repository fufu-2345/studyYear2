import java.util.Scanner;

class ob56{
    void maxEnd3(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }

        for(int i=0;i<3;i++){
            System.out.print(max+" ");
        }
    }
};

class five6 {
    
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        ob56 x=new ob56();
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        x.maxEnd3(a,b,c);

    }
};
