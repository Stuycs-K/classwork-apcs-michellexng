import java.util.Random;
public class Warrior extends Adventurer{
  private int rage, maxRage;

  public Warrior(String name){
    super(name);
    rage = 10;
    maxRage = 10;
  }

  public Warrior(String name, int hp){
    super(name, hp);
    maxRage = 10;
    rage = maxRage;
  }

  public Warrior(String name, int hp, int rage){
    super(name, hp);
    rage = rage;
    maxRage = rage;
  }

  public String getSpecialName(){
    return "rage";
  }
  public int getSpecial(){
    return this.rage;
  }
  public void setSpecial(int n){
    rage = n;
  }
  public int getSpecialMax(){
    return maxRage;
  }

  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    int lost = (int) (Math.random()*4);
    other.setHP(other.getHP() - lost);
    return other.getName() + " has lost " + lost +"HP. "+other.getName()+"'s HP: "+other.getHP();
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    int gain = (int) (Math.random()*5);
    other.setHP(other.getHP() + gain);
    return other.getName() + " has gained " + gain +"HP. "+other.getName()+"'s HP: "+other.getHP();
  }

  //heall or buff self
  public String support(){
    int gain = getmaxHP()-(getHP()/2);
    this.setHP(getHP() + gain);
    return getName() + " has gained " + gain+"HP. "+getName()+"'s HP: "+getHP();
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    int lost = (int) (Math.random()*10);
    setSpecial(getSpecial() - 1);
    other.setHP(other.getHP() - lost);
    return other.getName()+" has lost "+lost+"HP. "+getName()+" has "+getSpecial()+getSpecialName();
  }
}
