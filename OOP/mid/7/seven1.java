import java.util.Scanner;

class player{
    int n;
    int last=0;
    void set(int n){
        this.n=n;
    }
    void setlast(int last){
        this.last=last;
    }

    int get(){
        return this.n;
    }

};

class seven1{

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int n=0;
        player hoo=new player();
        player sta=new player();

        System.out.printf("N : ");
        int N=scan.nextInt();
        

        System.out.printf("hootin card: ");
        n=scan.nextInt();
        hoo.set(n);
        hoo.setlast(n);


        System.out.printf("staary card: ");
        n=scan.nextInt();
        sta.set(n);
        sta.setlast(n);

        System.out.printf("\n");
        for(int i=0;i<N;i++){
            if(i%2==0){
                n=pick(n,hoo.last);
                hoo.last=n;
                hoo.set(n+hoo.get());
                System.out.printf("hootin : %d\n",hoo.get());
                
            }
            else{
                n=pick(n,sta.last);
                sta.last=n;
                sta.set(n+sta.get());
                System.out.printf("staary : %d\n",sta.get());
            }
        }

        System.out.printf("\nFinal\nhootin : %d\tstaary : %d",hoo.get(),sta.get());

    }

    static int pick(int a,int b){
        return a+b;
    }

};