import java.util.*;
class Even{
public static void main(String []args){
int i=1,n;
Scanner i=new Scanner(System.in);
System.out.println("enter the n value");
n=i.nextInt();
do{
if(i%2==0){
System.out.println(i);
}
while(i<=n);
}
}
}
