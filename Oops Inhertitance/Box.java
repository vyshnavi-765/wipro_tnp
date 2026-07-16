public class Box {
    double width, height, depth;

    // Constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        Box b = new Box(5, 4, 3);

        System.out.println("Width : " + b.width);
        System.out.println("Height : " + b.height);
        System.out.println("Depth : " + b.depth);
        System.out.println("Volume : " + b.volume());
    }
}