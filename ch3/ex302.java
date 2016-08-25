public class ex302
{
     public static void main(String[] args)
     {
          int num=140;
          int size=10;

          int numofbas= (num%size==0) ? (num/size):(num/size+1);
          int numofbas= num/size + (num%size==0?0:1);

          System.out.println(numofbas);
     }
}
