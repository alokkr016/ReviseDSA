#include<iostream>
using namespace std;

double getAverage(int a,int b, int c){
    int sum = a+b+c;
    return sum*1.0 / 3.0 ;
}

int main(){
    int a,b,c;
    cin>>a>>b>>c;

    double result = getAverage(a,b,c);
    cout<<result<<endl;
    return 1;
    
}