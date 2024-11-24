import java.util.Scanner;
class two7{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int daycap=0;

        System.out.print("วันที่ : ");
        int day=scan.nextInt();

        System.out.print("เดือนที่ : ");
        int mounth=scan.nextInt();

        System.out.print("ปีอะไร : ");
        int year =scan.nextInt();

        System.out.print("จะบวกกี่วัน : ");
        int in=scan.nextInt();
        
        day=day+in;

        switch(mounth){
            case 1:
            daycap=31;
            break;

            case 2:
            // พศ==year-3  คศ==ไม่มีลบ
            if (((year-0)%4)==0){
                daycap=29;
                //System.out.printf("----------%d--\n",year);
            }
            else daycap=28;
            break;
            
            case 3:
                daycap=31;
            break;

            case 4:
                daycap=30;
            break;

            case 5:
                daycap=31;
            break;

            case 6:
                daycap=30;
            break;

            case 7:
                daycap=31;
            break;

            case 8:
                daycap=31;
            break;

            case 9:
                daycap=30;
            break;

            case 10:
                daycap=31;
            break;

            case 11:
                daycap=30;
            break;

            case 12:
                daycap=31;
            break;
        }
        
        while(day>daycap){
            if (mounth>12){
                year++;
                mounth=mounth-12;
            }

            switch(mounth){
                case 1:
                daycap=31;
                break;
    
                case 2:
                if (((year-0)%4)==0){
                        daycap=29;
                        //System.out.printf("----------%d--\n",year);
                    }
                    else daycap=28;
                break;
    
                case 3:
                    daycap=31;
                break;
    
                case 4:
                    daycap=30;
                break;
    
                case 5:
                    daycap=31;
                break;
    
                case 6:
                    daycap=30;
                break;
    
                case 7:
                    daycap=31;
                break;
    
                case 8:
                    daycap=31;
                break;
    
                case 9:
                    daycap=30;
                break;
    
                case 10:
                    daycap=31;
                break;
    
                case 11:
                    daycap=30;
                break;
    
                case 12:
                    daycap=31;
                break;
            }
            day=day-daycap;
            mounth++;
            }

        if (mounth>12){
            year++;
            mounth=mounth-12;
        }

        System.out.print(day);
        System.out.print("/");
        System.out.print(mounth);
        System.out.print("/");
        System.out.print(year);    
    }
}