public class Hund
{
   
   //private felter
   private String navn = "";
   private String farve = "";
   private int alder = 0;
   private double vaegt = 10.0;
   
   //konstruktør
   public Hund()
   {
      navn = "Viggo";
      farve = "brun";
      alder = 0;
      vaegt = 12.0;
   }
   
   public Hund(String name, String farve, int alder, double vaegt)
   {
      navn = name;
      this.farve = farve;
      this.alder = alder;
      this.vaegt = vaegt;
   }
   
   //set metoder - Mutators
   public void setNavn(String name)
   {
      navn = name;
   }
   public void setFarve(String color)
   {
      farve = color;
   }
   
   public void setAlder(int age)
   {
      alder = age;
   }
   
   public void setVaegt(double weigth)
   {
      vaegt = weigth;
   }
   //set metode med alle parametre
   public void setHund(String name, 
                        String color, int age, double weight)
   {
      navn = name;
      farve = color;
      alder = age;
      vaegt = weight;
   }
   
   //metode til udskrift af hunde
   public void hundeInfo(){
      System.out.println("Navn:\t\t" + navn);
      System.out.println("Farve:\t" + farve);
      System.out.println("Alder:\t" + alder + " år");
      System.out.println("Vægt:\t\t" + vaegt + " kg\n");
   }
   
}