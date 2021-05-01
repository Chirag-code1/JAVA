//In an n-sized array we have to find the maximum sum of the subarray
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int *a=(int *)malloc(n*sizeof(int));
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int max=a[0];
    int sum=a[0];
    for(int i=1;i<n;i++)
    {
       max=((max+a[i])>a[i])?max+a[i]:a[i];
       if(max>sum)
       {
        sum=max;   
       }
    }
    printf("%d",sum);
    return 0;
}