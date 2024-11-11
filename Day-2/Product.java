import java.util.Scanner;
class Product{
public static void main(String []args){
Scanner O=new Scanner(System.in);
int pno;
String pname;
float pcost,pqty;
System.out.println("enter the product no:");
pno=O.nextInt();
System.out.println("enter the product name:");
pname=O.next();
System.out.println("enter the product cost:");
pcost=O.nextFloat();
System.out.println("enter the product quty:");
pqty=O.nextFloat();
Float bill=pcost*pqty;
System.out.println("enter the product no:"+pno);
System.out.println("enter the product name:"+pname);
System.out.println("enter the product cost:"+pcost);
System.out.println("enter the product quty:"+pqty);
System.out.println("enter the bill:"+bill);
}
}