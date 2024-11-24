#include<iostream>
using namespace std;

class node{
	public:
	string name;
	int ar;
	int ser;
	node* next;
	node(string n,int a,int s):name(n),ar(a),ser(s),next(NULL){
		
	}
};

class rrr{
	public:
	int kep=0;
	node* head;
	
	void add(string a, int b,int c){
		node* newnode=new node(a,b,c);
	
		if(kep==0){
			head=newnode;
		}
		else{
				node* temp=head;
			while(temp->next!=NULL){
				temp=temp->next;
			}
			temp->next=newnode;
		}
		kep++;
	}
	
	void show(){
		node* temp=head;
		for(int i=0;i<kep;i++){
			cout<<temp->name<<" ";
			temp=temp->next;
		}
	}
	
	
	void run(){
		int i=kep;
		int now=0;
		while(i!=0){
			node* temp=head;
			node* min=temp;
			cout<<endl<<"  "<<endl;
			while(temp!=NULL){
				if(temp->ar==now){
					min=temp;
					break;
					
				}
				else if(temp->ar<min->ar){
					min=temp;
				}
				temp=temp->next;
			}
			
			for(int j=min->ser;j>0;j--){
				cout<<min->name<<": "<<j<<endl;
			}
			min->ar=99999;
			now+=min->ser;
			i--;
		}
	}
};


int main(){
	rrr s;
	string a;
	int n,b,c;
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a>>b>>c;
		s.add(a,b,c);
	}
	s.show();
	cout<<endl;
	s.run();
}
