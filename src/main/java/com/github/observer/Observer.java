package com.github.observer;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
