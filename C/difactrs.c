#include <stdio.h>

int main(void) {
    int n,i,j,k;
    int arr[100];
    j=0;
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        if(n%i==0){
            j++;
        }
    }
    printf("%d\n",j);
    for(i=1;i<=n;i++){
        if(n%i==0){
            printf("%d ",i);
        }
    }
}


