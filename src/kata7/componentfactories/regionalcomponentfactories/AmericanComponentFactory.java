
package kata7.componentfactories.regionalcomponentfactories;

import kata7.componentfactories.ComponentFactory;
import kata7.toyproducts.components.Engine;
import kata7.toyproducts.components.RotorBlade;
import kata7.toyproducts.components.Wheel;
import kata7.toyproducts.components.american.AmericanEngine;
import kata7.toyproducts.components.american.AmericanRotorBlade;
import kata7.toyproducts.components.american.AmericanWheel;

/**
 *
 * @author Patricia
 */
public class AmericanComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        return new AmericanEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AmericanRotorBlade();
    }
    
}
