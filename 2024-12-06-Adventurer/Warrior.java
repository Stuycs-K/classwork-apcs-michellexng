import java.util.Random;
public class Warrior extends Adventurer{
  private int rage, maxRage;

  public Warrior(String name){
    super(name);
    this.rage = 10;
    this.maxRage = 10;
  }

  public Warrior(String name, int hp){
    super(name, hp);
    this.maxRage = 10;
    this.rage = maxRage;
  }

  public Warrior(String name, int hp, int rage){
    super(name, hp);
    this.rage = rage;
    this.maxRage = rage;
  }

  public String getSpecialName(){
    return "rage";
  }
  public int getSpecial(){
    return this.rage;
  }
  public void setSpecial(int n){
    this.rage = n;
  }
  public int getSpecialMax(){
    return this.maxRage;
  }

  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    int lost = other.getHP()/2;
    other.setHP(other.getHP() - lost);
    return other.getName() + " has lost " + lost +".";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    int gain = other.getmaxHP()-other.getHP();
    other.setHP(other.getHP() + gain);
    return other.getName() + " has gained " + gain +".";
  }

  //heall or buff self
  public String support(){
    int gain = this.getmaxHP()-(this.getHP()/2);
    this.setHP(this.getHP() + gain);
    return this.getName() + " has gained " + gain+".";
  }

  //hurt or hinder the target adventurer, consume some special resource
  // public String specialAttack(Adventurer other){
  //   int consumed = other.getSpecial()/3;
  //   this.setSpecial = this.getSpecial() + consumed;
  //   other.setSpecial = other.getSpecial() - consumed;
  //   String specialString = this.getName() +" consumed "+consumed+" of "other.getName()+"'s "+other.getSpecialName();
  //   return attack(other) + specialString;
  // }
}
