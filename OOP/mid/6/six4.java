import java.util.Scanner;

class MyRectangle2D{
    double x,y;
    double width,height;

    MyRectangle2D(){
        x=0.0;
        y=0.0;
        width=1.0;
        height=1.0;
    }

    void getxy(){
        System.out.printf("x : %f\ty : %f\n",x,y);
    }
    

    void setxy(double x,double y){
        this.x=x;
        this.y=y;
    }

    void getwh(){
        System.out.printf("w : %f\th : %f\n",width,height);
    }

    void setwh(double w,double h){
        this.width=w;
        this.height=h;
    }

    double getArea(){
        return(width*height);
    }
    double getPerimeter(){
        return( (width*2) + (height*2) );
    }
    boolean contains(double x,double y){
        double left=this.x-(width/2);
        double right=this.x+(width/2);
        double top=this.y+(height/2);
        double bottom=this.y-(height/2);
        
        if(x>=left && x<=right && y>=bottom && y<=top){
            return true;
        }
        else{
            return false;
        }
    }

    boolean Contains(double x,double y,double r){
        double left=this.x-(width/2);
        double right=this.x+(width/2);
        double top=this.y+(height/2);
        double bottom=this.y-(height/2);

        
        
        if(x-(r/2)>=left && x+(r/2)<=right && y-(r/2)>=bottom && y+(r/2)<=top){
            return true;
        }
        else{
            return false;
        }
    }
    boolean overlaps(double x,double y,double r){
        double left=this.x-(width/2);
        double right=this.x+(width/2);
        double top=this.y+(height/2);
        double bottom=this.y-(height/2);

        
        
        if( (x-(r/2)>=left && y+(r/2)<=top) || (x+(r/2)<=right && y+(r/2)<=top) || (x-(r/2)>=left && y-(r/2)>=bottom) || (x+(r/2)<=right && y-(r/2)>=bottom) ){
            return true;
        }
        else{
            return false;
        }
    }

};

class six4{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        MyRectangle2D rec=new MyRectangle2D();
        double a,b,r;

        while(true){
            System.out.print("\nx,y\tg=get  s=set\nw,h\tG=get  S=set\nmethod\t A=getarea  P=getperimeter  c=contains_point  C=contains_square  O=overlaps\n\n");
            char u=scan.next().charAt(0);
            System.out.print("\n");
            if(u=='e'){
                break;
            }
            else if(u=='g'){
                rec.getxy();
            }
            else if(u=='s'){
                System.out.print("x : ");
                a=scan.nextDouble();
                System.out.print("y : ");
                b=scan.nextDouble();
                rec.setxy(a,b);
            }
            else if(u=='G'){
                rec.getwh();
            }
            else if(u=='S'){
                System.out.print("width : ");
                a=scan.nextDouble();
                System.out.print("height : ");
                b=scan.nextDouble();
                rec.setwh(a,b);
            }
            else if(u=='A'){
                System.out.printf("Area : %f\n",rec.getArea());
            }
            else if(u=='P'){
                System.out.printf("Perimeter : %f\n",rec.getPerimeter());
            }
            else if(u=='c'){
                System.out.printf("x : ");
                a=scan.nextDouble();
                System.out.printf("y : ");
                b=scan.nextDouble();
                System.out.printf("Contains : %b\n",rec.contains(a,b));
            }
            else if(u=='C'){
                System.out.printf("x : ");
                a=scan.nextDouble();
                System.out.printf("y : ");
                b=scan.nextDouble();
                System.out.printf("r : ");
                r=scan.nextDouble();
                System.out.printf("Contains : %b\n",rec.Contains(a,b,r));
            }
            else if(u=='O'){
                System.out.printf("x : ");
                a=scan.nextDouble();
                System.out.printf("y : ");
                b=scan.nextDouble();
                System.out.printf("r : ");
                r=scan.nextDouble();
                System.out.printf("Contains : %b\n",rec.overlaps(a,b,r));
            }
            
        }
        scan.close();
    }
};
