public class Driver extends Text{
    public static void topBorder(){
        go(1,1);
        color(MAGENTA,background(CYAN),BRIGHT);
        for (int i = 0; i < 80; i++){
            System.out.print("~");
        }
        System.out.println(RESET);
    }

    public static void bottomBorder(){
        go(30,1);
        color(RED,background(GREEN),BRIGHT);
        for (int i = 0; i < 80; i++){
            System.out.print("~");
        }
        System.out.println(RESET);
    }

    public static void leftRightBorder(){
        go(2,1);
        for (int i = 2; i < 29; i++){
            color(BLACK,background(YELLOW),BRIGHT);
            System.out.print("~");
            erase(i, 2, 79);
            go(i,80);
            color(WHITE,background(BLUE),BRIGHT);
            System.out.print("~");
        }
        color(BLACK,background(YELLOW),BRIGHT);
        System.out.print("~");
        go(29,80);
        color(WHITE,background(BLUE),BRIGHT);
        System.out.print("~");
        System.out.println(RESET);
    }

    public static void integers(){
        int[] random = new int[3];
        for (int i = 0; i < random.length; i++){
            random[i] = (int) (Math.random()*100);
        }
        go(2,20);
        if (random[0] < 25){
            color(RED,BRIGHT);
        }
        else if (random[0] > 75){
            color(GREEN,BRIGHT);
        }
        System.out.println(random[0]);
        System.out.println(RESET);
        go(2,40);
        if (random[1] < 25){
            color(RED,BRIGHT);
        }
        else if (random[1] > 75){
            color(GREEN,BRIGHT);
        }
        System.out.println(random[1]);
        System.out.println(RESET);
        go(2,60);
        if (random[2] < 25){
            color(RED,BRIGHT);
        }
        else if (random[2] > 75){
            color(GREEN,BRIGHT);
        }
        System.out.println(random[2]);
        System.out.println(RESET);
    }

    public static void horizontal(){
        go(3,2);
        color(RED,DARK);
        for (int i = 0; i < 78; i++){
            System.out.print("-");
        }
        System.out.println(RESET);
    }

    public static void main(String[] args){
        System.out.println(CLEAR_SCREEN);
        topBorder();
        bottomBorder();
        leftRightBorder();
        integers();
        horizontal();
        go(31,1);
    }
}
