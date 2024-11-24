import java.util.Scanner;

class bird {
    Scanner scan = new Scanner(System.in);
    int id;
    String name; 
    String color;
    int birdSize;
    String type;
    int power;

    void bomb() {
        System.out.print("Bomb!\n\n");
    }

    bird() {
        id = 0;
        name = ""; 
        color = "";
        birdSize = 0;
        type = "";
        power = 0;
    }

    bird(int ID,String Name,String Color,int Size,String Type) {
        id = ID;
        name = Name; 
        color = Color;
        birdSize = Size;
        type = Type;
        power = 0;
    }

    void getBird() {
        System.out.print("id = ");
        int ID = scan.nextInt();
        scan.nextLine();

        System.out.print("name = ");
        String Name = scan.nextLine();

        System.out.print("color = ");
        String Color = scan.nextLine();

        System.out.print("size = ");
        int Size = scan.nextInt();
        scan.nextLine();

        System.out.print("type = ");
        String Type = scan.nextLine();

        System.out.print("\n");

        bird updatedObject = new bird(ID,Name,Color,Size,Type);

        this.id = updatedObject.id;
        this.name = updatedObject.name;
        this.color = updatedObject.color;
        this.birdSize = updatedObject.birdSize;
        this.type = updatedObject.type;
    }

    void setbirdid(){
        int temp=scan.nextInt();
        this.id = temp;
    }

    void setbirdname(){
        String temp=scan.nextLine();
        this.name = temp;
    }

    void setbirdcolor(){
        String temp=scan.nextLine();
        this.color = temp;
    }

    void setbirdsize(){
        int temp=scan.nextInt();
        this.birdSize= temp;
    }
    void setbirdtype(){
        String temp=scan.nextLine();
        this.type = temp;
    }

    void getbirdid(){
        System.out.println(id);
    }

    void getbirdname(){
        System.out.println(name);
    }

    void getbirdcolor(){
        System.out.println(color);
    }

    void getbirdsize(){
        System.out.println(birdSize);
    }
    void getbirdtype(){
        System.out.println(type);
    }

    void showBirdDetails() {
        System.out.printf("\nid = %d \nname = %s \ncolor = %s \nsize = %d \ntype = %s \npower = %d \n\n",id,name,color,birdSize,type,power);
    }

}

class background {
    Scanner scan=new Scanner(System.in);
    private int id;
    private String name;
    private int numBuilding;

    

    background() {
        id = 0;
        name = "";
        numBuilding = 0;
    }

    background(int ID,String Name,int NumBuilding) {
        this.id = ID;
        this.name = Name;
        this.numBuilding = NumBuilding;
    }

    void getBuilding(){
        System.out.print("id = ");
        int ID = scan.nextInt();
        scan.nextLine();

        System.out.print("name = ");
        String Name = scan.nextLine();

        System.out.print("num building = ");
        int NumBuilding = scan.nextInt();

        System.out.print("\n");

        background updatedObject = new background(ID,Name,NumBuilding);

        this.id = updatedObject.id;
        this.name = updatedObject.name;
        this.numBuilding = updatedObject.numBuilding;
    }

    void getbgid(){
        System.out.println(id);
    }

    void getbgname(){
        System.out.println(name);
    }

    void getbgnum(){
        System.out.println(numBuilding);
    }

    void setbgid(){
        int temp=scan.nextInt();
        this.id= temp;
    }
    void setbgname(){
        String temp=scan.nextLine();
        this.name = temp;
    }
    void setbgnum(){
        int temp=scan.nextInt();
        this.numBuilding = temp;
    }

    void showBgDetails(){
        System.out.printf("\nid = %d \nname = %s \nnumBuilding = %d\n\n",id,name,numBuilding);
    }

    void paintBg(){
        System.out.print("Now painting Background\n\n");
    }

}

class five12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        bird bir = new bird();
        background bac = new background();

        while (true) {
            System.out.print("bird : s = setbird g = getbird b = bomb n = showdetail\n");
            System.out.print("background : S = setbackground G = getbackground P = paint M = showdetail\n");
            char n = scan.next().charAt(0);
            scan.nextLine();

            if (n == 'e') {
                break;
            } 
            else if (n == 'b') {
                bir.bomb();
            } 
            else if (n == 's') {
                System.out.print("I=Id N=Name C=Color S=Birdsize T=Type\n");
                char t=scan.next().charAt(0);
                if(t=='I'){
                    bir.setbirdid();
                }
                if(t=='N'){
                    bir.setbirdname();
                }
                if(t=='C'){
                    bir.setbirdcolor();
                }
                if(t=='S'){
                    bir.setbirdsize();
                }
                if(t=='T'){
                    bir.setbirdtype();
                }
                else if (n == 'g') {

                    System.out.print("I=Id N=Name C=Color S=Birdsize T=Type\n");
                    char T=scan.next().charAt(0);
                    if(t=='I'){
                        bir.getbirdid();
                    }
                    if(t=='N'){
                        bir.getbirdname();
                    }
                    if(t=='C'){
                        bir.getbirdcolor();
                    }
                    if(t=='S'){
                        bir.getbirdsize();
                    }
                    if(t=='T'){
                        bir.getbirdtype();
                    }
                
                
                } 
            }
            else if (n == 'n') {
                bir.showBirdDetails();
            }
            else if (n == 'S') {
                System.out.print("I=Id N=Name M=numBuilding\n");
                char t=scan.next().charAt(0);
                if(t=='I'){
                    bac.setbgid();
                }
                if(t=='N'){
                    bac.setbgname();
                }
                if(t=='M'){
                    bac.setbgnum();
                }
            }

            else if (n == 'G') {
                System.out.print("I=Id N=Name M=numBuilding\n");
                    char R=scan.next().charAt(0);
                    if(R=='I'){
                        bac.getbgid();
                    }
                    if(R=='N'){
                        bac.getbgname();
                    }
                    if(R=='M'){
                        bac.getbgnum();
                    }
            } 
            else if (n == 'M') {
                bac.showBgDetails();
            }
            else if (n == 'P') {
                bac.paintBg();
            }
        }
    }

};