#include <stdio.h>

int main(void) {
    
    int t,x,y,a,b,k;
    scanf("%d",&t);
    while(t--){
        scanf("%d%d%d%d%d",&x,&y,&a,&b,&k);
        for(int j=0;j<k;j++){
            x=x+a;
            y=y+b;
        }
        if (x== y)
        {
            printf("SAME PRICE\n");
        }
        else if (x > y)
        {
            printf("DIESEL\n");
        }
        else if (x < y)
        {
            printf("PETROL\n");
        }
    }
   return 0;
}


