
package decorator;


public class Decorator {

    public static void main(String[] args) {
        
        Shape circle = new Circle();
        
        Shape redCircle = new RedShapeDecorator(new Circle());
        
        Shape redRetangle = new RedShapeDecorator(new Retangle());
        System.out.println("Circulo com uma borda normal");
        circle.Draw();
        
        System.out.println("\nCirculo com uma borda vermelha");
        redCircle.Draw();
        
        System.out.println("\nretangulo com uma vermelha normal");
        redRetangle.Draw();

        
    }
    
}
