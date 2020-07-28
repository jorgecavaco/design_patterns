package com.github.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Element[] list = {new FOO(), new BAR(), new BAZ()};
        UpVisitor up = new UpVisitor();
        DownVisitor down = new DownVisitor();

        for (Element element : list) {
            element.accept(up);
        }

        for (Element element : list) {
            element.accept(down);
        }


/*
        for (Element element : list) {
            if(element instanceof FOO){
                System.out.println("do Down on " + ((FOO)element).getFOO());
            } else if(element instanceof BAR){
                System.out.println("do Down on " + ((BAR)element).getBAR());
            } else {
                System.out.println("do Down on " + ((BAZ)element).getBAZ());
            }
        }
*/
    }
}