/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author G-fire
 */
public class BlueShapeDecorator extends ShapeDecorator{
    
    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    
     public void Draw() {
        decoratedShape.Draw();
        setBlueBorder(decoratedShape);
    }
     
     private void setBlueBorder(Shape decoratedShape) {
        System.out.println("Cor da Borda: Azul");
    }
    
}
