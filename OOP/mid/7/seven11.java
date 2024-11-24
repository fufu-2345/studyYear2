import java.util.Scanner;

class obj11{

    void stringTime(String a,int n){
        String sum="";
        for(int i=0;i<n;i++){
            sum+=a;
        }

        System.out.printf(sum);
    }

}

class seven11 {
    public static void main(String[] args) {
        obj11 x=new obj11();
        Scanner scan=new Scanner(System.in);
        System.out.printf("enter name: "); 
        String str=scan.nextLine();
        System.out.printf("enter how much: ");
        int n=scan.nextInt();

        x.stringTime(str,n);



    }
}
