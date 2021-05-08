The Number is Kaprekar or not?

Write a program to find the given number is kaprekar or not. A number if kaprekar if the representation of its square can be split into two parts that add up to the original number. For instance, 45 is a Kaprekar number, because 45^2 = 2025 and 20 + 25 = 45. Whereas 13 is not as 13^2 = 169 which can be split in two ways (1+69) and (16+9), but any of them is not 13. The number 1 is Kaprekar, because 1^2 = 01, and  0 + 1 = 1.

Input

First line of input will contain a number N = number of test cases. Next N lines will contain number n as test case where 0<=n<=9999.

Output

For each input case, print 1 if number is kaprekar and print 0 otherwise.
**********************************************************************************************************
Solution:


import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
 Scanner sc= new Scanner(System.in);
 int t= sc.nextInt();
 for(int x=1;x<=t;x++){
 int a= sc.nextInt();

 int p=a*a;//Calculating sq in variable 'p'.
 int sq=p;
 
 int count=0, divident=1;
 while(sq>0){ //we are counting how many numbers r present in sq by using while loop.
     count++;
     sq/=10;
 } //'sq' has become 0 now. Asli sq ki value 'p' me pdi hai.

  int div=count/2; //calculating half of the count of numbers of sq.

 if(count%2==0){  //if 'div' comes out to be EVEN.
for(int j=1;j<=div;j++){
     divident*=10;
}
int A=p/divident + p%divident; // both the exp resent in 'A' is calculating the first half and second half on square, correspondingly.
if(A==a)   //compairing with original number.
System.out.println("1");
else
System.out.println("0");
//System.out.println(a%divident);
//System.out.println(a/divident + a%divident);
 }

 else
 {  //If div is ODD.
     for(int j=1;j<=div+1;j++){ //MIND "j<=div+1".coze point peeche se lgenge,we need "n" and "n+1" division of count.
         divident*=10;
     }
     int A=p/divident + p%divident;
if(A==a)
System.out.println("1");
else
System.out.println("0");
     //int temp=divident*10;
    // System.out.println(a%temp);
  // System.out.println(a/divident + a%divident);

 }

    }
    }
}
