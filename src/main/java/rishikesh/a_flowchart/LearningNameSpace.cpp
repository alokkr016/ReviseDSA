#include<iostream>
using  namespace std;

namespace sachin{
    int a=10;
    void myFun(){
        cout<<"I am in sachin name space";
    }
}

namespace rishi{
    string a="Rishikesh Pal";
    void myFun(){
        cout<<"I am in rishi name space";
    }
}
int main(){
    cout<<sachin::a<<endl;
    rishi::myFun();

}


