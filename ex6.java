import java.util.*;
import java.lang.*;
class ex6{
public static void main(String args[]){
int countv=0,countc=0;
String str="Java";
str=str.toLowerCase();
for(int i=0;i<=str.length();i++){
char ch=str.charAt(i);
try{
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
countv++;
}
else if((ch>='a'&&ch<='z')){
countc++;
}
}catch(StringIndexOutOfBoundException e){
System.out.println("StringIndexOutOfBoundException"+e);
}
}
System.out.println("Number of vowels:"+countv);
System.out.println("Number of cosonants:"+countc);
}
}