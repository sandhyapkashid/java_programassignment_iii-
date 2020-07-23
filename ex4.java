import java.util.*;
import java.io.*;
class ex4{
public static void main(String args[]){

String str="Java programing";
System.out.println("String="+str);
String rstr=reverse(str);
//iterative method to reverse string
System.out.println("reverse string in java using Iteration="+rstr);
//recursive method to reverse string
rstr=reverseRecursively(str);
System.out.println("reverse string in java using Recursion:"+rstr);
}
public static String reverse(String str){
StringBuilder strb=new StringBuilder();
char[] strch=str.toCharArray();
for(int i=strch.length-1;i>=0;i--){
strb.append(strch[i]);
}
return strb.toString();
}
public static String reverseRecursively(String str){
if(str.length()<2){
return str;
}
return reverseRecursively(str.substring(1))+str.charAt(0);
}
}