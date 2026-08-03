import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {

        System.out.println("Calculating area of Rectangle....");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input width:");
        float w = keyboard.nextFloat();
        System.out.println("Input height:");
        float h = keyboard.nextFloat();
        Rectangle rct = new Rectangle(w, h);    
        rct.draw();
        System.out.println("Area: "+ rct.calculateArea());
        System.out.println("Perimeter is: "+ rct.perimeter());
        System.out.println("Input line color:");
        String lineColor = keyboard.next();
        rct.lineColor(lineColor);

        System.out.println("Calculating area of Circle....");
        System.out.println("Enter the radius: ");
        float r = keyboard.nextFloat();
        Circle cr = new Circle(r);
        cr.draw();
        System.out.println("Area of circle is: " +cr.calculateArea());
        System.out.println("Perimeter is: "+ cr.perimeter());
        System.out.println("Enter line color: ");
        String lc = keyboard.next();
        cr.lineColor(lc);
    }
    
}
