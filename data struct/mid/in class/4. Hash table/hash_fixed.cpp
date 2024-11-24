#include<iostream>
using namespace std;

class Node{
	public:	
	int id;
	string value;
	Node* next;
	Node():id(-1),value("-"),next(NULL){}
	
};

class hhash{
	public:
	Node arr[17];
	
	void show(){
		for(int i=0;i<17;i++){
				for(Node *temp=&arr[i];temp!=NULL;temp=temp->next){
					cout<<"("<<temp->id<<","<<temp->value<<")";
				}
				cout <<endl;
			}
		
		
		
	}
	
	void add(int ID,string val){
		Node* temp=&arr[ID%17];
		if(temp->id==-1){
			temp->id=ID;
			temp->value=val;
			temp->next=NULL;
		}
		else{
			Node* newnode=new Node();
				newnode->id=ID;
				newnode->value=val;
				newnode->next=NULL;
			while(temp->next!=NULL){
				temp=temp->next;
			}
			temp->next =newnode;
			
		}
		
		
	}
	
	
	int find(int key){
		Node* temp=&arr[key%17];
		do{
			if(temp->id==key){
				cout<<temp->value<<endl;		
				return 0;
			}
			else while(temp->next!=NULL){
				temp=temp->next;
				if(temp->id==key){
					cout<<temp->value<<endl;		
				return 0;
				}
			}
			
		}while(temp->next!=NULL);
		cout<<"-"<<endl;
		return 1;	
	}
	
};


int main(){
	hhash B;
	int ID;
	string val;
	
	char x;
	while(true){
		cin>>x;
		if(x=='e'){
			break;
		}
		if(x=='p'){
			B.show();
		}
		if(x=='a'){
			cin>>ID>>val;
			B.add(ID,val);
		}
		if(x=='s'){
			cin>>ID;
			B.find(ID);
		}
	}
	
}

