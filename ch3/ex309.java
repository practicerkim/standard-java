public class ex309
{
     public static void main(String[] args)
     {
          char ch='3';
          boolean b=((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9'));
          //boolean b=((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'));
          System.out.println(b);
     }
}
