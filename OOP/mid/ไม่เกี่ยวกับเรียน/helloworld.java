

class helloworld{


    public static void main(String args[]){
        char[] a={'H','e','l','l','o',' ','W','o','r','l','d'};
        char[] b=new char[11];
        


        for(int i=0;i<11;i++){
            boolean check =false;
            for(int j=97;j<123;j++){

                try {Thread.sleep(40);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(b[i]==a[i]){
                    check=true;
                    break;
                }

                b[i]=(char)j;

                for(int k=0;k<i+1;k++){
                    System.out.print(b[k]);
                }
                System.out.print("\n");

            }
            
            if(check==false){
                for(int j=65;j<91;j++){
                    if(b[i]==a[i]){
                        check=true;
                        break;
                    }
                    b[i]=(char)j;

                    for(int k=0;k<i+1;k++){
                        System.out.print(b[k]);
                    }
                    System.out.print("\n");
                }
            }

            if(check==false){
                b[i]=' ';
            }

        }
    }

        
};