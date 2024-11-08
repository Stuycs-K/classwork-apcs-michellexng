//Before overriding getName(), speak() returns only the name of the bird as it would if the object type was an Animal. After 
//overriding getName(), speak() returns "The Mighty " before the name of the bird. When a method is overidden, the version 
//of the method defined in the superclass isn't used, but instead the version of the method defined in the subclass is used.
public class Driver {

  public static void main (String[] args){
    Animal a = new Animal("Hello", 78, "jeremy");
    a.speak();
    Animal b = new Bird("chirp", 10, "bob", 30.5, "blue");
    b.speak();

  }


}
