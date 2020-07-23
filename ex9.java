import java.util.*;
class ex9{
public static void main(String args[]){
String str="ABC";
int n=str.length();
ex9 e=new ex9();
e.permute(str,0,n-1);
}
public void permute(String str,int l, int r)
{
if(l==r)
System.out.println(str);
else
{
for(int i=0;i<=r;i++){
str=swap(str,l,i);
permute(str,l+1,r);
str=swap(str,l,i);
}
}
}
String swap(String a,int i,int j){
char temp;
char[] chArray=a.toCharArray();
temp=chArray[i];
chArray[i]=chArray[j];
chArray[j]=temp;
return String.valueOf(chArray);
}
}