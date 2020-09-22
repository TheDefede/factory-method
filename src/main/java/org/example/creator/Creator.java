package org.example.creator;

import org.example.factory.Product;
import org.example.factory.impl.ProductA;

public abstract class Creator {

    public abstract Product createProduct();

    public void someOperation(){

        System.out.println(createProduct().doStuff());
    }

}
