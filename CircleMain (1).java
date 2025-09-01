class Circle {
    int radius;
    double pi = 3.14;
     void setDimension(int r) {
        radius = r;
    }

    float area() {
        return pi * radius * radius;
    }

    float circumference() {
        return 2 * pi * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}

