import java.util.Scanner;

class ob57{
    
    void sum2(int[] ar){
        System.out.print(ar[0]+ar[1]);
    }

};

public class five7 {
  
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    ob57 x=new ob57();
    
    int n=scan.nextInt();

    if(n==0){
        System.out.printf("0");
    }
    else {
        int[] ar=new int[n];
        for (int i=0;i<n;i++) {
            ar[i]=scan.nextInt();
        }
        x.sum2(ar);
        
      }
    }
    

};
