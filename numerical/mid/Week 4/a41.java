import java.util.Scanner;

class ob4{
    int n;
    double[][] mat;
    double[][] temp;
    double[] x;
    double[] xtemp;
    double det;
    
    int checkmat(int i){
        int size=1;
        while(size<=10){
            if((size*size)==i){
                this.n=size;
                return size;
            }
            size++;
        }
        this.n=0;
        System.out.printf("ERROR\n\n");
        return -1;
    }

    void showmat(){
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                System.out.printf("%.2f ",this.mat[i][j]);
            }
            System.out.printf("| %.2f\n",x[i]);
        }
    }

    void getmat(double mat[][]){
        this.mat=mat;
    }

    void setB(double x[]){
        this.x=x;
    }

    void gauss(){
        int e=0; 
        this.temp = new double[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<this.n;j++){
                this.temp[i][j]=this.mat[i][j];
            }
        }

        this.xtemp = new double[this.n];
        for(int i=0;i<this.n;i++){
            this.xtemp[i]=this.x[i];
        }

        for(int i=0;i<(this.n)-1;i++){
            if (this.temp[i][i] == 0) {
                e=1;
            }
            for(int j=i+1;j<this.n;j++){
                double temp2=temp[j][i]/temp[i][i];
    
                for(int k=i;k<n;k++){
                    temp[j][k] =temp[j][k]-(temp2*temp[i][k]);
                }
    
                xtemp[j]=xtemp[j]-(temp2*this.xtemp[i]);

            }
        }
    

        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                System.out.printf("%.2f ",temp[i][j]);
            }
            System.out.printf("| %.2f\n",xtemp[i]);
        }

        double[] result=new double[n];
        for (int i=(this.n)-1;i>= 0;i--){
            result[i]=this.xtemp[i];
            for (int j=i+1;j<this.n;j++){
                result[i]=result[i]-(temp[i][j]*result[j]);
            }
            result[i]=result[i]/temp[i][i];
        }
        if(e==1){
            System.out.printf("\ndivide by zero\n");
        }
        
        else {
            System.out.printf("\n");
            for (int i=0;i<this.n;i++){
                System.out.printf("%.2f ",result[i]);
            }
            System.out.printf("\n");
            
        }
    }

    void jordan(){
        int e=0; 
        this.temp = new double[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<this.n;j++) {
                this.temp[i][j]=this.mat[i][j];
            }
        }

        this.xtemp = new double[this.n];
        for(int i=0;i<this.n;i++) {
            this.xtemp[i]=this.x[i];
        }

        //ล่าง
        for(int i=1;i<this.n;i++){
            if (this.temp[i][i] == 0) {
                e=1;
            }
            for(int j=0;j<i;j++){
                double a=temp[i][j]/temp[j][j];

                for(int k=0;k<this.n;k++){
                    temp[i][k]=temp[i][k]-(temp[j][k]*a);
                }

                this.xtemp[i]=this.xtemp[i]-this.xtemp[j]*a;

                for(int q=0;q<this.n;q++){
                    for(int w=0;w<this.n;w++){
                        System.out.printf("%.2f ",this.temp[q][w]);
                    }
                    System.out.printf("| %.2f\n",this.xtemp[q]);
                }
                System.out.printf("\n");
            }

        }

        //บน
        for(int i=this.n-1;i>=0;i--){
            if (this.temp[i][i] == 0) {
                e=1;
            }
            for(int j=this.n-1;j>i;j--){
                double a=temp[i][j]/temp[j][j];
        
                for(int k=0;k<this.n;k++){
                    temp[i][k]=temp[i][k]-(temp[j][k]*a);
                }
        
                this.xtemp[i]=this.xtemp[i]-this.xtemp[j]*a;
        
                for(int q=0;q<this.n;q++){
                    for(int w=0;w<this.n;w++){
                        System.out.printf("%.2f ",this.temp[q][w]);
                    }
                    System.out.printf("| %.2f\n",this.xtemp[q]);
                }
                System.out.printf("\n");
            }
        }
        
        if(e==1){
            System.out.printf("\ndivide by zero\n");
        }
        
        else {
            for(int i=0;i<n;i++){
                double temp=this.temp[i][i];
                System.out.printf("%.2f ",this.xtemp[i]/temp);
            }
            System.out.printf("\n");
        }
    }

    void inversion(){
        int e=0; 
        this.temp = new double[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<this.n;j++) {
                this.temp[i][j]=this.mat[i][j];
            }
        }
        double[][] inver=new double[this.n][this.n];
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                if(i==j){
                    inver[i][j]=1;
                }
                else{
                    inver[i][j]=0;
                }
            }
        }

        this.xtemp = new double[this.n];
        for(int i=0;i<this.n;i++) {
            this.xtemp[i]=this.x[i];
        }
    
        //ล่าง
        for(int i=1;i<this.n;i++){
            if (this.temp[i][i] == 0) {
                e=1;
            }
            for(int j=0;j<i;j++){
                double a=temp[i][j]/temp[j][j];

                for(int k=0;k<this.n;k++){
                    temp[i][k]=temp[i][k]-(temp[j][k]*a);
                    inver[i][k]=inver[i][k]-inver[j][k]*a;
                }

                ///show
                for(int q=0;q<this.n;q++){
                    for(int w=0;w<this.n;w++){
                        System.out.printf("%.2f ",this.temp[q][w]);
                    }
                    System.out.printf("| ",this.xtemp[q]);
                    for(int w=0;w<this.n;w++){
                        System.out.printf("%.2f ",inver[q][w]);
                    }
                    System.out.printf("\n");
                }

                System.out.printf("\n");
            }

        }
    
        //บน
        for(int i=this.n-1;i>=0;i--){
            if (this.temp[i][i] == 0) {
                e=1;
            }
            for(int j=this.n-1;j>i;j--){
                double a=temp[i][j]/temp[j][j];
            
                for(int k=0;k<this.n;k++){
                    temp[i][k]=temp[i][k]-(temp[j][k]*a);
                    inver[i][k]=inver[i][k]-inver[j][k]*a;
                }
            
                this.xtemp[i]=this.xtemp[i]-this.xtemp[j]*a;
            
                for(int q=0;q<this.n;q++){
                    for(int w=0;w<this.n;w++){
                        System.out.printf("%.2f ",this.temp[q][w]);
                    }
                    System.out.printf("| ",this.xtemp[q]);
                    for(int w=0;w<this.n;w++){
                        System.out.printf("%.2f ",inver[q][w]);
                    }
                    System.out.printf("\n");
                }
                System.out.printf("\n");
            }
        }
        
        for(int i=0;i<this.n;i++){
            double a=this.temp[i][i];
            temp[i][i]=a/a;
            for(int j=0;j<this.n;j++){
                inver[i][j]=inver[i][j]/a;
            }
        }

        for(int q=0;q<this.n;q++){
            for(int w=0;w<this.n;w++){
                System.out.printf("%.2f ",this.temp[q][w]);
            }
            System.out.printf("| ",this.xtemp[q]);
            for(int w=0;w<this.n;w++){
                System.out.printf("%.2f ",inver[q][w]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        if(e==1){
            System.out.printf("\ndivide by zero\n");
        }
        
        else {
            for(int i=0;i<this.n;i++){
                double sum=0;
                for(int j=0;j<this.n;j++){
                    sum=sum+(inver[i][j]*this.x[j]);
                }
                System.out.printf("%.2f ",sum);
            }
            System.out.printf("\n");
        }
    }

    /* 
    void LU(){
        double[][] l=new double[this.n][this.n];
        double[][] u=new double[this.n][this.n];

        for(int i=0;i<this.n;i++){
            for (int j=0;j<this.n;j++) {
                l[i][j]=0;
                if(i==j){
                    u[i][j]=1;
                }
                else {
                    u[i][j]=0;
                }
            }
        }

        for(int i=0;i<this.n;i++){
            l[i][0]=this.mat[i][0];
        }

        u[0][1]=this.mat[0][1]/l[0][0];
        u[0][2]=this.mat[0][2]/l[0][0];

        l[1][1]=this.mat[1][1]-(l[1][0]*u[0][1]);
        l[2][1]=this.mat[2][1]-(l[2][0]*u[0][1]);

        u[1][2]=(this.mat[1][2]-l[1][0]*u[0][2])/l[1][1];
        l[2][2]=this.mat[2][2]-(l[2][0]*u[0][2])-(l[2][1]*u[1][2]);

        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                System.out.printf("%.2f ",l[i][j]);
            }

            System.out.printf("| ");
            for(int j=0;j<this.n;j++){
                System.out.printf("%.2f ",u[i][j]);
            }
            System.out.printf("\n");
        }

        //  L*Y=B
        double y1,y2,y3;
        y1=this.x[0]/l[0][0];
        y2=(this.x[1]-(l[1][0]*y1))/l[1][1];
        y3=(this.x[2]-(l[2][0]*y1)-(l[2][1]*y2))/l[2][2];

        System.out.printf("y1: %.2f  y2: %.2f  y3: %.2f\n",y1,y2,y3);

        double x1,x2,x3;
        x3=y3*u[2][2];
        x2=(y2-(u[1][2]*x3))/u[1][1];
        x1=(y1-(u[0][1]*x2)-(u[0][2]*x3))/u[0][0];
        
        System.out.printf("x1: %.2f  x2: %.2f  x3: %.2f\n",x1,x2,x3);

    }
    */

    void LU() {
        double[][] l=new double[this.n][this.n];
        double[][] u=new double[this.n][this.n];
    
        for(int i=0;i<this.n;i++) {
            for(int j=0;j<this.n;j++) {
                if(i==j){
                    l[i][j]=1;
                    u[i][j]=0;
                } 
                else{
                    l[i][j]=0;
                    u[i][j]=0;
                }
            }
        }
    
        for(int k=0;k<this.n;k++) {
            for(int j=k;j<this.n;j++) {
                u[k][j]=this.mat[k][j];
                for(int i=0;i<k;i++) {
                    u[k][j]-=l[k][i]*u[i][j];
                }
            }
            
            for(int i=k+1;i<this.n;i++) {
                l[i][k]=this.mat[i][k];
                for(int j=0;j<k;j++) {
                    l[i][k]-=l[i][j]*u[j][k];
                }
                l[i][k]/=u[k][k];
            }
        }
    
        for(int i=0;i<this.n;i++) {
            for(int j=0;j<this.n;j++) {
                System.out.printf("%.2f ",l[i][j]);
            }
            System.out.printf("| ");
            for (int j=0;j<this.n;j++) {
                System.out.printf("%.2f ",u[i][j]);
            }
            System.out.printf("\n");
        }
    
        double[] y=new double[this.n];
        for(int i=0;i<this.n;i++) {
            y[i]=this.x[i];
            for(int j=0;j<i;j++) {
                y[i]-=l[i][j]*y[j];
            }
        }
    
        double[] x=new double[this.n];
        for (int i=this.n-1;i>=0;i--) {
            x[i]=y[i];
            for(int j=i+1;j<this.n;j++) {
                x[i]-=u[i][j]*x[j];
            }
            x[i]/=u[i][i];
        }
    
        System.out.printf("\n");
        for (int i=0;i<this.n;i++) {
            System.out.printf("%.2f ",x[i]);
        }
        System.out.printf("\n");
    }
    
    void cho(){
        int e = 0;
        for (int i=0;i<this.n;i++) {
            for (int j=0;j<this.n;j++) {
                if(this.mat[i][j]!=this.mat[j][i]) {
                    e=1;
                }
            }
        }
        if (e == 0) {
            double[][] l = new double[this.n][this.n];
            for (int i = 0; i < this.n; i++) {
                for (int j = 0; j < this.n; j++) {
                    l[i][j] = 0;
                }
            }
            for (int i=0;i<this.n;i++) {
                for (int j=0;j<=i;j++) {
                    double sum=0;
                    if(i==j){
                        for(int k=0;k<j;k++) {
                            sum += l[j][k]*l[j][k];
                        }
                        l[j][j]=Math.sqrt(this.mat[j][j]-sum);
                    } 
                    else{
                        for(int k=0;k<j;k++) {
                            sum += l[i][k]*l[j][k];
                        }
                        l[i][j]=(this.mat[i][j]-sum)/l[j][j];
                    }
                }
            }
            double[][] lt=new double[this.n][this.n];
            for(int i=0;i<this.n;i++) {
                for(int j=0;j<this.n;j++) {
                    lt[i][j]=l[j][i];
                }
            }
            for(int i =0;i<this.n;i++) {
                for(int j=0;j<this.n;j++) {
                    System.out.printf("%.2f ",l[i][j]);
                }
                System.out.printf("\n");
            }
            for(int i=0;i<this.n;i++) {
                for(int j=0;j<this.n;j++) {
                    System.out.printf("%.2f ",lt[i][j]);
                }
                System.out.printf("\n");
            }
            double[] y=new double[this.n];
            for(int i=0;i<this.n;i++) {
                double sum=this.x[i];
                for (int j=0;j<i;j++) {
                    sum-=l[i][j]*y[j];
                }
                y[i]=sum/l[i][i];
            }
            double[] x=new double[this.n];
            for(int i=(this.n)-1;i>=0;i--){
                double sum=y[i];
                for (int j=i+1;j<this.n;j++) {
                    sum-=lt[i][j]*x[j];
                }
                x[i]=sum/lt[i][i];
            }

            System.out.printf("\n");
            for (int i = 0; i < this.n; i++) {
                System.out.printf("%.2f ", x[i]);
            }
            System.out.printf("\n");
    
        } else {
            System.out.printf("Not Symmetric\n");
        }
    }

    double det(double mat[][]){
        return  ( (mat[0][0]*((mat[1][1]*mat[2][2])-(mat[2][1]*mat[1][2])))  -  (mat[0][1]*((mat[1][0]*mat[2][2])-(mat[2][0]*mat[1][2]))) + (mat[0][2]*((mat[1][0]*mat[2][1])-(mat[2][0]*mat[1][1])))  );
    }
    
    
    void cramer(){
        this.det=det(mat);
        this.temp = new double[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<this.n;j++) {
                this.temp[i][j] = this.mat[i][j];
            }
        }

        for(int i=0;i<this.n;i++){
            temp[i][0]=x[i];
        }
        System.out.printf("x1 : %.2f\n",det(this.temp)/this.det);

        this.temp = new double[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<this.n;j++) {
                this.temp[i][j] = this.mat[i][j];
            }
        }
        for(int i=0;i<this.n;i++){
            temp[i][1]=x[i];
        }
        System.out.printf("x2 : %.2f\n",det(this.temp)/this.det);


        this.temp = new double[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<this.n;j++) {
                this.temp[i][j] = this.mat[i][j];
            }
        }
        for(int i=0;i<this.n;i++){
            temp[i][2]=x[i];
        }
        System.out.printf("x3 : %.2f\n",det(this.temp)/this.det);
    }
    
};

