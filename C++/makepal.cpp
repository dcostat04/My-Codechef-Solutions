#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(void) {
    int t,n,N;
    cin >> t;
    while(t--){
        cin >> N;
        vector<int>arr(N);
        int i=0;
        int j=0;
        for(int j=0;j<N;j++){
            cin >> arr[j];
            n+=arr[j];
            if(arr[j]%2)
            {
                i++;
            }
        }
        cout << i/2 <<endl;
        
    }
	return 0;
}
