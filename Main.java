//Warrior Wizard Starter              A+CR
public class Main 
{
  public static void main(String[] args) 
  {
     //Instantiating and testing a Player object
     System.out.println("Testing Player Object - Warrior argument");
     Player player1 = new Player("Warrior");
     System.out.println(player1);
     System.out.println(player1.getRole());
     System.out.println(player1.getH());
     System.out.println();
     
     
     //Instantiating and testing a Warrior Object  
     System.out.println("Testing Warrior Object");
     Warrior player2 = new Warrior();
     System.out.println(player2);
     System.out.println(player2.getRole());
     System.out.println(player2.getH());
     System.out.println();

     
    //Instantiating and Testing a Wizard Object
     System.out.println("Testing Wizard Object");
     Wizard player3 = new Wizard();
     System.out.println(player3);
     System.out.println(player3.getRole());
     System.out.println(player3.getH());
     System.out.println();

     
    //Testing Modified Warrior
     System.out.println("Testing Updated Warrior Object");
     Warrior player4 = new Warrior();
     System.out.println(player4);
     System.out.println(player4.getArmor());
     System.out.println();
     
    //Testing Modified Wizard 
     System.out.println("Testing Updated Wizard Object");
     Wizard player5 = new Wizard();
     System.out.println(player5);
     System.out.println(player5.getSpellDef());
     System.out.println();
     
     
  }
}