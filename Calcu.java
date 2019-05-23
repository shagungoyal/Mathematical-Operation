import java.util.Scanner;
class Calci
{
int a,b;
Calci(int a, int b)
{
this.a=a;
this.b=b;
}
int add(){ return a+b;}
int sub(){ return a-b;}
int mul(){ return a*b;}
int div(){ return a/b;}
}

public class Calcu{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a : ");
int a=sc.nextInt();
System.out.print("Enter b : ");
int b=sc.nextInt();
System.out.print("Enter the operation :");


String op=sc.next();
int c=0;
Calci obj= new Calci(a,b);
switch(op){
case "+": c=obj.add(); break;
case "-": c=obj.sub(); break;
case "*": c=obj.mul(); break;
case "/": c=obj.div(); break;
default: System.out.println("Invalid operation");
}
System.out.println(a + op + b + "=" + c);
}
}
