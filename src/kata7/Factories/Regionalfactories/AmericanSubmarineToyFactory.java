
package kata7.Factories.Regionalfactories;

import kata7.Factories.ToyFactory;
import kata7.toyproducts.Toy;
import kata7.toyproducts.models.AmericanSubmarineToy;


public class AmericanSubmarineToyFactory extends ToyFactory {
    @Override
    public Toy createToy(Integer serialNumber){
        return new AmericanSubmarineToy( serialNumber);
    }
}
