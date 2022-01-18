#include<stdio.h>
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    scanf("%d",&t);
    stack<int>s ;
    while(t--){
        
        int in,n;
        cin>>in;
        
        if(in !=-1){
            cin>>n;
            s.push(n);
        }
        else{
            if(in == -1 && s.empty()){
                cout << "kuchbhi?" << endl;
               
            }
            else{
                cout << s.top() << endl;
                s.pop();
                
            }
            
        } 
        
        
    }
    return 0;
}
