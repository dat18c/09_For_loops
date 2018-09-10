public class Hundekennel
{
   
   public static void main(String[] args){
      //lav et par hunde
      //brug konstruktør
      Hund hund1 = new Hund();
      Hund hund2 = new Hund("Bernhard", "sort", 12, 35.0);
      
      //udskriv hunde 
      hund1.hundeInfo();
      hund2.hundeInfo();
      
      //sæt attributer for hunde
      //udskift med kald af set metode
      hund1.setNavn("Pluto");
      hund1.setAlder(10);
      hund1.setVaegt(25);
      hund1.setFarve("Orange");
      
      hund2.setHund("Kurt", "Rød", 25, 47.8);
      
      //udskriv hunde
      //udskift med kald af udskriv metode
      hund1.hundeInfo();
      hund2.hundeInfo();
   }
   
}