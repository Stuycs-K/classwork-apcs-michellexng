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

    public static void main(String[] args){
        System.out.println(CLEAR_SCREEN);
        topBorder();
        bottomBorder();
        leftRightBorder();
        System.out.println(HIDE_CURSOR);
    }
}
