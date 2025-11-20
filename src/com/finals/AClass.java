/**
 * Java program to demonstrate final classes can not be extended.
 */

package com.finals;

/**
 * Main class.
 */
public class AClass {

    final void method1() {

        System.out.println("This is a final method.");

    }
}

class Bclass extends AClass {

    @Override
    void method1() {

        // Compile-error because method is final
        System.out.println("We cannot override final method.");

    }
}