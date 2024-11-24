#include<iostream>
#include <cmath>
#include <bits/stdc++.h>
using namespace std;


float cal(float n){
	n=pow(n,4)-13;
	return n;
}

float xm(float xl,float xr){
	return (xl+xr)/2;
}


int main(){
	float xl=1.5;
	float xr=2.0;
	float a;

	float xold=xm(xl,xr);
	if (cal(xold)*cal(xr)>0){
		xr=xold;
		//cout<<"xr "<<xold<<endl;
	}
	else if (cal(xold)*cal(xr)<0){
		xl=xold;
		//cout<<"xl "<<xold<<endl;
	}
	
	float xnew=xm(xl,xr);
	if (cal(xnew)*cal(xr)>0){
		xr=xnew;
		//cout<<"xr "<<xnew<<endl;
	}
	else if (cal(xnew)*cal(xr)<0){
		xl=xnew;
		//cout<<"xl "<<xnew<<endl;
	}
	
	float renew=cal(xnew);
	float reold=cal(xold);
	while(abs(reold-renew)>=0.0000001){
		reold=renew;
		xnew=xm(xl,xr);
		if (cal(xnew)*cal(xr)>0){
			xr=xnew;
			//cout<<fixed << setprecision(8)<<"xr "<<xnew;
		}
		else if (cal(xnew)*cal(xr)<0){
			xl=xnew;
			//cout<<fixed << setprecision(8)<<"xl "<<xnew;
		}
		renew=cal(xnew);
		//cout<<fixed << setprecision(8)<<"   cal "<<renew<<endl;
	}
	cout<<fixed << setprecision(8)<<"xl = "<<xl<<"  xr ="<<xr;
}
