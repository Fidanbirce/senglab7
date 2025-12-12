public class Testing2 {
    public static void main(String[] args) {

        Circle c1 = new Circle(5, "red", true);
        c1.printCircle();
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Diameter: " + c1.getDiameter());

        System.out.println("--------------------");

        Rectangle r1 = new Rectangle(4, 6, "blue", false);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
    }
}

