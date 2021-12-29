
package kata7.toyproducts.models;

import kata7.toyproducts.Toy;
import kata7.toyproducts.components.Engine;

/**
 *
 * @author Patricia
 */
public class AmericanSubmarineToy implements Toy{

    private final Integer serialNumber; 
    private final String type = "submarine";
    private Engine engine;

    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    
    
    @Override
    public void pack() {
        System.out.println("El " + type + " con el número de serie " 
                +serialNumber.toString() +" está empaquetado para el"
                        + " sector americano");
    }

    @Override
    public void label() {
        System.out.println("El " + type  +" con el número de serie " 
                +serialNumber.toString() +" está empaquetado para el "
                        + " mercado americano");
    
    }

    @Override
    public void prepare() {
        System.out.println("El " + type  +" con el número de serie " 
                +serialNumber.toString() +" tiene un motor ");
    }
    
}
