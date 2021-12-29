
package kata7.Factories.Regionalfactories;

import kata7.Factories.ToyFactory;
import kata7.toyproducts.Toy;
import kata7.toyproducts.models.AmericanCarToy;


public class AmericanCarToyFactory extends ToyFactory {
    @Override
    public Toy createToy(Integer serialNumber){
        return new AmericanCarToy( serialNumber);
    }
}
