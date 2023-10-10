public class Circle extends GeometricShape {
    private double radius;

    public Circle(String name, double area, double radius) {
        super(name, area);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Area: " + getArea() + ", Radius: " + getRadius();
    }
}
