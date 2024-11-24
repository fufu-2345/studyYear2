import java.util.Scanner;

class two9{



    public static int main2(){
        Scanner in=new Scanner(System.in);  
        int x=0,y=0;
        int n=in.nextInt();
        int[]arr=new int[50];
        if(n<1 || n>1000){
            System.out.printf("Wrong input\n");
            return -1;
        }

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            if(arr[i]<0){
                System.out.printf("Wrong input\n");
                return -2;
            }

            if(arr[i]%4==1){
                y=y+1;
            }
            else if(arr[i]%4==2){
                x=x-1;
            }
            else if(arr[i]%4==3){
                x=x+1;
            }
            else if(arr[i]%4==0){
                y=y-1;
            }
        }

        int x0=in.nextInt();
        int y0=in.nextInt();
        if(x0<-1000 || x0>1000 || y0<-1000 || y0>1000){
            System.out.printf("Wrong input");
            return -3;
        }

        x0=x0+x;
        y0=y0+y;

        System.out.printf("%d %d\n",x0,y0);

        return 0;
    }


    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);  
         
        main2();
            
                

        
        
    } 
    




};