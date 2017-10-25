/**
 * Created by Emil Käck on 2017-10-25.
 */
public class Rectangle {

    private float length;
    private float width;

    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength(){
        return length;
    }

    public float setLength(float length){
        return this.length = length;
    }

    public float setWidth(float width){
        return this.width = width;
    }

    public float getWidth(){
        return width;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return (width * 2) + (length * 2);
    }

    public String toString(){
        return "Rectangle[width = " + width + " length = " + length + "]";
    }
}
