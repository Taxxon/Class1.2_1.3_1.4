/**
 * Created by Emil Käck on 2017-10-25.
 */
public class Circle {

    double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getCircumference(){
        double circumference = (radius + radius) * Math.PI;
        return circumference;
    }

    public String toString(){
        return "Circle[radius = " + radius + "]";
    }
}
