#include <stdio.h>

int main(void) {
    int l,r,i;
    scanf("%d%d",&l,&r);
    for(i=l;i<=r;i++){
        if(i%2==1){
            printf("%d ",i);
        }
    }
}


