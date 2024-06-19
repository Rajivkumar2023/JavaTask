class Box {
    public double width, height, depth;
    Box(){
        width = 4.0;
        height = 5.0;
        depth = 3.0;
    }
    public double volume(){
        double u = width*height*depth;
        return u;
    }
}
public class MainClass{
    public static void main(String[] args){
        Box b1 = new Box();
        System.out.println("Box1 volume = " + b1.volume());
        Box b2 = new Box();
        System.out.println("Box2 volume = " + b2.volume());
    }
}


