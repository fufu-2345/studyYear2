#include <iostream>
using namespace std;

class queue{
    public:
    int n = 0,head = 0,tail=0;
    int arr[100];
    void inqueue(int a){
        if(n >= 100){
            return;
        }
        arr[tail++] = a;
        n++;
    }

    void dequeue(){
        if(n <= 0){
            return;
        }
        head++;
        n--;
    }
};


class Graph{
    public:
    bool pass[100];
    int edges[100][100];
    int n;

    void breadthFast(int a){
        for(int i=0;i<n;i++){
            pass[i] = false;
        }
        pass[a] = true;
        queue q;
        q.inqueue(a);
        while(q.n > 0){
            int s = q.arr[q.head];
            cout << s << " ";
            for(int i =0;i<n;i++){
                if(edges[s][i] != 0 && pass[i] == false){
                    pass[i] = true;
                    q.inqueue(i);
                }
            }
            q.dequeue();
        }
        cout <<endl;
    }

    void clearPass(){
        for(int i=0;i<n;i++){
            pass[i] = false;
        }
    }

    void depthTraversal(int a){
        cout << a << " ";
        pass[a] = true;
        for(int i = 0;i<n;i++){
            if(edges[a][i] != 0 && pass[i] == false){
                depthTraversal(i);
            }
        }
    }

};

int main(){
    bool loop = true;
    int n,a,b,w;
    char mode;
    bool printMode = false;
    cin >> n;
    Graph g;
    g.n = n;
    for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            g.edges[i][j] = 0;
        }
    }

    while(loop){
        cin >> mode;
        if(!printMode){
            switch(mode){
                case 'e':
                    cin >> a>>b>>w;
                    g.edges[a][b] = w;
                    break;
                case 's':
            	    printMode = true;
                    break;
            }
        }else{
            switch(mode){
                case 'd':
                    cin >> a;
                    g.clearPass();
                    g.depthTraversal(a);
                    cout << endl;
                    break;
                case 'b':
                    cin >> a;
                    g.breadthFast(a);
                    break;
            }
        }

        if(mode == 'q'){
            loop = false;
        }

    }
    

}
