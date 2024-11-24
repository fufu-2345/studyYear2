#include <iostream>
using namespace std;

float cal(float n){
	n=(43*n)-180;
	return n;
}
int main(){
	int x;
	float y;
	float re;
	
	for(float i=0;true;i++){
		if(cal(i)>=0){
			break;
		}
		x=i;
	}
	
	y=cal(x);
	if(y>0){
		for(float i=x;true;i=i+0.000001){
			y=cal(i);
			if(y<=0){
				cout<<"i = "<<i<<"   cal i = "<<y<<endl;
				break;
			}
		}
	}
	
	else if(y<0){
		for(float i=x;true;i=i+0.000001){
			y=cal(i);			
			if(y>=0){
				cout<<"i = "<<i<<"   cal i = "<<y<<endl;
				break;
			}
		}	
	}
}
