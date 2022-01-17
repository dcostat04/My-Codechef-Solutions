#include<stdio.h>
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    scanf("%d",&t);
    while(t--){
        
            int n,i,a,b;
            a=0;
            cin>>n;
		    int arr[n-1];
		    
		    for(i=0;i<n-1;i++){
		        cin>>arr[i];
		    }
		    
		    for(i=0;i<n-1;i++){
		         a = a + arr[i];
		    }
		     
		     b=(n*(n+1))/2;
		     cout << b-a << endl;
        
        }
    
    return 0;
}
