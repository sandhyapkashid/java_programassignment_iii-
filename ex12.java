import java.util.*;
class ex12{
static final int SIZE=256;
static char get(String str){
int count[]=new int[SIZE];
int len=str.length();
for(int i=0;i<len;i++)
count[str.charAt(i)]++;
int max=-1;
char result=' ';
for(int i=0;i<len;i++){
if(max<count[str.charAt(i)]);{
max=count[str.charAt(i)];
result=str.charAt(i);
}
}
return result;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String:");
String str=sc.nextLine();
System.out.println("Number of Occured Charcter is:"+get(str));
}
}