#include<iostream>
using namespace std;
int returnMaxTwo(int a,int b){
    if(a >= b){
        return a;
    }
    return b;
}

int getLCM(int a,int b){
    
    for(int i=returnMaxTwo(a,b); i<=(a*b); i++){
        if(i%a ==0 && i%b ==0){
            return i;
        }
    }
    return a*b;
}

int main(){
    int a,b;
    cin>>a>>b;
    cout<<getLCM(a,b);
}