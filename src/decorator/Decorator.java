package decorator;

public class Decorator {

    public static void main(String[] args) {

        Shape circle = new Circle();
        
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRetangle = new RedShapeDecorator(new Retangle());
        
        Shape Square = new Square();
        
        Shape blueSquare = new BlueShapeDecorator(new Square());
        
        Shape blueRetangle = new BlueShapeDecorator(new Retangle());
        
        System.out.println("Circulo com uma borda normal");
        circle.Draw();

        System.out.println("\nCirculo com uma borda vermelha");
        redCircle.Draw();

        System.out.println("\nretangulo com uma borda vermelha");
        redRetangle.Draw();

        System.out.println("\nQuadrado com uma borda normal");
        Square.Draw();
        
        System.out.println("\nQuadrado com uma borda azul");
        blueSquare.Draw();
        
        System.out.println("\nRetangulo com uma borda azul");
        blueRetangle.Draw();
    }

}
