import java.util.*;
class ex11{
public static void main(String[] args){
ex11 e=new e11();
char ch[]="bananas";
int n=str.length();
System.out.println(e.rduplicate(ch,n));
}

String rduplicate(char str[],int n){
int in=0;
for(int i=0;i<n;i++){
for(int j=0;j<i;j++){
if(str[i]==str[j]){
break;
}
if(j==i){
str[in++]=str[i];
}
}
return String.valueOf(Arrays.copyOf(str,in));
}
}
}