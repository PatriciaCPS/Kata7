
package kata7.componentfactories.regionalcomponentfactories;

import kata7.componentfactories.ComponentFactory;
import kata7.toyproducts.components.Engine;
import kata7.toyproducts.components.RotorBlade;
import kata7.toyproducts.components.Wheel;
import kata7.toyproducts.components.asian.AsianEngine;
import kata7.toyproducts.components.asian.AsianRotorBlade;
import kata7.toyproducts.components.asian.AsianWheel;

/**
 *
 * @author Patricia
 */
public class AsianComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        return new AsianEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AsianRotorBlade();
    }
    
}
