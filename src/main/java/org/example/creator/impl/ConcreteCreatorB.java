package org.example.creator.impl;

import org.example.creator.Creator;
import org.example.factory.Product;
import org.example.factory.impl.ProductB;

public class ConcreteCreatorB extends Creator {

    Product product = new ProductB();

    @Override
    public Product createProduct() {
        return product;
    }
}
