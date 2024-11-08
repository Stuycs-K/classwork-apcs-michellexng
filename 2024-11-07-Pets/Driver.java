//Before overriding getName(), speak() returns only the name of the bird as it would if the object type was an Animal. After 
//overriding getName(), speak() returns "The Mighty " before the name of the bird. When a method is overidden, the version 
//of the method defined in the superclass isn't used, but instead the version of the method defined in the subclass is used.
//Bird b2 = new Animal(...); didn't work because it isn't true that Animal is-A Bird, so Animal cannot 
//be stored in a Bird variable type. The Bird is the subclass of the superclass Animal, so Animal may 
//lack properties (height, color) that the Bird class has, making Animal an invalid object type here.
public class Driver {

  public static void main (String[] args){
    Animal a = new Animal("Hello", 78, "jeremy");
    a.speak();
    Animal b = new Bird("chirp", 10, "bob", 30.5, "blue");
    b.speak();

    Animal a1 = new Animal("Hey", 15, "alex");
    a1.speak();
    Bird b1 = new Bird("Cheep", 3, "polly", 50, "red");
    b1.speak();
    //Bird b2 = new Animal("squawk", 16, "molly");
    Animal a2 = new Bird("squeak", 4, "bloomie", 2, "pink");
    a2.speak();
  }


}
