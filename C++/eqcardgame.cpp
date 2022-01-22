#include<stdio.h>
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while(t--){
        int a,h;
        cin>>a;
        if(52%a==0){
            cout << 0 << endl;
        }
        else {
            h = 52%a;
            cout<<h<<endl;
        }
        
    }
    return 0;
}
