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
public abstract class IceCreamDecorator extends IceCream{

    public Double Price;
    public IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    
    
    public String getDescriptions(){
        return iceCream.getDescriptions();
    };

    public Double getPrice() {
        return Price;
    }

    ;
     public void setPrice(double Price) {
        this.Price = Price;
    }
;

}
