#include<iostream>
using namespace std;

long int printFactorial(int n){
    long int p=1;
    for(int i=1; i<=n; i++){
        p = p*i;
    }
    return p;
}

int main(){
    int n;
    cin>>n;
    cout<<printFactorial(n);
    //Concept of integer overflow need to learn
}