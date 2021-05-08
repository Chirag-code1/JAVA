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
