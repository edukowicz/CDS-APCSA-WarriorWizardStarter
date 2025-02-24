public class Wizard extends Player
{
   private double spellDef;

   public Wizard()
   {
      super("Wizard");
      spellDef = 7.6;
   }

   
   //when instructed, add a get method for the spellDef PIV
   public double getSpellDef() {
      return spellDef;
   }



   //when instructed, modify toString to display the spellDef PIV in the output
   public String toString()
   {
      String output = super.toString() + "\n" + "Spell Defence: " + spellDef;
      return output;
   }


}