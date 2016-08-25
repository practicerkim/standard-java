public class ex3071
{
     public static void main(String[] args)
     {
          int fah=100;
//          float cel=((float)(5/9f)*(fah-32));
          float cel=(int)((5/9f*(fah-32))*100+0.5)/100f;

          System.out.println(cel);

          System.out.println(5/9f);
     }
}
