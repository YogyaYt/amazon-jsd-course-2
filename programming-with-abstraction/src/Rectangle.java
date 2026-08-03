public class Rectangle extends Shape {

    private float width;
    private float height; 

    Rectangle(float w, float h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width=" + this.width + " height=" + this.height);
    }

    @Override
    public float calculateArea() {
        return width * height;
    }

    @Override
    public void lineColor(String lineColor) {
        System.out.println("Line Color choosed is: "+ lineColor);
    }
    @Override
    public float perimeter() {
        return 2*(height+width);
        
    }


}
