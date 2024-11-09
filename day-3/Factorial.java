import java.util.*;
class Factorial{
public static void main(String []args){
int i=1,n,fact=1;
Scanner sv=new Scanner(System.in);
System.out.println("enter the n value:");
n = sv.nextInt();
while(i<=n){
fact=fact*i;
i++;
}
System.out.println("\fact of"+n+"is"+fact);
}
}
