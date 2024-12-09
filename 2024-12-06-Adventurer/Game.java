import java.util.Scanner;
public class Game{
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    Adventurer p1 = new CodeWarrior();
    Adventurer p2 = new Warrior("Tim");
    System.out.println(p1.getName()+", "+p1.getHP()+"/"+p1.getmaxHP()+" HP, "+p1.getSpecial()+"/"+p1.getSpecialMax()+" "+p1.getSpecialName());
    System.out.println(p2.getName()+", "+p2.getHP()+"/"+p2.getmaxHP()+" HP, "+p2.getSpecial()+"/"+p2.getSpecialMax()+" "+p2.getSpecialName());
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String move = userInput.nextLine();
    action(p1, p2, move);
  }
  public static void action(Adventurer p1, Adventurer p2, String move){
    if (move.equals("a")){
      System.out.println(p1.attack(p2));
    }
    if (move.equals("sp")){
      System.out.println(p1.specialAttack(p2));
    }
    if (move.equals("su")){
      System.out.println(p1.support(p2));
    }
    if (move.equals("quit")){
      System.out.println("Game over");
      return;
    }
    // else {
    //   System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    // }
  }
}
