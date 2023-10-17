package lab5merging;

import cs15.labs.cupcakeSupport.CS15Cupcake;
import cs15.labs.cupcakeSupport.CS15Decorator;
import cs15.labs.cupcakeSupport.CupcakeShopSupport;

/**
 * This is our top-level class that represents a CupcakeShop!
 */
public class CupcakeShop extends CupcakeShopSupport {

    private Baker yuh;
    private CS15Decorator aDecoratorButReallyPoorlyNamedSoPleaseChangeItPlease;

    public CupcakeShop() {
        super();

        this.openShop();
        this.yuh = new Baker();
        this.aDecoratorButReallyPoorlyNamedSoPleaseChangeItPlease = new CS15Decorator();
    }

    @Override
    public void order1() {
        // AAAAAAAAAAAAAAAAAAA you've fallen into a trap
    }

    @Override
    public void order2() {
        CS15Cupcake vanillaFrostedCupcake = this.yuh.bakeVanillaFrostedCupcake();
        this.displayPrice(vanillaFrostedCupcake);
        this.displayShopUpdate(this.yuh.getWorkUpdate());
    }

    @Override
    public void order3() {
        CS15Cupcake vanillaFrostedCupcake = this.yuh.bakeVanillaFrostedCupcake();
        this.aDecoratorButReallyPoorlyNamedSoPleaseChangeItPlease.addCherry(vanillaFrostedCupcake);
        this.displayPrice(vanillaFrostedCupcake);
        this.displayShopUpdate(this.yuh.getWorkUpdate());
    }

    @Override
    public void order4() {
        CS15Cupcake chocolateFrostedCupcake = this.yuh.bakeChocolateFrostedCupcake();
        this.displayPrice(chocolateFrostedCupcake);
        this.displayShopUpdate(this.yuh.getWorkUpdate());
    }

    @Override
    public void order5() {
        CS15Cupcake chocolateFrostedCupcake = this.yuh.bakeChocolateFrostedCupcake();
        this.aDecoratorButReallyPoorlyNamedSoPleaseChangeItPlease.addSprinkles(chocolateFrostedCupcake);
        this.displayPrice(chocolateFrostedCupcake);
        this.displayShopUpdate(this.yuh.getWorkUpdate());
    }
}
