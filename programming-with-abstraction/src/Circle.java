public class Circle extends Shape {
    private float radius;

    Circle(float r){
        this.radius = r;
    }
    @Override
    public float calculateArea(){
        return (float)Math.PI*this.radius*this.radius;
    }
    @Override
    public void draw(){
        System.out.println("Drawing circles with radius: " + this.radius);
    }
    @Override
    public void lineColor(String lineColor) {
        System.out.println("Line color is: "+ lineColor);
    }
    @Override
    public float perimeter() {
        return 2*(float)Math.PI*this.radius;
        
    }
}