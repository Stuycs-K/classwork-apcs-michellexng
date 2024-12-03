public class ColorDemo{
  public static void main(String[] args){
    for(int r = 0; r < 256; r+=40){
      for(int g = 0; g <= 256; g+=40){
        for(int b = 0; b <= 256; b+=40){
        System.out.print("\u001b[96;1;" + r +";" + g + ";" + b + ";1mTEXT");
      }
    }
    System.out.println();
  }
}
}
