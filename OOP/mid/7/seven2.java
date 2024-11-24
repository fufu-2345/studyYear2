import java.util.Scanner;

class matrix{
    int n;

    void set(int n){
        this.n=n;
    }

    int get(){
        return n;
    }

    float mean(float m[][]){
        float mean=0;
        for (int i=0;i<this.n;i++){
                mean=mean+m[i][i];
            }
        return mean/n;
    }

    float med(float m[][]){
        int tri=0;
        for(int i=1;i<n+1;i++){
            tri=tri+i;
        }

        float[] med=new float[tri];

        int now=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                med[now]=m[i][j];
                now++;
            }
        }

        float[] newmat=new float[tri];
        int temp=0;
        for(int i=0;i<tri;i++){
            float min=999;
            for(int j=0;j<tri;j++){
                if(med[j]<min){
                    min=med[j];
                    newmat[i]=min;
                    temp=j;
                }
                
            }
            med[temp]=999;
        }
        
        if(tri%2==0){
            return (newmat[tri/2]+newmat[(tri/2)-1])/2;
        }
        else{
            return newmat[tri/2];
        }
    }

    float mode(float m[][]){
        int tri=0,now=0;
        for(int i=1;i<n+1;i++){
            tri=tri+i;
        }
        float[] arr=new float[tri];

        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                arr[now]=m[i][j];
                now++;
            }
        }

        float[] most=new float[2];
        most[0]=0;
        for(int i=0;i<tri;i++){
            int temp=0;
            for(int j=0;j<tri;j++){
                if(arr[j]==arr[i]){
                    temp++;
                }
                if(temp>=most[0]){
                    most[0]=temp;
                    most[1]=arr[i];
                }
            }
        }

        return most[1];
    }

};

class scven2{

    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        matrix mat=new matrix();
        
        mat.set(scan.nextInt());
        float[][] a=new float[mat.get()][mat.get()];
        for (int i=0;i<mat.get();i++){
            for (int j=0;j<mat.get();j++){
                a[i][j]=scan.nextFloat();
            }
        }

        System.out.printf("\n\n%.2f %.2f %.2f\n\n",mat.mean(a),mat.med(a),mat.mode(a));
    }
    
};