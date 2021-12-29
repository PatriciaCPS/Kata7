
package kata7.componentfactories;

import kata7.toyproducts.components.Engine;
import kata7.toyproducts.components.RotorBlade;
import kata7.toyproducts.components.Wheel;

/**
 *
 * @author Patricia
 */
public abstract class ComponentFactory {
    public abstract Wheel createWheel();
    public abstract Engine createEngine();
    public abstract RotorBlade createRotorBlade();
}
