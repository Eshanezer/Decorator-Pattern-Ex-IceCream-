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
public class Chocolate extends IceCream {

    @Override
    public String getDescriptions() {
        return "Chocolate Icecream";
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    @Override
    public Double getPrice() {
        return Price;
    }

}
