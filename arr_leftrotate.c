#include <stdio.h>
int main(){
int i,d,n;
scanf("%d",&n);
    int arr[n];
scanf("%d",&d);
    int temp[d];
for(i=0;i<n;i++)
    scanf("%d",&arr[i]);

for(i=d;i<n;i++)
printf("%d ",arr[i]);
    for(i=0;i<d;i++)
    {
        temp[i]=arr[i];
        printf("%d ",temp[i]);
    }   
return 0;
}
