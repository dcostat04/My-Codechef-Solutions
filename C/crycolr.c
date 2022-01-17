#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    scanf("%d",&t);
    while(t--){
        int n;
        cin>>n;
        int arr[3][3];
        for(int i=0;i<3;i++){
            cin>>arr[i][0];
            cin>>arr[i][1];
            cin>>arr[i][2];
        }
        int count=0;
        if(arr[0][0]==n&&arr[1][1]==n&&arr[2][2]==n){
            cout<<count<<endl;
        }
        else{
            int a=arr[1][0]+arr[2][0]+arr[2][1];
            int b=arr[0][1]+arr[0][2]+arr[1][2];
        
            int ans=max(a,b);
            cout<<ans<<endl;
        }
    
        
    }
    return 0;
}
