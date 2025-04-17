package com.telran.prof.lessoons.hw.hw13;

import lombok.ToString;
import java.util.List;

@ToString
public class Storage <T extends Product>{

    final List<T> products;

    //logic to storage and get
    // store elements in list
    //PECS

    public Storage(List<T> products) {
        this.products = products;
    }

    public void storage (T product) {
        products.add(product);
    }

    public T get (int index) {
        return products.get(index);
    }
}
