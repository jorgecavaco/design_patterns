package com.github.visitor;

interface Element {
    void accept(Visitor v);
}