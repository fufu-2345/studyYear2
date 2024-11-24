#include<iostream>
#include <cmath>
#include <bits/stdc++.h>
using namespace std;

double fx(double n){
	n=pow(n,4)-13;
	return n;
}
double x(double xl,double xr){
	return ((xl*(fx(xr)))-(xr*(fx(xl))))/((fx(xr))-(fx(xl)));
}


int main(){
	double xl=1.5;
	double xr=2.0;
	double xold=x(xl,xr);
	
	if(fx(xold)*fx(xr)>0){
		xr=xold;
		//cout<<fixed << setprecision(6)<<"xr "<<xr<<endl;
	}
	else if(fx(xold)*fx(xr)<0){
		xl=xold;
		//cout<<fixed << setprecision(6)<<"xl "<<xl<<endl;
	}
	
	double xnew=x(xl,xr);
	if(fx(xnew)*fx(xr)>0){
		xr=xnew;
		//cout<<fixed << setprecision(6)<<"xr "<<xr<<"   cal "<<fx(xr)<<endl;
	}
	else if(fx(xnew)*fx(xr)<0){
		xl=xnew;
		//cout<<fixed << setprecision(6)<<"xl "<<xl<<"   cal "<<fx(xl)<<endl;
	}
	
	while(abs(xnew-xold)>=0.0000001){
		xold=xnew;
		xnew=x(xl,xr);
		if(fx(xnew)*fx(xr)>0){
			xr=xnew;
			//cout<<fixed << setprecision(6)<<"xr "<<xr<<"   cal "<<fx(xr)<<endl;
		}
		else if(fx(xnew)*fx(xr)<0){
			xl=xnew;
			//cout<<fixed << setprecision(6)<<"xl "<<xl<<"   cal "<<fx(xl)<<endl;
		}
	}
	cout<<fixed << setprecision(6)<<xnew<<endl;
}
