#include<iostream>
using namespace std;

int returnMin(int a,int b){
    if(a<=b){
        return a;
    }
    return b;
}

int getHCF(int a,int b){

    for(int i=returnMin(a,b); i>=1;i--){
        if(a % i ==0 && b % i==0){
            return i;
        }
    }
    return 1;
}


int main(){
    int a,b;
    cin>>a>>b;
    cout<<getHCF(a,b);
}