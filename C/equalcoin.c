#include <stdio.h>

int main(void) {

    int t,x,y,sum;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        scanf("%d%d",&x,&y);
        if(y%2==0 && x%2==0){
            printf("Yes\n");
        }
        else if(y%2!=0){
            int z=(y/2)+1;
            int k=z-(y/2);
            x=x-(k*2);       
            if(x%2 == 0 && x>=0){
                printf("Yes\n");
            }
            else{
                printf("No\n");
            }
        }
        else{
            printf("No\n");
        }
    }
    return 0;
}
