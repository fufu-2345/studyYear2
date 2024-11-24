#include<iostream>
using namespace std;

class stack{
	public:
		int arr[5];
		int back=0;
		int front=0;
		int lim=5;
		int keep=0;
		int e=0;
		int rrr=888;
		
		void push(int x){
			
			//full?
			if(keep==lim){
				cout<<"Error"<<endl;
			}
						
			else {	
				if(back==lim-1){
					arr[back]=x;
					rrr=x;
					back=0;
					keep++;
				}
				else{
					arr[back]=x;
					rrr=x;
					back++;
					keep++;
				}
						
			}
			/*
			int out=front;
			for(int i=0;i<keep;i++){
				if(out==lim){
					out=0;
					cout<<arr[out]<<" ";
				}
				else{
					cout<<arr[out]<<" ";
					out++;
				}
			}
			cout<<endl;*/
			
		}
				
		void oo(){
		int out=front;
			for(int i=0;i<keep;i++){
				if(out==lim){
					out=0;
					cout<<arr[out]<<" ";
				}
				else{
					cout<<arr[out]<<" ";
					out++;
				}
			}
			cout<<endl;	
		}
		
		int pop(){
			e=0;
			//empty?
			/*if(keep==1){
				front++;
				//cout<<"empty"<<endl;
			}*/
			if(keep==0){
				cout<<"Error"<<endl;
				e=1;
			}
			else if(front==4){
				front=0;
				return arr[4];
				
			}
			else{
				return arr[front++];
				//cout<<arr[front]<<endl;
			}
			/*
			if(e!=1){
			
			
				int out=front;
				for(int i=0;i<keep;i++){
					if(out==lim){
						out=0;
						cout<<arr[out]<<" ";
					}
					else{
						cout<<arr[out]<<" ";
						out++;
					}
				}
				cout<<endl;
			}*/
			
			
		}
};

int main(){
	stack c;
	char a=a;
	int b=0;
	while(true){
		cin>>a;
		if(a=='e'){
			//cout<<"1111"<<endl;
			cin>>b;
			c.push(b);
		}
		else if(a=='d'){
			int temp=c.pop();
			if(c.e==0){
				cout<<temp;
				c.keep--;
			}
			cout<<endl;
		}
		else if(a=='p'){
			c.oo();
		}
		else if(a=='x'){
			break;
		}
		else if(a=='n'){
			cout<<c.keep<<endl;
		}
		else if(a=='s'){
			cout<<c.arr[c.front]<<" "<<c.rrr<<endl;
		}
		
	}
}
