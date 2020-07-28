package com.github.prototype;

public interface Prototype {

    String getName();

    Prototype clone();

    void execute();
}
