public class ForLoop
{

   public static void main(String[] args)
   {
      for(int i=0;i<10;i++)
      {
         System.out.print("*");      
      }
      
      //blank linie
      System.out.println();
      
      for(int j=0;j<10;j++)
      {
         System.out.println(j);
      }
      //j out of scope
      //System.out.println(j);
      
      //kald metode med parameteren 3
      minPrint(3);
      
   }

   //metode der kan kaldes fra main
   public static void minPrint(int mitParameter)
   {
      
   }

}