import java.util.Scanner;

class obj12{

    void stringTime(String a,int n){
        String sum="";
        
        if(a.length() >=3){
            String temp=""+a.charAt(0)+a.charAt(1)+a.charAt(2);
            for(int i=0;i<n;i++){
                sum+=temp;
            }
        }
        else{
            for(int i=0;i<n;i++){
                sum+=a;
            }
        }
        

        System.out.printf(sum);
    }

}

class seven12 {
    public static void main(String[] args) {
        obj12 x=new obj12();
        Scanner scan=new Scanner(System.in);
        System.out.printf("enter name: "); 
        String str=scan.nextLine();
        System.out.printf("enter how much: ");
        int n=scan.nextInt();

        x.stringTime(str,n);



    }
}
