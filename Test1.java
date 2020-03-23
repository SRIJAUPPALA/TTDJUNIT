import java.util.*;
class Test1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
String str1="";
for(int i=0;i<str.length();i++)
{
if(i=0||i==1)
{if(str.charAt(i)!='A')
str1+=str.charAt(i);
}
else
str1+=str.charAt(i);
}
System.out.println(str1);
}
}