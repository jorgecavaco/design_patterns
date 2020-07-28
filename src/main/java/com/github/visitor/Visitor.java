package com.github.visitor;

interface Visitor {
    void visit(FOO foo);

    void visit(BAR bar);

    void visit(BAZ baz);
}
  