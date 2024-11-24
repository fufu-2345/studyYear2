#include <iostream>
using namespace std;

class Node{
	public:
	int value;
	int id;
	Node* next;
	Node(int v):value(v),next(NULL){}
};
	
class linklist{
	public:
	
	int i=0;
	Node* head;
	
	void add(int n,int m){
		Node* newnode=new Node(n);
		newnode->next=NULL;
		if(i==0){
			head=newnode;
		}
		i++;
		
		if(i>1){
			Node* temp=head;
			Node* temp2=newnode;
			
			while(temp->value!=m){
				temp=temp->next;
			}
			newnode->next=temp->next;
			temp->next=newnode;	
		}
		
	}
	
	void before(int n,int m){
		Node* newnode=new Node(n);
		newnode->next=NULL;
		if(i==0){
			head=newnode;
		}
		i++;
		
		//if( move head)
		
		if(i>1){
			if(head->value==m){
				newnode->next=head;
				head=newnode;
			}
			else{
				Node* temp=head;
				while(temp->next->value!=m){
					temp=temp->next;
				}
				
				newnode->next=temp->next;
				temp->next=newnode;
			}	
		}	
	}
	
	void show(){
		for(Node* h=head; h!=NULL; h=h->next){
			cout<<h->value<<" ";
		}
		cout<<endl;
	}
	
	int check(int check){
		if(i==0){
			return 0;
		}
		for(Node* h=head;h!=NULL;h=h->next){
			if(check==h->value){
				return 1;
			}
		}
		return 0;
	}
	
	int none(int check){
		int e=0;
		if(i==0){
			return 1;
		}		
		else{
			for(Node* h=head;h!=NULL;h=h->next){
				if(check==h->value){
					e=1;
				}
			}
			if(check==head->value){
					e=1;
			}
			
			if(e==1){
				return 1;	
			}
			else{
				return 0;
			}
		}
	}
	
	void del(int check){
		i--;
		Node* h=head;
		int a=0;
		if(head->value==check){
			head=head->next;
		}
		
		else{
			while(h->next->value!=check){
					h=h->next;
					a++;
				}
				h->next=h->next->next;	
		}		
		
	}
	
	void addl(int v){
		Node* newnode=new Node(v);
		Node* h=head;
		
		if(head->next==NULL){
			head->next=newnode;
		}
		
		else{
			while(h->next!=NULL){
				h=h->next;
			}
			h->next=newnode;
		}
}
	
	
};
	
int main(){
	linklist link;
	char in;
	int val,val2;
	
	while(true){
		cin>>in;
		
		if(in=='A'){
			cin>>val>>val2;
			if(link.check(val)==1){
				//cout<<"ERROR"<<endl;
			}
			else if(link.none(val2)==0){
				link.addl(val);
				link.show();
			}
			else {
				link.add(val,val2);	
				link.show();
			}
		}
		
		if(in=='I'){
			cin>>val>>val2;
			if(link.check(val)==1){
				//cout<<"ERROR"<<endl;
			}
			else if(link.none(val2)==0){
				link.addl(val);
				link.show();
			}
			else{
				link.before(val,val2);
				link.show();
			}
		}
		
		else if(in=='E'){
			break;
		}
		
		else if(in=='D'){
			cin>>val;
			if(link.none(val)==0){
				//cout<<"111";
				//cout<<"ERROR"<<endl;
			}
			else {
				if(link.i==0){
					//cout<<"222";
					//cout<<"ERROR";
				}
				else{
					link.del(val);
					link.show();
				}
				
			}
		}
		
		else if(in=='S'){
			link.show();
		}
	}
	
}




