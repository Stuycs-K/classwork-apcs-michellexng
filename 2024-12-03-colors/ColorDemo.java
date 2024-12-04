public class ColorDemo{
  public static void main(String[] args){
    int n = 0;
    while (n < 10){
      for (int i = 30; i < 38; i++){
        System.out.print("\u001b[1;+"+i+"m~~~~~~~~~~~");
        System.out.print("\u001b[+"+(i+12)+"m~~~~~~~~~~~");
      }
      for (int i = 90; i < 98; i++){
        System.out.print("\u001b[1;+"+i+"m~~~~~~~~~~~");
        System.out.print("\u001b[+"+(i+12)+"m~~~~~~~~~~~");
      }
      n++;
    }
  }
}
  