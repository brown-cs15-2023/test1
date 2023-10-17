package lab5merging;

import cs15.labs.cupcakeSupport.CS15Cupcake;

/**
 * This class represents our Baker, who will bake cupcakes on command!
 */
public class Baker {

  private int _numcupcakes;

  public Baker() {
    this._numcupcakes = 0;
  }

  public CS15Cupcake bakeChocolateFrostedCupcake() {
    CS15Cupcake newCupcake = new CS15Cupcake();
    newCupcake.addChocolateFrosting();
    this._numcupcakes++;
    return newCupcake;
  }

  public CS15Cupcake bakeVanillaFrostedCupcake() {
    CS15Cupcake newCupcake = new CS15Cupcake();
    newCupcake.addVanillaFrosting();
    this._numcupcakes++;
    return newCupcake;
  }

  public String getWorkUpdate() {
    return "The baker has made " + this._numcupcakes + " cupcakes";
  }
}
