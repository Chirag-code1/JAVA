//Reverse n sized array in groups of k elements in C

#include <stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    int* arr=(int *)malloc(n*sizeof(int));
    for(int i=0;i<n;i++)
    {
      scanf("%d",&arr[i]); 
    }
    int k;
    scanf("%d",&k);
    int i=0;
    while(i<n)
    {
        if(i+k<=n)
        {
            for(int j=0;j<(k/2);j++)
            {
                int temp=arr[i+j];
                arr[i+j]=arr[k+i-j-1];
                arr[k+i-j-1]=temp;
            }
        }
        else
        {
            for(int j=0;j<((n-i)/2);j++)
            {
            int temp=arr[i+j];
            arr[i+j]=arr[n-j-1];
            arr[n-j-1]=temp;   
            }
        }
        i+=k;
    }
    
    for(int i=0;i<n;i++)
    {
      printf("%d ",arr[i]); 
    }
    return 0;
}

//Time complexity O(n)