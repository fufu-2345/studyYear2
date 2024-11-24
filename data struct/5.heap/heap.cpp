#include<iostream>
using namespace std;

class heap{
	public:
		int keep=0;
		int arr[1000];
		
		void show(){
			if(keep!=0){
				int temp=0;
				while(temp<keep){
					cout<<arr[temp]<<" ";
					temp+=1;
				}
				cout<<endl;
			}
		}
		
		void add(int v){
			arr[keep]=v;
			arr[(keep*2)+1]=-99999;
			arr[(keep*2)+2]=-99999;
			keep++;
		}
		
		void sort(){
			int l,r,par;
			if(keep%2==0){
				r=keep;
				l=r-1;
				par=(r-1)/2;		
			}
			
			else {
				l=keep;
				r=l+1;
				par=l/2;	
			}

			while(par>=0){
				
				//check r
				if(arr[r]>arr[l]){
					if(arr[r]>arr[par]){
						int temp=arr[par];
						arr[par]=arr[r];
						arr[r]=temp;
					}
				}
				
				//check l
				else {
					if(arr[l]>arr[par]){
						int temp=arr[par];
						arr[par]=arr[l];
						arr[l]=temp;
					}
				}
				
				
				par--;
				r-=2;
				l-=2;
				
			}
		}
		
		void remove(){
			if(keep>0){
				cout<<arr[0]<<endl;
				arr[0]=arr[keep-1];
				arr[keep]=-99999;
				keep--;
				sort2();
				
			}
		}
		
		void sort2(){
			int i=0;
			while(i<keep){
				int l=2*i+1;
				int r=2*i+2;
				if(l<keep && arr[l]>=arr[r] && arr[l]>arr[i]){
					int temp=arr[i];
					arr[i]=arr[l];
					arr[l]=temp;
					i=l;
					
				}
				else if(r<keep && arr[r]>=arr[l] && arr[r]>arr[i]){
					int temp=arr[i];
					arr[i]=arr[r];
					arr[r]=temp;
					i=r;
					
				}
				else {
					break;
				}
			}		
						
		
		}
		
		
};

int main(){
	heap h;
	char e;
	int a;
	while(e!='e'){
		cin>>e;
		if(e=='p'){
			h.show();
		}
		else if(e=='a'){
			cin>>a;
			h.add(a);
			h.sort();
		}
		else if(e=='d'){
			h.remove();
		
		}
	}
	
}
