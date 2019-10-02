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
public class Vanila extends IceCream{
    @Override
    public String getDescriptions() {
        return "Vanila IceCream";
    }

    public void setPrice(Double Price) {
        this.Price=Price;
    }

    @Override
    public Double getPrice() {
        return this.Price; 
    }
    
    
    
}
