public class ex310
{
     public static void main(String[] args)
     {
          char ch='T';
          char lowercase=(ch>='A'&&ch<='Z')?(char)(ch+32):ch;

          System.out.println("ch: "+ch);
          System.out.println("ch to lowercase(소문자인 경우에는 ch를 그대로 출력): "+lowercase);
     }
}
