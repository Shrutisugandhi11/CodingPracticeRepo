package org.example.design_pattern.factory;

public class FruitFactory {
    
    public Fruit getInstance(String string){
        Fruit fruit = null;
        if(string.equalsIgnoreCase("orange")){
            fruit=new Orange();
        } else if (string.equalsIgnoreCase("grape")) {
            fruit=new Grape();
        } else if (string.equalsIgnoreCase("cherry")) {
            fruit=new Cherry();
        }
        return fruit;
    }
}
