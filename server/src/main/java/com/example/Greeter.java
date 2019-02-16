package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param Someone name of the person
   * @return Greeting String
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
