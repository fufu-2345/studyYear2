#include<iostream>
#include <cmath>
#include <bits/stdc++.h>
using namespace std;

double fx(double n,float a,float b){
	n=pow(n,b)-a;
	return n;
}

double x(double xl,double xr,float a,float b,double fxxr,double fxxl){
	return ((xl*fxxr)-(xr*fxxl))/(fxxr-fxxl);
}


int main(){
	int cl=0;
	int cr=0;
	float a,b;
	double temp;
	
	cin>>a>>b;
	
	double xl,xr;
	cin>>xl>>xr;
	if(xl*xr>0){
		cout<<"input wrong";
		return 0;
	}
	if(xl>1000000||xl<0||xr>1000000||xr<0){
		cout<<"input wrong";
		return 0;
	}
	
	double fxxr=fx(xr,a,b);
	double fxxl=fx(xl,a,b);
	double xnew=x(xl,xr,a,b,fxxr,fxxl);
	
	if(fx(xnew,a,b)*fxxr>0){
		xr=xnew;
		fxxr=fx(xr,a,b);
		//cout<<"xr "<<xr<<"   cal "<<fxxr<<endl;	
	}
	else if(fx(xnew,a,b)*fxxr<0){
		xl=xnew;
		fxxl=fx(xl,a,b);
		//cout<<"xl "<<xl<<"   cal "<<fxxl<<endl;
	}
	
	while(abs(fx(xnew,a,b))>0.00001){
		xnew=x(xl,xr,a,b,fxxr,fxxl);
		temp=fx(xnew,a,b);
		if(temp*fxxr<0){
			cr=0;
			xl=xnew;
			fxxl=temp;
			if(++cl>=2){
				fxxr/=2;
			}
			//cout<<"xl "<<xl<<"   cal "<<fxxl<<endl;
		}
		else if(temp*fxxr>0){
			cl=0;
			xr=xnew;
			fxxr=temp;
			if(++cr>=2){
				fxxl/=2;
			}
			//cout<<"xr "<<xr<<"   cal "<<fxxr<<endl;	
		}
		
	}
	cout<<fixed << setprecision(4)<<xnew<<endl;
}
