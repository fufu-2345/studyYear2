#include<iostream>
using namespace std;


class heap{
	public:
	int keep=1;
	int arr[1000];
	int none=-99999;
	
	void show(){
		for(int i=1;i<keep;i++){
			cout<<arr[i]<<" ";
		}
		cout<<endl;
	}
	
	void add(int v){
		arr[keep]=v;
		arr[keep*2]=none;
		arr[keep*2+1]=none;
		keep++;
		sort();
	}
	
	void swap(int* a,int* b){
		int temp=*a;
		*a=*b;
		*b=temp;
	}
	void sort(){
		int i=keep-1;		
		
		while(i>1){
			if(i%2==1){
				i-=1;
			}
			int par=i/2;
			int l=i;
			int r=i+1;
			
			if(arr[r]>arr[l] && arr[r]>arr[par]){
				swap(&arr[r],&arr[par]);
				i/=2;
			}
			else if(arr[l]>arr[r] && arr[l]>arr[par]){
				swap(&arr[l],&arr[par]);
				i/=2;
			}
			else {
				break;
			}
		}
	}
		
		void sort2(){
			int i=1;		
		
			while(i<keep){
				int par=i;
				int l=i*2;
				int r=i*2+1;
				
				if(arr[r]>arr[l] && arr[r]>arr[par]){
					swap(&arr[r],&arr[par]);
					i=r;
				}
				else if(arr[l]>arr[r] && arr[l]>arr[par]){
					swap(&arr[l],&arr[par]);
					i=l;
				}
				else {
					break;
				}
			}
		}
		
	void remove(){
		cout<<arr[1]<<endl;
		arr[1]=arr[keep];
		arr[keep]=none;
		keep--;
		sort2();
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
		}
		else if(e=='d'){
			h.remove();
		}
	}
}