///////////////////////////////////////////////////////////////////////////////////////////////////////

class a41{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        ob4 ob=new ob4();
        int n=0;
        int e=0;
        double a,b,c;
        double[] matrix=new double[100];

        
        while(true){
            String str = scan.nextLine();
            if(str.equals("a")){
                break;
            }
            else if(n>=100){
                n++;
                break;
            }
            else {
                matrix[n]=Double.parseDouble(str);
            }
            n++;
            
        }

        if(n<100){
            int matsize=ob.checkmat(n);
            double[][] mat=new double[matsize][matsize];
            int temp=0;

            for(int i=0;i<matsize;i++){
                for(int j=0;j<matsize;j++){
                    mat[i][j]=matrix[temp];
                    temp++;
                    
                }
            }
            ob.getmat(mat);
            System.out.printf("enter X\n");
            double[] x=new double[matsize];
            for(int i=0;i<matsize;i++){
                x[i]=scan.nextInt();
            }
            ob.setB(x);
            e=1;
        }
        else {
            System.out.printf("Too large");
        }


        char u;
        
        if(e==1){
            while (true) { 
                System.out.printf("s=showmat  c=Cramer_rule  g=gauss_elimination  G=gauss jordan  I=matrix_invation  L=LU  C=Choleskey\n");
                u=scan.next().charAt(0);
    /*break*/   if(u=='e'){
                    break;
                }

    /*showmat*/ else if(u=='s'){
                    ob.showmat();
                }

    /*gauss*/   else if(u=='g'){
                    ob.gauss();
                }

    /*jordan*/  else if(u=='G'){
                    ob.jordan();
                }

   /*inversion*/else if(u=='I'){
                    ob.inversion();
                }

    /*LU decom*/else if(u=='L'){
                    ob.LU();
                }
   /*choleskey*/else if(u=='C'){
                    ob.cho();
                }

                //3*3 only
    /*cramer*/  else if(u=='c'){
                    ob.cramer();
                }
            }
        }
        
    }
};
