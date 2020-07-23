import java.util.*;
class ex2{
 static void isAnagram(String str1,String str2){
String s1=str1.replaceAll("\\s","");
String s2=str2.replaceAll("\\s","");
boolean st=true;
if(s1.length()!=s2.length()){
st=false;
char[] ArrayS1=s1.toLowerCase().toCharArray();
char[] ArrayS2=s2.toLowerCase().toCharArray();
Arrays.sort(ArrayS1);
Arrays.sort(ArrayS2);
st=Arrays.equals(ArrayS1,ArrayS2);
}
if(st){
System.out.println(s1+"\tand\t"+s2+"\tare anagarams");
}else{
System.out.println(s1+"and"+s2+"are not anagrams");
}
}
public static void main(String args[]){
isAnagram("Keep","Peek");
}
}


