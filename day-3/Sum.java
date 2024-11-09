import java.util.*;
class Sum{
public static void main(String []args){
int i=0,n,sum=0;
Scanner sv=new Scanner(System.in);
System.out.println("enter the n value:");
n = sv.nextInt();
while(i<=n){
sum=sum+i;
i++;
}
System.out.println(sum);
}
}
