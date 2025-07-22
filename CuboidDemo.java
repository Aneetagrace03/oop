import java.util.*;

class Cuboid {
    double length, breadth, height;

    void setDimension(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double calculateVolume() {
        return height * breadth * length;
    }

    double calculateSurfaceArea() {
        return 2 * (length * breadth + height * breadth + length * height);
    }
}

public class CuboidDemo {
    public static void main(String[] args) {
        System.out.println("Enter length, breadth, height:");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();

        Cuboid mybox = new Cuboid();
        mybox.setDimension(length, breadth, height);

        double volume = mybox.calculateVolume();
        System.out.println("Volume of the cuboid is: " + volume);

        double surfaceArea = mybox.calculateSurfaceArea();
        System.out.println("Surface area of the cuboid is: " + surfaceArea);
    }
}
   