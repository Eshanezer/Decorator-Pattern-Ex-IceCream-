/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author ezer
 */
public class IceCreamShop {
    public static void main(String[] args) {
        IceCream vanila =new Vanila();
        IceCream chocolate =new Chocolate();
        
        vanila.setPrice(250.00);
        chocolate.setPrice(350.00);
        
        IceCream strawberrySause =new StrawberrySause(vanila); // Has-A -> decorator eka add wenna ona object eka parse karanna ona constructer ekata
        strawberrySause.setPrice(150.00);
        
        IceCream peaunutButter=new PeaunutButter(chocolate); // Has-A -> Decorator eka add wenna ona object eka decorator constrcutor ekata pass karanna ona
        peaunutButter.setPrice(157.00);
        
        System.out.println(strawberrySause.getPrice());
        System.out.println(strawberrySause.getDescriptions());
        
        
    }
}
