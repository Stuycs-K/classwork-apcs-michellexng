import java.util.Scanner;
public class Game{
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    Adventurer p1 = new CodeWarrior();
    Adventurer p2 = new Warrior("Tim");
    System.out.println(p1.getName()+", "+p1.getHP()+"/"+p1.getmaxHP()+" HP, "+p1.getSpecial()+"/"+p1.getSpecialMax()+" "+p1.getSpecialName());
    System.out.println(p2.getName()+", "+p2.getHP()+"/"+p2.getmaxHP()+" HP, "+p2.getSpecial()+"/"+p2.getSpecialMax()+" "+p2.getSpecialName());
    while (true){

      if (p1.getHP() <= 0){
        System.out.println(p1.getName()+" is dead. Game over!");
        return;
      }
      else if (p2.getHP() <= 0){
        System.out.println(p2.getName()+" is dead. Game over!");
        return;
      }

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String move = userInput.nextLine();

      if (move.equals("quit")){
        System.out.println("Game over!");
        return;
      }
      boolean valid = false;
      if (move.equals("a")||move.equals("sp")||move.equals("su")){
        action(p1, p2, move);
        valid = true;
      }
      else {
        System.out.println("Try again.");
      }

      if (valid && p2.getHP()>0){
        String[] moves = {"a", "sp", "su"};
        String randomMove = moves[(int)(Math.random()*moves.length)];
        action(p2, p1, randomMove);
      } 
    }
  }
  public static void action(Adventurer p1, Adventurer p2, String move){
    if (move.equals("a")){
      System.out.println(p1.attack(p2));
    }
    if (move.equals("sp")){
      System.out.println(p1.specialAttack(p2));
    }
    if (move.equals("su")){
      System.out.println(p1.support());
    }
  }
}
