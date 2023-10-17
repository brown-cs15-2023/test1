package lab5merging;

import cs15.labs.cupcakeSupport.CS15CupcakeFrame;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This is (almost) the solution code for the second lab - it's up to you to fix it!
 */
public class App extends Application {

  @Override
  public void start(Stage stage) {
    // This sets up the empty GUI (Graphical User Interface) frame!
    new CS15CupcakeFrame(stage);
    new CupcakeShop();
  }

  /*
   * This is the main method. Don't worry about it, as it just makes an
   * instance of the App class.
   *
   * DO NOT CHANGE THIS CODE.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
