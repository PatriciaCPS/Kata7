
package kata7.Factories;

import kata7.toyproducts.Toy;

public abstract class ToyFactory {
    private Toy toy;
   
   
    public Toy produceToy(Integer serialNumber ){
        toy = this.createToy(serialNumber);
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy (Integer serialNumber);
}
