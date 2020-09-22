package org.example.factory.impl;

import org.example.factory.Product;

public class ProductA implements Product {
    @Override
    public String doStuff() {
        return "Stuff from productA";
    }
}
