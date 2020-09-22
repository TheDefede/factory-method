package org.example;

import org.example.creator.Creator;
import org.example.creator.impl.ConcreteCreatetorA;
import org.example.creator.impl.ConcreteCreatorB;
import org.example.factory.Product;

public class App {
    public static void main(String[] args) {

        Creator creatorA = new ConcreteCreatetorA();

        Creator creatorB = new ConcreteCreatorB();

        creatorA.someOperation();

        creatorB.someOperation();

    }
}
