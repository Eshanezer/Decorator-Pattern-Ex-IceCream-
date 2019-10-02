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
public class StrawberrySause extends IceCreamDecorator {

    public StrawberrySause(IceCream iceCream) { // Decorator eka add wenna ona object eka constructor ekat enawa eka alla gannawa ... Super class ekin allan inna ona ekai
                                        // Mokaka awath allan inna eke sub ekak nisa aualak na
        super(iceCream);
    }
    @Override
    public String getDescriptions() {
        return "StrawberrySause Decorator with" + iceCream.getDescriptions();
    }

    public void setPrice(double Price) {
        this.Price=Price;
    }
    
    public Double getPrice() {
        return Price+iceCream.getPrice();
    }
    
    
}
