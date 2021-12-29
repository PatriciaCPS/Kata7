
package kata7.toyproducts.models;

import kata7.componentfactories.ComponentFactory;
import kata7.componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import kata7.toyproducts.Toy;
import kata7.toyproducts.components.Engine;
import kata7.toyproducts.components.Wheel;

/**
 *
 * @author Patricia
 */
public class AmericanCarToy implements Toy{

    private final Integer serialNumber; 
    private final String type = "Car";
    private Wheel wheels[]= new Wheel[4];
    private Engine engine;
    final private ComponentFactory factory;
    
    public AmericanCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory= new AmericanComponentFactory();
        
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
        this.engine = this.factory.createEngine();
        for(int i = 0; i< this.wheels.length-1; i++){
            this.wheels[i] = this.factory.createWheel();
        }
    }
    
}
