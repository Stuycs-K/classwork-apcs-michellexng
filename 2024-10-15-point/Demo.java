public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt((a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY())*(a.getY() - b.getY()));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(5,-3);

    System.out.println( p1);
    System.out.println( p4);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println( Point.distance(p2,p4));

// equilateral triangle
    Point e1 = new Point (0,0);
    Point e2 = new Point (2,0);
    Point e3 = new Point (1,Math.sqrt(3));

    System.out.println( distance(e1,e2));
    System.out.println( Point.distance(e2,e3));
    System.out.println( e1.distanceTo(e3));
  }
}