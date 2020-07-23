class ex1{
public static void main(String args[]){
String s1="Java";
char[] ch=s1.toCharArray();
System.out.println("String are:"+s1);
System.out.println("Duplicate characters are:");
for(int i=0;i<s1.length();i++){
for(int j=i+1;j<s1.length();i++){
if(ch[i]==ch[j]){
System.out.println(ch[j]+" ");
break;
}
}
}
}
}