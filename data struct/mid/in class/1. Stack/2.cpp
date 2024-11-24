#include<iostream>
using namespace std;

class stack{
	public:
	int max=69420;
	int arr[4];
	int top=-1;

	void push(int x){
		if (top>=max-1){
			cout<<"ERROR";
			return;
		}
		top++;
		arr[top]=x;
	}
	
	int pop(){
		if (top<0){
			return -1;
		}
		return arr[top--];	
	}

};
int main(){
	char a;
	int n;
	int m;
	stack s;
	
	while(true){
		cin>>a;
		
		if(a=='X'){
			break;
		}
		else if (a=='U'){
			cin>>n;
			s.push(n);
		}
		else if (a=='O'){
			if (true){
				printf("%d",s.arr[s.top]);
				s.pop();
				printf("\n");
			}
			
		}
		else if (a=='T'){
			printf("%d",s.arr[s.top]);
			printf("\n");
		}
		else if (a=='P'){
			for (int i=0;i<=s.top;i++){
				printf("%d ",s.arr[i]);
				
			}
			printf("\n");
		}
		else if (a=='N'){
			cout<<s.top+1<<endl;
		}
				
	}
}

	
