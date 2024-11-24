#include<iostream>
#include <cmath>
#include <bits/stdc++.h>
using namespace std;


double cal(double n,float a,float b){
	n=pow(n,b)-a;
	return n;
}

double xm(double xl,double xr){
	return (xl+xr)/2;
}


int main(){
	float xl;
	float xr;

	int a;
	int b;
	
	cin>>a>>b;
	if(a<2 or a>2000000 or b<2 or b>2000000){
		cout<<"input wrong"<<endl;
		return 0;
	}
	
	cin>>xl>>xr;
	if(xl*xr>0){
		cout<<"input wrong";
		return 0;
	}
	
	double xold=xm(xl,xr);
	if (cal(xold,a,b)*cal(xr,a,b)>0){
		xr=xold;
		//cout<<"xr "<<xold<<endl;
	}
	else if (cal(xold,a,b)*cal(xr,a,b)<0){
		xl=xold;
		//cout<<"xl "<<xold<<endl;
	}
	
	double xnew=xm(xl,xr);
	if (cal(xnew,a,b)*cal(xr,a,b)>0){
		xr=xnew;
		//cout<<"xr "<<xnew<<endl;
	}
	else if (cal(xnew,a,b)*cal(xr,a,b)<0){
		xl=xnew;
		//cout<<"xl "<<xnew<<endl;
	}
	
	double renew=cal(xnew,a,b);
	double reold=cal(xold,a,b);
	while(abs(reold-renew)>=0.00001){
		reold=renew;
		xnew=xm(xl,xr);
		if (cal(xnew,a,b)*cal(xr,a,b)>0){
			xr=xnew;
			//cout<<fixed << setprecision(8)<<"xr "<<xnew;
		}
		else if (cal(xnew,a,b)*cal(xr,a,b)<0){
			xl=xnew;
			//cout<<fixed << setprecision(8)<<"xl "<<xnew;
		}
		renew=cal(xnew,a,b);
		//cout<<fixed << setprecision(8)<<"   cal "<<renew<<endl;
	}
	//cout<<fixed << setprecision(4)<<"xl = "<<xl<<"  xr ="<<xr;
	cout<<fixed << setprecision(4)<<xnew;
}
