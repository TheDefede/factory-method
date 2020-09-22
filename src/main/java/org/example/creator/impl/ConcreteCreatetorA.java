package org.example.creator.impl;

import org.example.creator.Creator;
import org.example.factory.Product;
import org.example.factory.impl.ProductA;

public class ConcreteCreatetorA extends Creator {

    Product product = new ProductA();

    @Override
    public Product createProduct() {
        return product;
    }
}
