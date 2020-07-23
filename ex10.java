import java.util.*;
class ex10{
public static void main(String args[]){
String a,b="";
Scanner s=new Scanner(System.in);
System.out.println("enter the string:");
a=s.nextLine();
int n=a.length();
for(int i=n-1;i>=0;i--){
b=b+a.charAt(i);
}
if(a.equalsIgnoreCase(b)){
System.out.println("string is palindrome:");
System.out.println("true");
}
else{
System.out.println("string is palindrome:");
System.out.println("false");
}
}
}