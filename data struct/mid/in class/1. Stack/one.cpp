#include<iostream>
using namespace std;

class stack{
	public:
	int max=32;
	char arr[32];
	int top=-1;

	void push(char x){
		if (top>=max){
			//cout<<"push ERROR"<<endl;
			return;
		}
		top++;
		arr[top]=x;
	}
	
	char pop(){
		if (top<=-1){
			//cout<<"pop Error"<<endl;
		}
		return arr[top--];	
	}

};
int main(){
	char a[20];
	gets(a);
	stack s;
	bool TF=true;
	
	for (int i=0;a[i];i++){
		if(a[i]==40){		
			s.push(a[i]);
			//cout<<"pushed"<<endl;	
		}
		else if(a[i]==41){
			if (s.arr[s.top]==40){
				s.pop();
				//cout<<"poped"<<endl;
			}
			else if (s.arr[s.top]!=40){
				cout<<"Error"<<endl;
				TF=false;
				break;
			}	
		}
		
	}
	if (s.top!=-1){
		cout<<"Error"<<endl;
		TF=false;
	}
	if (TF==true){
		cout<<"Pass"<<endl;
	}

}
	
