#include<iostream>
using namespace std;

int getMax(int a,int b){
    if(b>=a){
        return b;
    }
    return a;
}

int findLargest(int arr[], int size){
    int ans= INT32_MIN;
    for(int i=0; i< size; i++){
        if(ans < getMax(ans, arr[i])){
            ans = getMax(ans, arr[i]);
        }
    }
    return ans;

}

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    cout<<findLargest(arr, n);

}