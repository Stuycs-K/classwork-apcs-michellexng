import java.util.Random;
public class Driver{
    public static void main(String[] args){
        Adventurer p1 = new Warrior("Harry", 35);
        Adventurer p2 = new Warrior("Alex", 50);
        System.out.println(p1.attack(p2));
        Adventurer p3 = new Warrior("Molly", 31, 23);
        Adventurer p4 = new Warrior("Max", 2343, 344);
        System.out.println(p3.support(p4));
        Adventurer p5 = new Warrior("Joy");
        Adventurer p6 = new Warrior("John");
        System.out.println(p5.attack(p6));
        System.out.println(p5.support(p6));
        Adventurer p7 = new Warrior("Nicole", 18, 352);
        Adventurer p8 = new Warrior("Leila", 903, 1394);
        System.out.println(p8.specialAttack(p7));
        Adventurer p9 = new Warrior("Penny", 2029);
        System.out.println(p2.support());
        System.out.println(p2.specialAttack(p9));
        System.out.println(p9.support());
    }
}