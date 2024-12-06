public class Warrior extends Adventurer{
  private int rage;

  public Warrior(String name){
    super(name);
  }

  public String getSpecialName(){
    return "rage";
  }
  public int getSpecial(){
    return 50;
  }
  public void setSpecial(int n){
    this.rage = n;
  }
  public int getSpecialMax(){
    return 100;
  }
}
