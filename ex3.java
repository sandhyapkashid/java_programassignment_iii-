class ex3{
public static void main(String args[]){
String str="Morning";
System.out.println("the given string is="+str);
for(int i=0;i<str.length();i++){
boolean b=true;
for(int j=0;j<str.length();j++){
if(i!=j&&str.charAt(i)==str.charAt(j)){
b=false;
break;
}
}
if(b){
System.out.println("The first non repeated character is="+str.charAt(i));
break;
}
}
}
}
